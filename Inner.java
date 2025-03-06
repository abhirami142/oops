

import java.util.Scanner;

class CPU {
    int price;

    // Constructor
    public CPU(int price) {
        this.price = price;
    }

    // Inner class Processor
    class Processor {
        int cores;
        String manufacturer;

        // Constructor
        public Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        // Display processor details
        void displayProcessorInfo() {
            System.out.println("Processor Information:");
            System.out.println("Cores: " + cores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    // Static inner class RAM
    static class RAM {
        int memorySize;
        String manufacturer;

        // Constructor
        public RAM(int memorySize, String manufacturer) {
            this.memorySize = memorySize;
            this.manufacturer = manufacturer;
        }

        // Display RAM details
        void displayRAMInfo() {
            System.out.println("RAM Information:");
            System.out.println("Memory Size: " + memorySize + "GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get CPU price
        System.out.print("Enter CPU price: ");
        int price = scanner.nextInt();

        // Get Processor details
        System.out.print("Enter number of cores: ");
        int cores = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Processor manufacturer: ");
        String processorManufacturer = scanner.nextLine();

        // Get RAM details
        System.out.print("Enter RAM size (in GB): ");
        int ramSize = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter RAM manufacturer: ");
        String ramManufacturer = scanner.nextLine();

        // Create CPU object
        CPU cpu = new CPU(price);

        // Create Processor object
        CPU.Processor processor = cpu.new Processor(cores, processorManufacturer);

        // Create RAM object
        CPU.RAM ram = new CPU.RAM(ramSize, ramManufacturer);

        // Display information
        System.out.println("\nCPU Price: $" + cpu.price);
        processor.displayProcessorInfo();
        ram.displayRAMInfo();

        scanner.close();
    }
}

