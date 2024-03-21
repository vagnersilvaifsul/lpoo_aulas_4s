package controller;

import model.Carro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarroController {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.setId(1L);
        c1.setMarca("Ford");
        System.out.println(c1.getMarca());
        System.out.println(c1.toString());

        Carro c2 = new Carro();
        c2.setId(2L);

        Carro c3 = new Carro(3L, "Fiat", "Uno", 2000);
        Carro c4 = new Carro(4L, "Fiat", "Palio", 2005);

        Carro c5 = new Carro(5L, "Volkswagen");
        Carro c6 = new Carro(6L, "Volkswagen");

        //Coleções (são estruturas de dados)

        //Coleções do tipo List
        List<Carro> carrosList = new ArrayList<>();
        //popula a coleção
        carrosList.add(c1);
        carrosList.add(c2);
        carrosList.add(c4);
        carrosList.add(c5);
        carrosList.add(c6);
        carrosList.add(c3);
        System.out.println(carrosList); //imprime o objeto Collection do tipo List
        //System.out.println(carrosList.get(2));

        //forEach do Java até o 7
        //Pesquisa por Força bruta
        for(Carro c : carrosList){
            if(c.getId() == c3.getId()){
                System.out.println(c);
            }
        }
        //forEach do Java até o 8+
        //Pesquisa por Força bruta
        carrosList.forEach(c -> {
            if(c.getId() == c3.getId()){
                System.out.println(c);
            }
        });

        //Pesquisa Binária
        carrosList.sort(Comparator.comparing(Carro::getId));
        System.out.println(carrosList.get(
            Collections.binarySearch(
                carrosList,
                c3,
                Comparator.comparing(Carro::getId)
            )
        ));


        //Coleções do tipo Map
    }
}
