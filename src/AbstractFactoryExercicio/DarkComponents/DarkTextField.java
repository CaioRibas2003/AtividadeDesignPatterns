package AbstractFactoryExercicio.DarkComponents;

import AbstractFactoryExercicio.Interface.ITextField;

public class DarkTextField implements ITextField {
    @Override
    public void render() {
        System.out.println("Render dark text field: ok");
    }
}
