package designPatterns.factory;

import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.dropdown.DropDown;
import designPatterns.factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory{
    public Menu createMenu(){
        return new AndroidMenu;

    }
    public Button createButton(){
        return new AndroidButton;
    }
    public DropDown createDropDown(){
        return new AndroidDropDown;
    }
}