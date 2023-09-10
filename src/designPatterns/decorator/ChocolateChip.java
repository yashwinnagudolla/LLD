package designPatterns.decorator;

public class ChocolateChip implements Icecream{
    private Icecream icecream;

    public ChocolateChip(Icecream icecream){
        this.icecream = icecream;
    }

    public int getCost(){
        return 30 + icecream.getCost();
    }

    public String getDescription(){
        return icecream.getDescription() + "ChocolateChip";
    }

}