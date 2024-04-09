/*1. The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato. Write a java program that demonstrates how to establish this class hierarchy. Declare one instance variable of type String that indicates the color of a vegetable. Crete and display instances of these objects. Override the toString() method of object to return a string with the name of vegetable and its color.*/

public class VegetableAbst {
    public static void main(String[] args) {
        potato p1 = new potato("potato");
        System.out.println(p1.toString());
        brinjal b1 = new brinjal("brinjal");
        System.out.println(b1.toString());
        tomato t1 = new tomato("tomato");
        System.out.println(t1.toString());
    }
}

abstract class vegetable {
    String color;
    String name;

    public abstract String toString();

    public vegetable(String name) {
        this.name = name;
    }
}

class potato extends vegetable {

    public potato(String name) {
        super(name);
        color = "brown";
    }

    public String toString() {
        return "name of vegetable is: " + name + "  color is: " + color;
    }

}

class brinjal extends vegetable {
    public brinjal(String name) {
        super(name);
        color = "violant";
    }

    public String toString() {
        return "name of vegetable is: " + name + " color is: " + color;
    }
}

class tomato extends vegetable {
    public tomato(String name) {
        super(name);
        color = "red";
    }

    public String toString() {
        return "name of vegetable is: " + name + " color is: " + color;
    }
}