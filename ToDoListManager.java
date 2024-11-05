
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoListManager {
    private static final String FILE_NAME = "tasks.txt";
    private static List<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        loadTasks();

        while (true) {
            System.out.println("\n--- To-Do List Manager ---");
            System.out.println("1. View tasks");
            System.out.println("2. Add a new task");
            System.out.println("3. Mark a task as completed");
            System.out.println("4. Delete a task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    viewTasks();
                    break;
                case 2:
                    System.out.print("Enter a new task: ");
                    String newTask = scanner.nextLine();
                    addTask(newTask);
                    break;
                case 3:
                    viewTasks();
                    System.out.print("Enter the number of the task to mark as completed: ");
                    int taskIndexComplete = scanner.nextInt();
                    markTaskAsCompleted(taskIndexComplete - 1);
                    break;
                case 4:
                    viewTasks();
                    System.out.print("Enter the number of the task to delete: ");
                    int taskIndexDelete = scanner.nextInt();
                    deleteTask(taskIndexDelete - 1);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    saveTasks();
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }

    // Load tasks from the file
    private static void loadTasks() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String task;
            while ((task = reader.readLine()) != null) {
                tasks.add(task);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No previous tasks found.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Save tasks to the file
    private static void saveTasks() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String task : tasks) {
                writer.write(task);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // View all tasks
    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("\nCurrent Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
            	System.out.println((i + 1) + ". " + tasks.get(i));

            }
        }
    }

    // Add a new task
    private static void addTask(String task) {
        tasks.add(task);
        saveTasks();
        System.out.println("Task added successfully.");
    }

    // Mark a task as completed
    private static void markTaskAsCompleted(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            String completedTask = tasks.get(taskIndex) + " (Completed)";
            tasks.set(taskIndex, completedTask);
            saveTasks();
            System.out.println("Task marked as completed.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    // Delete a task
    private static void deleteTask(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            tasks.remove(taskIndex);
            saveTasks();
            System.out.println("Task deleted.");
        } else {
            System.out.println("Invalid task number.");
           
        }
    }
}

