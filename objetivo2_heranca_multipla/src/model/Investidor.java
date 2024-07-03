package model;

/*
    As interfaces, até o Java 7, tinham como regra o seguinte:
    1. Qualquer atributo em uma interface deve ser público e constante;
    2. Qualquer método em uma interface deve ser público e abstrato.

    Porém, essa rigidez na regra fez com que, ao dar manutenção nas classes do Java,
    isto é, ao implementar melhorias, os desenvolvedores passassem por um problema. Ao
    adicionar um novo método em uma interface toda e qualquer classe que a implementasse
    no SDK deveria sofrer atualização (implementar esse novo método). Como resposta a esse
    problema, os desenvolvedores do Java, a partir da sua versão 8, adicionaram outros tipos
    de métodos as interfaces, os default e os private.

    Método Default: Um método default aceita ter algoritmo (é implementado), logo, ele quebra a
    regra 2 "Qualquer método em uma interface deve ser público e abstrato". Assim, ao adionar um
    novo método em uma interface ele já é implementado, deixando, a cargo de quem o herda a decisão
    de modificar sua implementação.

    Método Private: este é um método que também aceita ter algoritmo (é implementado). Mas,
    diferente do método default, ele não é visível por quem implementa a interface (em outras
    palavras, ele é interno a interface. Muito útil quando um método deve ter sua implementação
    final no escopo da interface (não permitindo modificar sua implementação e outro espaço)).

 */

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
