package designPatterns.factory;



public class Flutter{
    private SupportedPlatform platform;

    public Flutter(SupportedPlatform platform){
        this.platform = platform;
    }

    public void setTheme(){
        System.out.println("Setting the system's theme");
    }

    public void setRefreshRate(){
        System.out.println("Setting the system's refresh rate");
    }

    public UIFactory createUIFactory(){
        return UIFactoryFactory.createUIFactory(this.paltform);
    }

}