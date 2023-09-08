package designPatterns.factory;

public class UIFactoryFactory{
    public UIFactory createUIFactory(){
        return switch(platform){
            case IOS -> new IOSFactory();
            case ANDROID -> new AndroidFactory();
            case WINDOWS -> new WindowsFactory();
        };
    }
}