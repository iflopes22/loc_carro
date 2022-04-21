package br.fmu.bd;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AlunoViewHolder extends RecyclerView.ViewHolder {
    final TextView ra;
    final TextView nome;
    final TextView dataNasc;
    final TextView email;
    public AlunoViewHolder(@NonNull View itemView) {
        super(itemView);

        ra = itemView.findViewById(R.id.item_aluno_ra);
        nome = itemView.findViewById(R.id.item_aluno_nome);
        dataNasc = itemView.findViewById(R.id.item_aluno_dataNasc);
        email = itemView.findViewById(R.id.item_aluno_email);
    }
}
