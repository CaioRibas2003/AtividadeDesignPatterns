package AbstractFactoryExercicio.LightComponents;


import AbstractFactoryExercicio.Interface.ITextField;

public class LightTextField implements ITextField {
    @Override
    public void render() {
        System.out.println("Render Light text field: ok");
    }
}
