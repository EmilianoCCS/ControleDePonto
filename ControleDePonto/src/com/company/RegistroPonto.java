package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegistroPonto {


    private Long idRegPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    public Long getIdRegPonto() {
        return idRegPonto;
    }

    public void setIdRegPonto(Long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro = LocalDate.from(LocalDateTime.now());
    }

    public void setDataRegistro() {
        this.dataRegistro = dataRegistro;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public void ApresentarRegistroPonto(){
        // Nome funcionario, data de registro do ponto, horarios de entrada e saida
        System.out.println("\nNome funcionario: " + func.getNome());
        System.out.println("Data de registro ponto: "+ getDataRegistro());
        System.out.println("Hora de Entrada: "+ getHoraEntrada());
        System.out.println("Hora de Saida: "+ getHoraSaida() + "\n");
        System.out.println("====================================================");
    }
}
