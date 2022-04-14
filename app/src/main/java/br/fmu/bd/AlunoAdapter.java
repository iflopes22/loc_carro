package br.fmu.bd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AlunoAdapter extends RecyclerView.Adapter {

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
        AlunoViewHolder alunoHolder = (AlunoViewHolder) holder;
        Aluno aluno = alunos.get(position);
        alunoHolder.ra.setText(Integer.toString(aluno.ra));
        alunoHolder.nome.setText(aluno.nome);
    }

    @Override
    public int getItemCount() {
        return alunos.size();
    }
}
