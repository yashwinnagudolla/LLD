package designPatterns.factory;

import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.dropdown.DropDown;
import designPatterns.factory.components.menu.Menu;

public class WindowsUIFactory implements UIFactory{
    public Menu createMenu(){
        return new WindowsMenu;

    }
    public Button createButton(){
        return new WindowsButton;
    }
    public DropDown createDropDown(){
        return new WindowsDropDown;
    }
}