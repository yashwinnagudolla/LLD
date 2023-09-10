package designPatterns.decorator;

public class ChocolateScoop implements Icecream{
    private Icecream icecream;

    public ChocolateScoop(Icecream icecream){
        this.icecream = icecream;
    }

    public int getCost(){
        return icecream.getCost() + 55;
    }

    public String getDescription(){
        return icecream.getDescription() + "ChocolateScoop";
    }
}