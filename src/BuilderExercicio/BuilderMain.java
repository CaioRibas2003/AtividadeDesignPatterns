package BuilderExercicio;

public class BuilderMain {
    public static void main(String[] args) {

        Computador pcBasico = new Computador.ComputadorBuilder("Intel","8GB Ram", "Ssd - 250gb", "Linux").build();

        Computador pcGamer = new Computador.ComputadorBuilder("Amd","32Gb Ram","Ssd - 1Tb", "Windows")
                .placaDeVideo("Rtx 5060")
                .build();

        System.out.println(pcBasico.toString());
        System.out.println(pcGamer.toString());

    }
}
