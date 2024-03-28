package model;

public class ContaPoupanca extends Conta{
    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void saca(double valor) {
            if(this.saldo >= valor){
                this.saldo -= valor;
            } else {
                System.out.println("Saldo insificiente para saque na ContaPoupanca");
            }
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
            "saldo=" + saldo +
            "} ";
    }
}
