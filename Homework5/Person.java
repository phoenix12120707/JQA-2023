package Homework5;

public class Person {
    private String name;
    private int age;
    private boolean isMan;

    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMan() {
        return isMan;
    }

    public void showPersonInfo() {
        System.out.println("Person name is "   + name);
        System.out.println("Person age is " + age);
        System.out.println("Person is a man "  + (isMan ? "Male" : "Female"));
    }
}



    /*
    public void showPersonInfo(){
        System.out.println("Person name is" + getName());
        System.out.println("Person age is" + getAge());
        System.out.println("Person is a man" + isMan());
    }*/

