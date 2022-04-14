package br.fmu.bd;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AlunoViewHolder extends RecyclerView.ViewHolder {
    final TextView ra;
    final TextView nome;


    public AlunoViewHolder(@NonNull View itemView) {
        super(itemView);
        ra = itemView.findViewById(R.id.textView);
        nome = itemView.findViewById(R.id.textView2);
    }
}
