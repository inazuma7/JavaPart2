package exerciseFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Pet {
    private String name;
    private int age;
    private String species;
    private String ownerName;

    public Pet(String name, int age, String species, String ownerName) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.ownerName = ownerName;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public String toString() {
        return "Pet Name: " + name + ", Age: " + age + ", Species: " + species + ", Owner: " + ownerName;
    }
}

// VeterinaryClinic class to manage the list of pets
class VeterinaryClinic {
    private List<Pet> pets;

    public VeterinaryClinic() {
        this.pets = new ArrayList<>();
    }

    // Method to add a pet
    public void addPet(Pet pet) {
        pets.add(pet);
        System.out.println("Pet added: " + pet.getName());
    }

    // Method to list all pets
    public void listAllPets() {
        System.out.println("Listing all pets:");
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }

    // Method to find a pet by name
    public Pet findPetByName(String name) {
        for (Pet pet : pets) {
            if (pet.getName().equalsIgnoreCase(name)) {
                return pet;
            }
        }
        return null;
    }
}

// Main
public class Vet {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nVeterinary Clinic Management System");
            System.out.println("1. Add a new pet");
            System.out.println("2. List all pets");
            System.out.println("3. Find a pet by name");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter pet's name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter pet's age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter pet's species: ");
                    String species = scanner.nextLine();
                    System.out.print("Enter owner's name: ");
                    String ownerName = scanner.nextLine();

                    Pet newPet = new Pet(name, age, species, ownerName);
                    clinic.addPet(newPet);
                    break;
                case 2:
                    clinic.listAllPets();
                    break;
                case 3:
                    System.out.print("Enter the pet's name to find: ");
                    String searchName = scanner.nextLine();
                    Pet foundPet = clinic.findPetByName(searchName);
                    if (foundPet != null) {
                        System.out.println("Pet found: " + foundPet);
                    } else {
                        System.out.println("Pet not found.");
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}

