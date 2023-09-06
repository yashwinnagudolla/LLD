package designPatterns.singleton;

public class SingletonMultiThreaded{
    private SingletonMultiThreaded instance;
    private count;

    private SingletonMultiThreaded(){
        this.count = 0;

    }

    public static SingletonMultiThreaded getInstance(){
        if(this.instance == null){
            synchronized (SingletonMultiThreaded.class){
                if(this.instance == null){
                    this.instance = new SingletonMultiThreaded();
                }
            }
        }
        return this.isntance;
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