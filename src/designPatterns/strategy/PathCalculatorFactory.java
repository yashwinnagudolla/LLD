package designPatterns.strategy;

public class PathCalculatorFactory {
    public static PathCalculatorStrategy getPathCalculator(TransportationMode mode){
        return switch(mode){
            case Bike -> new BikePathCalculatorStrategy();
            case CAR -> new CarPathCalculatorStrategy();
            case WALK -> new WalkPathCalculatorStrategy();
        }
    }
}