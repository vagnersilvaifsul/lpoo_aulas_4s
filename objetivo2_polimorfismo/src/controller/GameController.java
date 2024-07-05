package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    public static void main(String[] args) {
        Aviao a1 = new Aviao();
        Aviao a2 = new Aviao(5, 5);
        Navio n1 = new Navio();
        Navio n2 = new Navio();
        Tanque t1= new Tanque();
        Tanque t2= new Tanque();
        Submarino s1 = new Submarino();
        Submarino s2 = new Submarino();
        
        List<Personagem> personagens = new ArrayList<>();
        personagens.add(a1);
        personagens.add(a2);
        personagens.add(n1);
        personagens.add(n2);
        personagens.add(t1);
        personagens.add(t2);
        personagens.add(s1);
        personagens.add(s2);

        personagens.forEach(p -> {
           p.desenhar();
           if(p instanceof Submarino){
               p.mover(7, 7);
           } else if(p instanceof Tanque){
               p.mover(16, 16);
           } else if(p instanceof Aviao){
               ((Aviao) p).mover(8, 8, 8);
           }
                p.mover(3, 3);
            System.out.println(p);
        });
    }
}
