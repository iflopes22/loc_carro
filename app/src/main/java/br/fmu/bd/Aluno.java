package br.fmu.bd;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Aluno {
    @PrimaryKey
    public int ra;
    public String nome;
}
