package designPatterns.factory;

import designPatterns.factory.components.button;
import designPatterns.factory.components.dropdown;
import designPatterns.factory.components.menu;

public class Client{
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.IOS);
        UIFactory uiFactory = flutter.createUIFactory();
        Menu menu = uiFactory.createMenu();
        Button button = uiFactory.createButton();
        DropDown dropDown = uiFactory.createDropDown();
    }
}