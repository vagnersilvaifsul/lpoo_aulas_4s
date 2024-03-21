package controller;

import model.Pessoa;

public class PessoaController {

    public static void main(String[] args) {
        //controller.Pessoa representa o tipo de Programador
        Pessoa p1 = new Pessoa(); //cria um objeto (instância da classe controller.Pessoa)
        System.out.println(p1); //imprime o objeto inteiro
        System.out.println(p1.getNome()); //imprime o atributo da classe
        System.out.println(p1.getIdade()); //imprime o atributo da classe

        Pessoa p2 = new Pessoa("Ana", 7); //cria um objeto (instância da classe controller.Pessoa)
        System.out.println();
        System.out.println(p2); //imprime o objeto inteiro
        System.out.println(p2.getNome()); //imprime o atributo da classe
        System.out.println(p2.getIdade()); //imprime o atributo da classe

        Pessoa p3 = new Pessoa("Ana"); //cria um objeto (instância da classe controller.Pessoa)
        System.out.println();
        System.out.println(p3); //imprime o objeto inteiro
        System.out.println(p3.getNome()); //imprime o atributo da classe
        System.out.println(p3.getIdade()); //imprime o atributo da classe
    }
}