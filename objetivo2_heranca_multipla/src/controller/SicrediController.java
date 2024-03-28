package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class SicrediController {
    public static void main(String[] args) {
        //Funcionario f = new Funcionario(); //não é possível pq é abstract
        //Investidor i = new Investidor(); //não é possível pq é abstract

        Cliente c1 = new Cliente();
        Gerente g1 = new Gerente();
        Desenvolvedor d1 = new Desenvolvedor();

        List<Funcionario> funcionarioList = new ArrayList<>();
        funcionarioList.add(g1);
        funcionarioList.add(d1);
        System.out.println(funcionarioList);

        List<Investidor> investidorList = new ArrayList<>();
        investidorList.add(c1);
        investidorList.add(g1);
        System.out.println(investidorList);

        investidorList.forEach(i -> {
            if(i instanceof Cliente){
                System.out.println(i);
            }
        });
        investidorList.forEach(i -> {
            if(i instanceof Gerente){
                System.out.println(i);
            }
        });


    }
}
