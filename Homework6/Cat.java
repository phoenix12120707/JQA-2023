package Homework6;

public class Cat extends Animal{
    @Override
    public void play() {
        System.out.println("Cat play");

    }

    public void climp(){
        System.out.println("Cat climbing");

    }

    @Override
    public void makeSomeNoise() {
        System.out.println("meow meow");
    }
}
