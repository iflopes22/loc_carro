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

public class LocatarioAdapter extends RecyclerView.Adapter {
    private static final String TAG = "LocatarioAdapter";
    private List<Locatario> locatarios;
    private Context context;
    public LocatarioAdapter(List<Locatario> locatarios, Context context) {
        this.locatarios = locatarios;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_locatario,parent,false);
        return new LocatarioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Log.d(TAG,"position:" + position);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        LocatarioViewHolder locatarioHolder = (LocatarioViewHolder) holder;
        Locatario locatario = locatarios.get(position);
        lcoatarioHolder.cpf.setText(Integer.toString(locatario.cpf));
        lcoatarioHolder.nome.setText(locatario.nome);
        lcoatarioHolder.email.setText(locatario.email);
        lcoatarioHolder.telefone.setText(locatario.telefone);
    }

    @Override
    public int getItemCount() {
        return locatarios.size();
    }
}

