package AbstractFactoryExercicio.DarkComponents;


import AbstractFactoryExercicio.Interface.ICheckbox;

public class DarkCheckBox implements ICheckbox {

    @Override
    public void render() {
        System.out.println("Render dark check box: ok");
    }
}
