package designPatterns.strategy;

public class WalkPathCalculatorStrategy implements PathCalculatorStrategy{
    private WalkPathCalculatorStrategy instance;

    private WalkPathCalculatorStrategy(){

    }

    public static WalkPathCalculatorStrategy getInstance(){
        if(instance == null){
            synchronized (WalkPathCalculatorStrategy.class){
                if(instance == null){
                    this.instance = new WalkPathCalculatorStrategy();
                }
            }
        }
        return instance;
    }

    public void findPath(String source, String destination) {
        System.out.println("Path calculation via Walk from : " + source + " to " + destination );
    }

}