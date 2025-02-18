package week2;

public class Inheritance {

    public static void main(String[] args) {
        Animal a1 = new Animal(4,false,"fawn","woof","omnivore","Mammal");
        Dog d1 = new Dog("black","woof","carnivore","Dog");
        System.out.println(d1.color);
    }

}
