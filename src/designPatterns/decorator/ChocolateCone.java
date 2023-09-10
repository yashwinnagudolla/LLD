package designPatterns.decorator;

public class ChocolateCone implements Icecream{
    private Icecream icecream;

    public ChocolateCone(Icecream icecream){
        this.icecream = icecream;
    }

    //Adding empty constructor as the Chocolate cone can be the start of an icecream
    //so user would initialise making icecream from the ChocolateCone
    public ChocolateCone(){

    }

    public int getCost(){
        if(icecream == null){
            return 40;
        }else{
            return icecream.getCost() + 40;
        }
    }

    public String getDescription(){
        if(this.icecream  == null) {
            return "ChocolateCone";
        }else{
            return icecream.getDescription() + "ChocolateCone";
        }
    }
}