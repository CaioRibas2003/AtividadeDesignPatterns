package Prototype;

public class PrototypeMain {
    public static void main(String[] args) {

        Personagem p1 = new Personagem("Caio","Mago",15,20,30);

        Personagem p2 = p1.clone();
        p2.setNome("Brian");

        Personagem p3 = p1.clone();
        p3.setNome("Davi");

        Personagem p4 = p1.clone();
        p4.setNome("Alfredo");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }
}
