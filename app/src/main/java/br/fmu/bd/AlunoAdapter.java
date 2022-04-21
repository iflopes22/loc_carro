package br.fmu.bd;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.List;

public class AlunoAdapter extends RecyclerView.Adapter {
    private static final String TAG = "AlunoAdapter";
    private List<Aluno> alunos;
    private Context context;
    public AlunoAdapter(List<Aluno> alunos, Context context) {
        this.alunos = alunos;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_aluno,parent,false);
        return new AlunoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Log.d(TAG,"position:" + position);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        AlunoViewHolder alunoHolder = (AlunoViewHolder) holder;
        Aluno aluno = alunos.get(position);
        alunoHolder.ra.setText(Integer.toString(aluno.ra));
        alunoHolder.nome.setText(aluno.nome);
        alunoHolder.dataNasc.setText(dateFormat.format(aluno.dataNascimento));
        alunoHolder.email.setText(aluno.email);
    }

    @Override
    public int getItemCount() {
        return alunos.size();
    }
}
