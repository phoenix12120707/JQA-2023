package Homework4;



public class ComputerPrices extends Computer{
    public static void main(String[] args) {
      Computer comp1 = new Computer(2020, 500.50, "Mac");
      comp1.display();

      Computer comp2 = new Computer();
        comp2.year = 2023;
        comp2.price = 500.49;
        comp2.operationSystem ="Linux";
        comp2.display();

        int result = comp1.comparePrice(comp2);
        if (result == -1) {
            System.out.println("First computer is expensive than the second one");
        } else if (result == 1) {
            System.out.println("First computer is with lower price than the second one");
        } else {
            System.out.println("Prices are equal");
        }


    }


}
