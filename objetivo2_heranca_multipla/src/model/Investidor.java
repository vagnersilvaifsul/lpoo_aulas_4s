package model;

public interface Investidor {
    //public e abstract por natureza
    String getTicker();
    void setTicker(String ticker);
    int getQuantidade();
    void setQuantidade(int quantidade);

    /*
        Poderia ter numa interface outros dois tipos de métodos:
        private e o default (a partir do Java 8)
     */
}
