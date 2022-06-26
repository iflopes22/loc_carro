package br.fmu.bd;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

public interface ReservaDao {
    @Query("SELECT * from Reserva")
    List<Reserva> getReservas();
    @Query("SELECT * from Reserva WHERE id=:idReserva")
    Reserva buscarPorId( int idReserva );
    @Insert(onConflict= OnConflictStrategy.REPLACE)
    void insertAll( Reserva ... reservas);
    @Delete
    void delete(Reserva ... reservas);
    @Update
    void update( Reserva ... reservas);
}
