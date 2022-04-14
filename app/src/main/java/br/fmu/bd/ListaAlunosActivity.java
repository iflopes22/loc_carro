package br.fmu.bd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridLayout;

import java.util.List;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);
        RecyclerView recyclerView = findViewById(R.id.recycler);
        AppDatabase db = AppDatabase.getInstance(this);
        AlunoDao dao = db.alunoDao();
        List<Aluno> alunos = dao.getAlunos();
        recyclerView.setAdapter( new AlunoAdapter(alunos,this));
        RecyclerView.LayoutManager layout = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        //RecyclerView.LayoutManager layout = new GridLayoutManager(this,3 );
        recyclerView.setLayoutManager(layout);
    }
}