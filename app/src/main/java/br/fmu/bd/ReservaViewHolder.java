package br.fmu.bd;

import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ReservaViewHolder extends RecyclerView.ViewHolder {
    final TextView id;
    final TextView carroId;
    final TextView locatarioId;
    final TextView dataInicioReserva;
    final TextView dataFimReserva;
    final TextView status;
    public ReservaViewHolder(@NonNull View itemView) {
        super(itemView);

        id = itemView.findVIewById(R.id.item_reserva_id);
        carroId = itemView.findVIewById(R.id.item_reserva_carroId);
        locatarioId = itemView.findVIewById(R.id.item_reserva_locatarioId);
        dataInicioReserva = itemView.findVIewById(R.id.item_reserva_dataInicioReserva);
        dataFimReserva = itemView.findVIewById(R.id.item_dataFimReserva);
        status = itemView.findVIewById(R.id.status);

    }

}
