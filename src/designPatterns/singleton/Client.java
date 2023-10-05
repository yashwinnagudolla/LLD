package designPatterns.singleton;

class Client{
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();

        s1.makeConnection();
    }
}