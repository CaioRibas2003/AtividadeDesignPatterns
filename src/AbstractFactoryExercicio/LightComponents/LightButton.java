package AbstractFactoryExercicio.LightComponents;

import AbstractFactoryExercicio.Interface.IButton;

public class LightButton implements IButton {
    @Override
    public void render() {
        System.out.println("Render Light button: ok");
    }
}
