package designPatterns.factory;

import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.dropdown.DropDown;
import designPatterns.factory.components.menu.Menu;

public class IOSUIFactory implements UIFactory{
    public Menu createMenu(){
        return new IOSMenu;

    }
    public Button createButton(){
        return new IOSButton;
    }
    public DropDown createDropDown(){
        return new IOSDropDown;
    }
}