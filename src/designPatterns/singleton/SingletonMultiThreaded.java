package designPatterns.singleton;

public class SingletonMultiThreaded{
    private static SingletonMultiThreaded instance;
    private int count;

    private SingletonMultiThreaded(){
        this.count = 0;

    }

    public static SingletonMultiThreaded getInstance(){
        if(instance == null){
            synchronized (SingletonMultiThreaded.class){
                if(instance == null){
                    instance = new SingletonMultiThreaded();
                }
            }
        }
        return instance;
    }

    public void makeConnection(){
        if(count < 10){
            count++;
            System.out.println("True");
        }else{
            System.out.println("Flase");
        }
    }


}