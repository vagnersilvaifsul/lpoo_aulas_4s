package model;

public class Submarino extends Personagem{
    @Override
    public void desenhar() {
        System.out.println("Desenhou um Submarino");
    }

    @Override
    public String toString() {
        return "Submarino{" +
            "x=" + x +
            ", y=" + y +
            "} " + super.toString();
    }
}
