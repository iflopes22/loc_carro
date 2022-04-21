package br.fmu.bd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private EditText editTextRa;
    private EditText editTextNome;
    private EditText editTextDataNascimento;
    private EditText ediTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextRa = findViewById(R.id.editTextRa);
        editTextNome = findViewById(R.id.editTextNome);
        editTextDataNascimento = findViewById(R.id.editTextDataNascimento);
        ediTextEmail = findViewById(R.id.editTextEmail);
        //Intent intent = new Intent(this, ListaAlunosActivity.class);
        //startActivity(intent);
    }
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public void cadastrar( View view ) {
        AppDatabase db = AppDatabase.getInstance(this);
        AlunoDao dao = db.alunoDao();
        int ra = Integer.parseInt(editTextRa.getText().toString());
        String nome = editTextNome.getText().toString();
        Date dataNascimento = null;
        try {
            dataNascimento = dateFormat.parse(editTextDataNascimento.getText().toString());
        } catch( ParseException e ) {
            e.printStackTrace();
        }
        String email = ediTextEmail.getText().toString();
        Aluno aluno = new Aluno(ra,nome, dataNascimento,email);
        dao.insertAll(aluno);
    }

    public void listar(View view) {
        Intent intent = new Intent(this, ListaAlunosActivity.class);
        startActivity(intent);
    }
}