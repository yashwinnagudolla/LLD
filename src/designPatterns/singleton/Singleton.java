package designPatterns.singleton;

class Singleton{
    private static Singleton instance;
    private int count;

    private Singleton(){
        count = 0;
    }
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void makeConnection(){
        if(count > 3){
            System.out.println("Connection limit exceeded");
        }else{
            System.out.println("Connection succeeded");
        }
    }
}