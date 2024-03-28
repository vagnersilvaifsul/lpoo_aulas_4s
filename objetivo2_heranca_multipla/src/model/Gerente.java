package model;

public class Gerente extends Funcionario implements Investidor{
    private String ticker;
    private int qdeCotas;

    @Override
    public double getBonus() {
        return this.getSalario() * 0.05;
    }

    @Override
    public String getTicker() {
        return this.ticker;
    }

    @Override
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    @Override
    public int getQuantidade() {
        return this.qdeCotas;
    }

    @Override
    public void setQuantidade(int quantidade) {
        this.qdeCotas = quantidade;
    }

    @Override
    public String toString() {
        return "Gerente{" +
            "ticker='" + ticker + '\'' +
            ", qdeCotas=" + qdeCotas +
            "} " + super.toString();
    }
}
