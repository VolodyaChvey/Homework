package src.com;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Collrction7 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("one");
        ll.add("two");
        ll.add("three");
        ll.add("four");
        ll.add("five");
        System.out.println("List: " + ll);
        ll.add("six");
        ll.add(3, "three");
        ll.addFirst("zero");
        System.out.println("List: " + ll);
        ll.remove("three");
        System.out.println("List: " + ll);
        System.out.println("Loop for: ");
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }
        ListIterator<String> it_beg = ll.listIterator();
        System.out.println("\nLoop forward: ");
        while (it_beg.hasNext()) {
            System.out.print(it_beg.next() + " ");
        }
        System.out.println("\nLoop backward: ");
        while (it_beg.hasPrevious()) {
            System.out.print(it_beg.previous() + " ");
        }
        ListIterator<String> it_ind = ll.listIterator(4);
        System.out.println("\nLoop from index: ");
        while (it_ind.hasPrevious()) {
            System.out.print(it_ind.previous() + " ");
        }
        Iterator<String> it_desc = ll.descendingIterator();
        System.out.println("\nLoop with descending Iterator: ");
        while (it_desc.hasNext()) {
            System.out.print(it_desc.next() + " ");
        }
        it_ind.set("6");
        it_ind.add("7");
        System.out.println(ll);
        Collections.sort(ll);
        System.out.println("\nSorted list: ");
        for (String s: ll) {
            System.out.print(s+" ");
        }
    }
}
