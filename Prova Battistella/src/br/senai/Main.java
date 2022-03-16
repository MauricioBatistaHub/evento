package br.senai;

import br.senai.model.Evento;

public class Main {
    public static void main(String[] args) {
        Evento evento1 = new Evento();
        evento1.setNome("Dj Máscara");
        evento1.setData("18/03");
        evento1.setCliente("Camila","092.797.959-12","48 99828-3722","camila@gmail.com");
        evento1.setCliente("Olavo","180.780.348-13","48 99843-2014","olavo@gmail.com");
        evento1.setCliente("Mauricío","625.705.992-12","48 98415-6236","mauricio@gmail.com");
        evento1.setCliente("Erick","109.023.145-69","48 92925-4763","erick@gmail.com");
        evento1.setCliente("Manu","046.462.379-25","48 99692-9618","manu@gmail.com");
        System.out.println(evento1);

        Evento evento2 = new Evento();
        evento2.setNome("Disco Voador");
        evento2.setData("23/03");
        evento2.setCliente("Rafael","245.745.374-21","48 99327-3674","rafael@gmail.com");
        evento2.setCliente("Annand","756.486.583-23","48 99926-3742","annand@gmail.com");
        evento2.setCliente("Santos","625.406.924-57","48 92602-8645","santos@gmail.com");
        evento2.setCliente("Rhanna","253.964.326-09","48 97534-8807","rhanna@gmail.com");
        evento2.setCliente("Matheus","765.423.108-72","48 97653-2001","matheus@gmail.com");
        System.out.println(evento2);

        Evento evento3 = new Evento();
        evento3.setNome("Show do Jão");
        evento3.setData("28/03");
        evento3.setCliente("Kaue","593.568.657-22","48 92345-4578","kaue@gmail.com");
        evento3.setCliente("João","392.354.843-34","48 90732-3874","joao@gmail.com");
        evento3.setCliente("Guilherme","534.755.856-23","48 90835-3824","gui@gmail.com");
        evento2.setCliente("Luciana","867.468.245-34","48 94342-5873","luci@gmail.com");
        evento3.setCliente("Dio Brando","132.460.715-69","48 99732-1528","diobrando@gmail.com");
        System.out.println(evento3);
    }
}
