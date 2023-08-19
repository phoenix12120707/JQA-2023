package Homework6;

public class Bird extends Animal{
    @Override
    public void play() {
        System.out.println("Bird play");

    }
    public void fly (){
        System.out.println("Bird fly");
    }
    public void sing(){
        System.out.println("Bird sing");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("churulik churulik");
    }
}
