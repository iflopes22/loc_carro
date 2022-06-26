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

public class CarroAdapter extends RecyclerView.Adapter {
    private static final String TAG = "CarroAdapter";
    private List<Carro> carros;
    private Context context;
    public CarroAdapter(List<Carro> carros, Context context) {
        this.carros = carros;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_carro,parent,false);
        return new CarroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Log.d(TAG,"position:" + position);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        CarroViewHolder carroHolder = (CarroViewHolder) holder;
        Carro carro = carros.get(position);
        lcoatarioHolder.id.setText(Integer.toString(carro.id));
        lcoatarioHolder.id.setText((carro.modelo));
        lcoatarioHolder.id.setText(Integer.toString(carro.ano));
        lcoatarioHolder.id.setText((carro.cor));
        lcoatarioHolder.id.setText(Integer.toString(carro.porta));
        lcoatarioHolder.id.setText(Integer.toString(carro.km));
        lcoatarioHolder.id.setText((carro.locado));

    }

    @Override
    public int getItemCount() {
        return locatarios.size();
    }
}

