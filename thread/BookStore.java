package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BookStore {
    private int booksInStock;
    private Lock lock;

    // Constructor
    public BookStore(int initialStock) {
        this.booksInStock = initialStock;
        this.lock = new ReentrantLock();
    }

    // Method to restock
    public void restock(int amount) {
        lock.lock();
        try {
            booksInStock += amount;
            System.out.println("Restocked: " + amount + " books");
            System.out.println("Books in stock after restock: " + booksInStock);
        } finally {
            lock.unlock();
        }
    }

    // Method to purchase
    public void purchase(int amount) {
        lock.lock();
        try {
            if (booksInStock >= amount) {
                booksInStock -= amount;
                System.out.println("Purchased: " + amount + " books");
                System.out.println("Books in stock after purchase: " + booksInStock);
            } else {       System.out.println("Try to Purchase: " + amount + " books");
                System.out.println("Insufficient stock. Purchase cancelled.");
            }
        } finally {
            lock.unlock();
        }
    }
         

    public static void main(String[] args) {
        BookStore store = new BookStore(10);  // Starting with 10 books in stock

        // Threads for restock and purchase
        Thread restockThread1 = new Thread(() -> store.restock(5)); // Restock 5 books
        Thread restockThread2 = new Thread(() -> store.restock(10)); // Restock 10 books
        Thread purchaseThread1 = new Thread(() -> store.purchase(7)); // Purchase 7 books
        Thread purchaseThread2 = new Thread(() -> store.purchase(20)); // Purchase 20 books

        // Start the threads
        restockThread1.start();
        restockThread2.start();
        purchaseThread1.start();
        purchaseThread2.start();
    }
}
