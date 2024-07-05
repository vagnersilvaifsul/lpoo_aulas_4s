package model;

public class Navio extends Personagem{
    @Override
    public void desenhar() {
        System.out.println("Desenhou um Navio");
    }

    @Override
    public String toString() {
        return "Navio{" +
            "x=" + x +
            ", y=" + y +
            "} ";
    }
}
