package br.fmu.bd;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class Aluno {
    public Aluno(int ra, String nome, Date dataNascimento, String email) {
        this.ra = ra;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    @PrimaryKey
    public int ra;
    public String nome;
    public Date dataNascimento;
    public String email;
}
