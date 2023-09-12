package designPatterns.strategy;

public class Maps {
    public void getPath(String fromLocation, String toLocation, TransportationMode mode){
        PathCalculaotrStrategy pathCalculaotrStrategy = new PathCalculatorFactory.getPathCalculator(mode);
        pathCalculaotrStrategy.findPath(fromLocation,toLocation);
    }
}