package AbstractFactoryExercicio.Factory;

import AbstractFactoryExercicio.Interface.IButton;
import AbstractFactoryExercicio.Interface.ICheckbox;
import AbstractFactoryExercicio.Interface.ITextField;
import AbstractFactoryExercicio.LightComponents.LightButton;
import AbstractFactoryExercicio.LightComponents.LightCheckBox;
import AbstractFactoryExercicio.LightComponents.LightTextField;

public class LightThemeFactory implements UiComponentFactory {

    @Override
    public IButton createButton() {
        return new LightButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new LightCheckBox();
    }

    @Override
    public ITextField createTextField() {
        return new LightTextField();
    }
}
