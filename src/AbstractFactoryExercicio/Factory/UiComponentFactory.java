package AbstractFactoryExercicio.Factory;

import AbstractFactoryExercicio.Interface.IButton;
import AbstractFactoryExercicio.Interface.ICheckbox;
import AbstractFactoryExercicio.Interface.ITextField;

public interface UiComponentFactory {

    IButton createButton();
    ICheckbox createCheckbox();
    ITextField createTextField();
}
