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

public class ReservaAdapter extends RecyclerView.Adapter {
    private static final String TAG = "ReservaAdapter";
    private List<Reserva> reservas;
    private Context context;
    public ReservaAdapter(List<Reserva> reservas, Context context) {
        this.reservas = reservas;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_reserva,parent,false);
        return new ReservaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Log.d(TAG,"position:" + position);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        ReservaViewHolder reservaHolder = (ReservaViewHolder) holder;
        Reserva reserva = reservas.get(position);
        reservaHolder.id.setText(Integer.toString(reserva.id));
        reservaHolder.carroId.setText(reserva.carroId);
        reservaHolder.locatarioId.setText(reserva.locatarioId)
        reservaHolder.dataInicioReserva.setText(dateFormat.format(reserva.dataInicioReserva));
        reservaHolder.dataFimReserva.setText(dateFormat.format(reserva.dataFimReserva));
        reservaHolder.status.setText(reserva.status);
    }

    @Override
    public int getItemCount() {
        return reservas.size();
    }
}
