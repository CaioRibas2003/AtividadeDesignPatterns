package AbstractFactoryExercicio.Factory;

import AbstractFactoryExercicio.DarkComponents.DarkButton;
import AbstractFactoryExercicio.DarkComponents.DarkCheckBox;
import AbstractFactoryExercicio.DarkComponents.DarkTextField;
import AbstractFactoryExercicio.Interface.IButton;
import AbstractFactoryExercicio.Interface.ICheckbox;
import AbstractFactoryExercicio.Interface.ITextField;

public class DarkThemeFactory implements UiComponentFactory{
    @Override
    public IButton createButton() {
        return new DarkButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new DarkCheckBox();
    }

    @Override
    public ITextField createTextField() {
        return new DarkTextField();
    }
}
