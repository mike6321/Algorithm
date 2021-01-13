package me.choi.inflearn.whiteship.list;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 2:46 오후
 */
public class LinkedList {
    private LinkedNode head;
    private LinkedNode tail;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(new LinkedNode(1));
        list.add(new LinkedNode(2));
        list.add(new LinkedNode(3));


        list.print();

    }

    private void add(LinkedNode node) {
        if (head == null) {
            head = node;
            tail = node;
        } else if (tail != null) {
            tail.next = node;
            tail = tail.next;
        }
    }

    private void print() {
        LinkedNode nodeToPrint = this.head;
        while (nodeToPrint != null) {
            System.out.println(nodeToPrint.number);
            nodeToPrint = nodeToPrint.next;
        }
    }

    // TODO: [단일 연결 리스트를 뒤집는 함수를 구현하라] junwoochoi 2021/01/13 3:56 오후
    // 예) 1 -> 2 -> 3   ->  3 -> 2 -> 1
    private void revsers() {
        LinkedNode current = this.head;
        LinkedNode prev = null;
        LinkedNode next = null;


    }
}
