package com.heyueyuan.DataStructure.hashmap;

public class HashTab {
    private EmpLinkedList[] empLinkedListsArray;
    private int size;

    public HashTab(int size) {
        this.size = size;
        empLinkedListsArray = new EmpLinkedList[size];

        for (int i = 0; i < size; i++) {
            empLinkedListsArray[i] = new EmpLinkedList();
        }
    }

    public void add(Emp emp){
        int emLinkedListNO = hashFun(emp.id);
        empLinkedListsArray[emLinkedListNO].add(emp);
    }

    public void list() {
        for (int i = 0; i < size; i++) {
            empLinkedListsArray[i].list(i);
        }
    }

    public void findEmpById(int id) {
        int empLinkedListNO = hashFun(id);
        Emp emp = empLinkedListsArray[empLinkedListNO].findEmpById(id);
        if (emp != null) {
            System.out.printf("%d, id=%d\n", (empLinkedListNO+1), id);
        } else {
            System.out.println("Not Found");
        }
    }

    public int hashFun(int id) {
        return id % size;
    }
}
