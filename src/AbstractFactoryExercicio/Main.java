package AbstractFactoryExercicio;

import AbstractFactoryExercicio.Aplication.Aplication;
import AbstractFactoryExercicio.Factory.DarkThemeFactory;
import AbstractFactoryExercicio.Factory.LightThemeFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("---Tema Claro---");
        Aplication lightUi = new Aplication(new LightThemeFactory());
        lightUi.createUI();
        lightUi.renderUI();

        System.out.println();

        System.out.println("---Tema Escuro---");
        Aplication darkUi = new Aplication(new DarkThemeFactory());
        darkUi.createUI();
        darkUi.renderUI();


    }
}
