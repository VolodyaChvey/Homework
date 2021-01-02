package src.com;

import java.util.Objects;

public class Collection6 {
    public static void main(String[] args) {
        Animal animal1=new Animal(1);
        Animal animal2=new Animal(1);
    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
