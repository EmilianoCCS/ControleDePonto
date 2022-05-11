package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class GerenciarControlePonto {

    public static void main(String[] args) throws InterruptedException {
        GerenciarControlePonto gc = new GerenciarControlePonto();
        TimeUnit.SECONDS.sleep(1);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();



        // write your code here
        Gerente gerente = new Gerente();
        Secretario secretario = new Secretario();
        Operador operador = new Operador();
        RegistroPonto rpg = new RegistroPonto();
        RegistroPonto rps = new RegistroPonto();
        RegistroPonto rpo = new RegistroPonto();

        gerente.setIdFunc(1);
        gerente.setNome("Widimarque");
        gerente.setLogin("gerente");
        gerente.setSenha("123456");
        gerente.setEmail("gerente@gerente.com.br");
        gerente.setDocumento("rg");

        secretario.setIdFunc(2);
        secretario.setNome("Junior");
        secretario.setTelefone("199999-9999");
        secretario.setRamal("55");
        secretario.setEmail("secretario@secretario.com.br");
        secretario.setDocumento("rg");

        operador.setIdFunc(3);
        operador.setNome("Ariadne");
        operador.setValorHora(80);
        operador.setEmail("operador@operador.com.br");
        operador.setDocumento("rg");

        rpg.setFunc(gerente);
        rpg.setDataRegistro();
        rpg.setHoraEntrada(gc.retornarHora());
        rpg.setHoraSaida(null);

        rps.setFunc(secretario);
        rps.setDataRegistro();
        rps.setHoraEntrada(gc.retornarHora());
        rps.setHoraSaida(null);

        rpo.setFunc(operador);
        rpo.setDataRegistro();
        rpo.setHoraEntrada(gc.retornarHora());
        rpo.setHoraSaida(null);


        rpg.ApresentarRegistroPonto();
        rps.ApresentarRegistroPonto();
        rpo.ApresentarRegistroPonto();


        rpg.setHoraSaida(gc.retornarHora());
        rps.setHoraSaida(gc.retornarHora());
        rpo.setHoraSaida(gc.retornarHora());

        rpg.ApresentarRegistroPonto();
        rps.ApresentarRegistroPonto();
        rpo.ApresentarRegistroPonto();

    }

    public static LocalDateTime retornarHora() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return now;
    }
}
