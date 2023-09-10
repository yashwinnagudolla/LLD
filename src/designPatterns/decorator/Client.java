package designPatterns.decorator;

public class Client{
    public static void main(String[] args) {
        //observer pattern is used to create objects in a sequence
        //the object created will be of a interface type
        //Each time an object is created its passed to its next class and is stored as private attribute to create a chain
        //the object creation is very simple and te user just needs to call the constructors in a sequence
        Icecream icecream = new ChocolateChip(
                                new ChocolateScoop(
                                    new VanillaScoop(
                                        new VanillaCone(
                                            new ChocolateChip(
                                                    new ChocolateCone())))));
        System.out.println(icecream.getCost());
        System.out.println(icecream.getDescription());
    }
    }
}