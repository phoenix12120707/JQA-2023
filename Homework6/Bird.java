package Homework6;

public class Bird extends Animal {
    @Override
    public void play() {
        System.out.println("Bird play");

    }

    public void fly() {
        System.out.println("Bird fly");
    }

    public void sing() {
        System.out.println("Bird sing");
    }

    public void sing(int birdCount) {
        if (birdCount > 1 && birdCount <= 4) {
            System.out.println("Birds singing noisy");
        }
        else if (birdCount == 1) {
            System.out.println("There is only one beautiful bird singer");

        }
        else {
            System.out.println("There are too many birds, and it is very loud");
        }


        }

    @Override
    public void makeSomeNoise() {
        System.out.println("Birds say Hi");
    }
}
