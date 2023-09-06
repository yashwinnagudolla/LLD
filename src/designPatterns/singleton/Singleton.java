package designPatterns.singleton;

public class Singleton{
    //private instance variable to hold the object
    private Singleton instance;
    private int connections;
    //private constructor
    private Singleton(){
        connections = 0;

    }
    //public static method to call the constructor
    public static Singleton getInstance(){
        if(instance == null){
            this.instance = new Singleton();
        }
        return instance;
    }

    public void makeConnection(){
        if(connections < 10){
            connections++;
            System.out.println("True");
        }else{
            System.out.println("Flase");
        }
    }
}