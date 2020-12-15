package src.com;

import java.util.*;

public class Collection3 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        List<String> vector = new Vector<>();
        List<String> stack = new Stack<>();
        List<String> syncList = Collections.synchronizedList(new ArrayList<>());
        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("B");

        Collections.sort(arrayList);

        System.out.println(arrayList.get(Collections.binarySearch(arrayList,"B")));
        String[] strings=new String[arrayList.size()];
        arrayList.toArray(strings);
        System.out.println(Arrays.toString(strings));
        List<String> stringList=Arrays.asList(strings);
    }
}
