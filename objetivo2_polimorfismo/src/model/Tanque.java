package model;

public class Tanque extends Personagem {
    @Override
    public void desenhar() {
        System.out.println("Desenhou um Tanque");
    }

    @Override
    public String toString() {
        return "Tanque{" +
            "x=" + x +
            ", y=" + y +
            "} " + super.toString();
    }
}
