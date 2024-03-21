package model;

public class Pessoa {
    /* Membros do tipo Atributo */
    //Atributs
     private String nome;
    private double idade;

    /* Membros do tipo Método */

    //Métodos Construtores (podem ser Sobrecarregados)
    //Construtor padrão (ou vazio)
    public Pessoa() {
    }

    //Construtor parametrizado
    public Pessoa(String nome, double idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Construtor parametrizado
    public Pessoa(String nome) {
        this.nome = nome;
    }

    //Métodos Acessores (de acesso)
    /*
        Server para se colocar políticas de acesso
        aos membros de uma classe, como os atributos.
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    @Override //Sobreescrita de método (O método toString() está na classe Object. Aqui estamos sobreescrevendo ele)
    public String toString() {
        return "controller.Pessoa{" +
            "nome='" + nome + '\'' +
            ", idade=" + idade +
            '}';
    }
}
