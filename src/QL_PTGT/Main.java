package QL_PTGT;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Xe> xe = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the type of employee to input:");
            System.out.println("1. Oto");
            System.out.println("2. Xe May");
            System.out.println("3. Xe tai");
            System.out.println("4. Exit");

            System.out.print("Chon: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 4) {
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("Nhap thong tin Oto:");
                    xe.add(inputCar(scanner));
                    break;
                case 2:
                    System.out.println("Nhap thong tin Xe May:");
                    xe.add(inputMotoBike(scanner));
                    break;
                case 3:
                    System.out.println("Nhap thong tin xxe Tai:");
                    xe.add(inputTruck(scanner));
                    break;
                default:
                    System.err.println("Lua chon khong ton tai . Chon lai");
            }
        }

        Quan_Ly_Xe.writeXeToFile(xe);

        List<Xe> loadedVihicles = Quan_Ly_Xe.readXeFromFile();

        for (Xe v : loadedVihicles) {
            v.showInfo();
            System.out.println();
        }
    }

    public static Oto inputCar(Scanner scanner) {
    	System.out.println("Nhap ID: ");
        int ID = scanner.nextInt();
        System.out.println("Nhap Hang San Xuat: ");
        String brand = scanner.nextLine();
        scanner.nextLine();
        
        System.out.println("Nhap Nam San Xuat: ");
        int pushlishyear = scanner.nextInt();
        System.out.println("Nhap Gia: ");
        double price = scanner.nextDouble();
        System.out.println("Nhap Mau: ");
        String color = scanner.nextLine();
        scanner.nextLine();
        
        System.out.println("Nhap cho ngoi: ");
        int slots = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap kieu dong co: ");
        String engineType = scanner.nextLine();
        
        return new Oto(ID, brand, pushlishyear, price, color, slots, engineType);
    }

    public static Xe_May inputMotoBike(Scanner scanner) {
    	System.out.println("Nhap ID: ");
        int ID = scanner.nextInt(); scanner.nextLine();
        System.out.println("Nhap Hang San Xuat: ");
        String brand = scanner.nextLine(); 
        scanner.nextLine();
        
        System.out.println("Nhap Nam San Xuat: ");
        int pushlishyear = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap Gia: ");
        double price = scanner.nextDouble();
        System.out.println("Nhap MAU: ");
        String color = scanner.nextLine();
        scanner.nextLine();
        
        System.out.println("Nhap Cong Suat: ");
        Double capacity = scanner.nextDouble();
 
        return new Xe_May(ID, brand, pushlishyear, price, color, capacity);
    }

    public static Xe_Tai inputTruck(Scanner scanner) {
    	System.out.println("Nhap ID: ");
        int ID = scanner.nextInt();
        System.out.println("Nhap Hang San Xuat: ");
        String brand = scanner.nextLine();
        scanner.nextLine();
        
        System.out.println("Nhap Nam San Xuat: ");
        int pushlishyear = scanner.nextInt();
        System.out.println("Nhap Gia: ");
        double price = scanner.nextDouble();
        System.out.println("Nhap Mau: ");
        String color = scanner.nextLine();
        scanner.nextLine();
        
        System.out.println("Nhap Trong Luong: ");
        Double loadWeight = scanner.nextDouble();
        
        return new Xe_Tai(ID, brand, pushlishyear, price, color, loadWeight);
    }
    }
