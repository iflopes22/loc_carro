package br.fmu.bd;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface AlunoDao {
    @Query("SELECT * from Aluno")
    List<Aluno> getAlunos();
    @Query("SELECT * from Aluno WHERE ra=:raAluno")
    Aluno buscarPorRa( int raAluno );
    @Insert
    void insertAll( Aluno ... alunos);
    @Delete
    void delete(Aluno ... alunos);
    @Update
    void update( Aluno ... alunos);
}
