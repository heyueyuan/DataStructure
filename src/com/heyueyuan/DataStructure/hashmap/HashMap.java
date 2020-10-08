package com.heyueyuan.DataStructure.hashmap;

import java.util.Scanner;

public class HashMap {
    public static void main(String[] args) {
        HashTab hashTab = new HashTab(7);

        String key = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("add: add employee");
            System.out.println("list: show employee");
            System.out.println("find: find employee");
            System.out.println("exit: exit");

            key = scanner.next();
            switch (key) {
                case "add":
                    System.out.println("input id");
                    int id = scanner.nextInt();
                    System.out.println("input name");
                    String name = scanner.next();
                    Emp emp = new Emp(id, name);
                    hashTab.add(emp);
                    break;
                case "list":
                    hashTab.list();
                    break;
                case "find":
                    System.out.println("input id");
                    id = scanner.nextInt();
                    hashTab.findEmpById(id);
                    break;
                case "exit":
                    scanner.close();
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}