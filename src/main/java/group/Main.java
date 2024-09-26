package group;

import group.streamAPI.EmployeeHandler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ///
        System.out.println("Задача 1:");
        System.out.print("Введите размер массива: ");
        int arraySize = in.nextInt();
        ArrayHandler arrayHandler = new ArrayHandler(arraySize);
        arrayHandler.lastPositiveElement();
        ///

        ///
        System.out.println("Задача 2:");
        System.out.print("Введите размер списка: ");
        int listSize = in.nextInt();
        ListHandler list = new ListHandler(listSize);
        list.selectionSort();
        ///

        ///
        System.out.println("Задача 3:");
        EmployeeHandler jobMarket = new EmployeeHandler();
        jobMarket.filterEmployeeList();
        ///

    }
}