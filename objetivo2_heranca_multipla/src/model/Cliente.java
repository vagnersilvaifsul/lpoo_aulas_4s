package model;

public class Cliente implements Investidor{

    private String nome;
    private String sobrenome;
    private String ticker;
    private int qdeCotas;

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
        return "\nCliente{" +
            "nome='" + nome + '\'' +
            ", sobrenome='" + sobrenome + '\'' +
            ", ticker='" + ticker + '\'' +
            ", qdeCotas=" + qdeCotas +
            '}';
    }
}
