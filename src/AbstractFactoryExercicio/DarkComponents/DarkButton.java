package AbstractFactoryExercicio.DarkComponents;

import AbstractFactoryExercicio.Interface.IButton;

public class DarkButton implements IButton {
    @Override
    public void render() {
        System.out.println("Render dark button: ok");
    }
}
