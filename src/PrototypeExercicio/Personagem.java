package PrototypeExercicio;

public class Personagem implements Prototype {

    private String nome;
    private String classe;
    private int nivel;
    private int vida;
    private int ataque;

    public Personagem(String nome, String classe, int nivel, int vida, int ataque) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.vida = vida;
        this.ataque = ataque;
    }

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", classe='" + classe + '\'' +
                ", nivel='" + nivel + '\'' +
                ", vida='" + vida + '\'' +
                ", ataque='" + ataque + '\'' +
                '}';
    }

    @Override
    public Personagem clone() {
        return new Personagem(this.nome, this.classe, this.nivel, this.vida, this.ataque);
    }
}

