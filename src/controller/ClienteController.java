package controller;

import model.Cliente;

public class ClienteController {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente("111.111.111-11", "Ana", "Silva", "Rua das Flores, 10", "96000-000", "5355551234", "email@dominio.com");
        System.out.println(c1);
        System.out.println(c2);
    }
}
