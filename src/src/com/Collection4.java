package src.com;

import java.util.*;
class Person {
   private int age;
    static int count=0;

    public Person(int age) {
        this.age = age;
        count++;
    }
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class ComparePerson implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge()-o2.getAge();
    }
}

public class Collection4 {
    public static void main(String[] args) {
        Set set= new TreeSet<>(new ComparePerson());
        set.add(new Person(4));
        set.add(new Person(1));
        set.add(new Person(6));
        set.add(new Person(3));
        System.out.println(Person.count);

        for (Object o:set) {
            System.out.println(o);
        }
    }
}
