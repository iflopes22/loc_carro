package br.fmu.bd;

import androidx.room.PrimaryKey;

import java.util.Date;

public class Reserva {
    public Reserva(int id, int carroId, int locatarioId, Date dataInicioReserva, Date DataFimReserva, String status) {
        this.id = id;
        this.carroId = carroId;
        this.locatarioId = locatarioId;
        this.dataInicioReserva = dataInicioReserva;
        this.dataFimReserva = dataFimReserva;
        this.status = status;
    }

    @PrimaryKey
    public int id;
    public int carroId;
    public int locatarioId;
    public Date dataInicioReserva;
    public Date dataFimReserva;
    public String status;
}

