package com.example.daftarmakanan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class kulinerAdapater extends RecyclerView.Adapter<kulinerAdapater.ViewHolder> {
    private ArrayList<Kuliner> listkuliner;

    public kulinerAdapater(ArrayList<Kuliner> listkuliner) {
        this.listkuliner = listkuliner;
    }

    @NonNull
    @Override
    public kulinerAdapater.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder holder = new ViewHolder(inflater.inflate(R.layout.item_kuliner, parent, false));
        return holder;
    }
    @Override
    public void onBindViewHolder(@NonNull kulinerAdapater.ViewHolder holder, int position) {
        Kuliner kuliner = listkuliner.get(position);
        holder.txtNama.setText(kuliner.getNama());
        holder.txtRasa.setText(kuliner.getRasa());
        holder.imgfoto.setImageResource(kuliner.getId_gambar());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.itemView.getContext(), kuliner.getDeskripsi(), Toast.LENGTH_LONG).show();

            }
        });


    }

    @Override
    public int getItemCount() {
        return listkuliner.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtNama, txtRasa;
        public ImageView imgfoto;
        public ConstraintLayout itemView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNama = (TextView) itemView.findViewById(R.id.txtNama1);
            txtRasa = (TextView) itemView.findViewById(R.id.txtRasa);
            imgfoto = (ImageView) itemView.findViewById(R.id.imgfoto);
            this.itemView = (ConstraintLayout) itemView.findViewById(R.id.mainLayout);
        }
    }
}