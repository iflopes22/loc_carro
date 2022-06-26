package br.fmu.bd;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

public interface CarroDao {
    @Query("SELECT * from Carro")
    List<Carro> getCarros();
    @Query("SELECT * from Carro WHERE id=:idCarro")
    Carro buscarPorId( int idCarro );
    @Insert(onConflict= OnConflictStrategy.REPLACE)
    void insertAll( Carro ... carros);
    @Delete
    void delete(Carro ... carros);
    @Update
    void update( Carro ... carros);
}