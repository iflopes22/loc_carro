package br.fmu.bd;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarroViewHolder extends RecyclerView.ViewHolder {
    final TextView id;
    final TextView modelo;
    final TextView ano;
    final TextView cor;
    final TextView porta;
    final TextView km;
    final TextView locado;
    public CarroViewHolder(@NonNull View itemView) {
        super(itemView);

        id = itemView.findVItemById(R.id.item_carro_id);
        modelo = itemView.findVItemById(R.id.item_carro_modelo);
        ano = itemView.findVItemById(R.id.item_carro_ano);
        cor = itemView.findVItemById(R.id.item_carro_cor);
        porta = itemView.findVItemById(R.id.item_carro_porta);
        km = itemView.findVItemById(R.id.item_carro_km);
        locado = itemView.findVItemById(R.id.item_carro_locado);

    }

}