package com.heyueyuan.Algorithm.hashmap;

public class EmpLinkedList {
        private Emp head;

        public void add(Emp emp) {
            if (head == null) {
                head = emp;
                return;
            }

            Emp curEmp = head;
            while (true) {
                if (curEmp.next == null) {
                    break;
                }
                curEmp = curEmp.next;
            }
            curEmp.next = emp;
        }

        public void list(int no) {
            if (head == null) {
                System.out.println("Null");
                return;
            }
            Emp curEmp = head;
            while (true) {
                System.out.printf(" => id=%d name=%s\t", curEmp.id, curEmp.name);
                if (curEmp.next == null) {
                    break;
                }
                curEmp = curEmp.next;
            }
            System.out.println();
        }

        public Emp findEmpById (int id) {
            if (head == null) {
                System.out.println("Null");
                return null;
            }

            Emp curEmp = head;
            while (true) {
                if (curEmp.id == id) {
                    break;
                }

                if (curEmp.next == null) {
                    curEmp = null;
                    break;
                }

                curEmp = curEmp.next;
            }
            return curEmp;
        }
}