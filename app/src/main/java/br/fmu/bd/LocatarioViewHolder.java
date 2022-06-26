package br.fmu.bd;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LocatarioViewHolder extends RecyclerView.ViewHolder {
    final TextView cpf;
    final TextView email;
    final TextView nome;
    final TextView telefone;
    public LocatarioViewHolder(@NonNull View itemView) {
        super(itemView);

        cpf = itemView.findViewById(R.id.item_locatario_cpf);
        email = itemView.findViewById(R.id.item_locatario_email);
        nome = itemView.findViewById(R.id.item_locatario_nome);
        telefone = itemView.findViewById(R.id.item_locatario_telefone);
    }
}
