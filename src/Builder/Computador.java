package Builder;

public class Computador {

    private String processador;
    private String ram;
    private String armazenamento;
    private String placaDeVideo;
    private String os;

    public String getProcessador() {
        return processador;
    }

    public String getRam() {
        return ram;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public String getOs() {
        return os;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "processador='" + processador + '\'' +
                ", ram='" + ram + '\'' +
                ", armazenamento='" + armazenamento + '\'' +
                ", placaDeVideo='" + placaDeVideo + '\'' +
                ", os='" + os + '\'' +
                '}';
    }

    private Computador(ComputadorBuilder computadorBuilder) {
        this.processador  = computadorBuilder.processador;
        this.ram          = computadorBuilder.ram;
        this.armazenamento = computadorBuilder.armazenamento;
        this.placaDeVideo = computadorBuilder.placaDeVideo;
        this.os           = computadorBuilder.os;
    }

    public static class ComputadorBuilder {

        private String processador;
        private String ram;
        private String armazenamento;
        private String os;
        private String placaDeVideo = "";

        public ComputadorBuilder(String processador, String ram, String armazenamento, String os) {

            this.processador = processador;
            this.ram = ram;
            this.armazenamento = armazenamento;
            this.os = os;
        }

        public ComputadorBuilder placaDeVideo(String placaDeVideo) {
            this.placaDeVideo = placaDeVideo;
            return this;
        }

        public Computador build(){
            return new Computador(this);
        }
    }
}
