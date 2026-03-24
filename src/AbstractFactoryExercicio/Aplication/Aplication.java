package AbstractFactoryExercicio.Aplication;

import AbstractFactoryExercicio.Factory.UiComponentFactory;
import AbstractFactoryExercicio.Interface.IButton;
import AbstractFactoryExercicio.Interface.ICheckbox;
import AbstractFactoryExercicio.Interface.ITextField;

public class Aplication {

    private IButton button;
    private ICheckbox checkBox;
    private ITextField textField;

    private UiComponentFactory factory;

    public Aplication(UiComponentFactory factory) {
        this.factory = factory;
    }

    public void createUI(){
        button = factory.createButton();
        checkBox = factory.createCheckbox();
        textField = factory.createTextField();
    }

    public void renderUI(){
        button.render();
        checkBox.render();
        textField.render();
    }
}
