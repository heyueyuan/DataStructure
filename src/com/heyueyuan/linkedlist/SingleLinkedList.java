package com.heyueyuan.linkedlist;

public class SingleLinkedList {
    public static void main(String[] args) {
        HeroNode hero1 = new HeroNode(1,"amy","good");
        HeroNode hero2 = new HeroNode(2, "beca", "nice");
        HeroNode hero3 = new HeroNode(3, "charlie", "cool");
        HeroNode hero4 = new HeroNode(4, "david", "kind");

        LinkedList linkedList = new LinkedList();
//        linkedList.add(hero1);
//        linkedList.add(hero2);
//        linkedList.add(hero3);
//        linkedList.add(hero4);

        linkedList.addByOrder(hero1);
        linkedList.addByOrder(hero2);
        linkedList.addByOrder(hero3);
        linkedList.addByOrder(hero4);

        linkedList.list();

        HeroNode newHeroNode = new HeroNode(2, "buick", "ok");
        linkedList.update(newHeroNode);
        System.out.println("after"); linkedList.list();

        linkedList.del(1);
        linkedList.del(4);

        System.out.println("after");
        linkedList.list();
    }
}
class LinkedList  {
    private HeroNode head = new HeroNode(0,"", "");

    public void add(HeroNode heroNode) {
        HeroNode temp = head;
        while(true) {
            if(temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = heroNode;
    }

    public void addByOrder(HeroNode heroNode) {
        HeroNode temp = head;
        boolean flag = false;
        while (true) {
            if(temp.next == null) {
                break;
            }
            if(temp.next.no > heroNode.no) {
                break;
            } else if (temp.next.no == heroNode.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }

        if (flag) {
            System.out.printf("Number:%d already existed!", heroNode.no);
        } else {
            heroNode.next = temp.next;
            temp.next = heroNode;
        }
    }

    public void update(HeroNode newHeroNode) {
        if(head.next == null) {
            System.out.println("Empty");
            return;
        }

        HeroNode temp = head.next;
        boolean flag = false;
        while (true) {
            if(temp == null) {
                break;
            }
            if(temp.no == newHeroNode.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }

        if(flag) {
            temp.name = newHeroNode.name;
            temp.nickname = newHeroNode.nickname;
        } else {
            System.out.printf("Did not find %d", newHeroNode.no);
        }
    }

    public void del(int no) {
        HeroNode temp = head;
        boolean flag = false;
        while (true) {
            if(temp.next == null) {
                break;
            }
            if(temp.next.no == no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag) {
            temp.next = temp.next.next;
        } else {
            System.out.printf("Not existed", no);
        }
    }

    public void list() {
        if(head.next == null) {
            System.out.println("Empty");
            return;
        }
        HeroNode temp = head.next;
        while (true) {
            if(temp == null) {
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }



}
class HeroNode {
    public int no;
    public String name;
    public String nickname;
    public HeroNode next;

    public HeroNode (int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
