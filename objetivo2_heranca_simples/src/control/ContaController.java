package control;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class ContaController {

    public static void main(String[] args) {
        //Conta c = new Conta(); //não é possível criar objetos de classes abstratas

        //Só é possível criar instâncias de Classes Concretas
        ContaPoupanca cp1 = new ContaPoupanca();
        cp1.deposita(1000.00);
        cp1.saca(500.00);
        System.out.println(cp1);

        ContaCorrente cc1 = new ContaCorrente();
        cc1.deposita(2000.00);
        cc1.saca(1000.00);
        System.out.println(cc1);
    }
}
