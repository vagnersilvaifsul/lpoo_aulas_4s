package model;

public class Aviao extends Personagem{
    private double z;

    public Aviao() {
    }

    public Aviao(double x, double y) {
        super(x, y);
    }

    public Aviao(double x, double y, double z) {
        super(x,y);
        this.z = z;
    }

    public void mover(double x, double y, double z) {
        super.mover(x, y);
        this.z = z;
    }

    //TODO: fazer o algoritmo para desenhar o avião
    @Override
    public void desenhar() {
        System.out.println("Desenhou um Avião");
    }

    @Override
    public String toString() {
        return "Aviao{" +
            "z=" + z +
            ", x=" + x +
            ", y=" + y +
            "} ";
    }
}
