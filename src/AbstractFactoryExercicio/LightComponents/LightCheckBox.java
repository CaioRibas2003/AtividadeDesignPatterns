package AbstractFactoryExercicio.LightComponents;

import AbstractFactoryExercicio.Interface.ICheckbox;

public class LightCheckBox implements ICheckbox {
    @Override
    public void render() {
        System.out.println("Render Light check box: ok");
    }
}
