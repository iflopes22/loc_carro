package br.fmu.bd;

import androidx.room.PrimaryKey;

public class Carro {
    public Carro(int id, String modelo, int ano, String cor, int porta, int km, boolean locado) {
        this.id = id;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.porta = porta;
        this.km = km;
        this.locado = locado;
    }

    @PrimaryKey
    public int id;
    public String modelo;
    public int ano;
    public String cor;
    public int porta;
    public int km;
    public boolean locado;

}
