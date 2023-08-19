package Homework6;

public class Dog extends Animal implements IAnimal{
    @Override
    public void play() {
        System.out.println("Dog play");

    }
    public void bringStick(){

        System.out.println("Dog bring the stick");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("bau bau");
    }
}
