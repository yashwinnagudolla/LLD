package designPatterns.decorator;

public class Client{
    public static void main(String[] args) {
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