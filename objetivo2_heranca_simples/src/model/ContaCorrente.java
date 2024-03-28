package model;

public class ContaCorrente extends Conta{

    @Override
    public String toString() {
        return "ContaCorrente{} ";
    }

    @Override
    public void saca(double valor) {
        this.saldo += valor;
    }
}
