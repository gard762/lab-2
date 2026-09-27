package ru.university.lab2.menu;

import java.util.Scanner;

public class Task08Menu {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        do {
            printHelp();
            System.out.print("Выберите пункт: ");
            if(!scanner.hasNextInt()){
                System.out.println("Некорректный ввод, повторите");
                scanner.nextLine();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1 -> System.out.println("Вы выбрали задание №1");
                case 2 -> System.out.println("Вы выбрали задание №2");
                case 3 -> System.out.println("Вы выбрали задание №3");
                case 0 -> {
                    System.out.println("Выход...");
                    exit = true;
                }
                default -> System.out.println("Такого пункта нет");
            }
        } while(!exit);
        scanner.close();
    }

    private void printHelp(){
        System.out.print("""
                ---- МЕНЮ ----
                1 - Задание №1
                2 - Задание №2
                3 - Задание №3
                0 - Выход
                """);
    }
}