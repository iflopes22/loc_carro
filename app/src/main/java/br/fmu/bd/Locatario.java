package br.fmu.bd;

import androidx.room.PrimaryKey;

import java.util.Date;

public class Locatario {
    public Locatario(int cpf, String email, String nome, String telefone) {
        this.cpf = cpf;
        this.email = email;
        this.nome = nome;
        this.telefone = telefone;
    }

    @PrimaryKey
    public int cpf;
    public String nome;
    public String email;
    public String telefone;
}