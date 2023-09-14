package designPatterns.strategy;

public class CarPathCalculatorStrategy implements PathCalculatorStrategy{
    private CarPathCalculatorStrategy instance;

    private CarPathCalculatorStrategy(){

    }

    public static CarPathCalculatorStrategy getInstance(){
        if(instance == null){
            synchronized (CarPathCalculatorStrategy.class){
                if(instance == null){
                    this.instance = new CarPathCalculatorStrategy();
                }
            }
        }
        return instance;
    }

    public void findPath(String source, String destination) {
        System.out.println("Path calculation via Car from : " + source + " to " + destination );
    }
}