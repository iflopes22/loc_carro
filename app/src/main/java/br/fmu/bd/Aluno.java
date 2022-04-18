package br.fmu.bd;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Aluno {
    @PrimaryKey
    public int ra;

    public Aluno(int ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public String nome;

}
