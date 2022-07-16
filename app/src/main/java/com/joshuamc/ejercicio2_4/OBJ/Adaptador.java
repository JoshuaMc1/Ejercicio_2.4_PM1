package com.joshuamc.ejercicio2_4.OBJ;

import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.joshuamc.ejercicio2_4.R;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder>{
    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView descripcion;
        ImageView imagen;
        public ViewHolder (View itemView){
            super(itemView);
            descripcion=(TextView)itemView.findViewById(R.id.txt2);
            imagen=(ImageView) itemView.findViewById(R.id.profile_image);
        }
    }

    public List<Signatures> lista;
    public Adaptador(List<Signatures>lista){ this.lista=lista;}

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        ViewHolder viewholder=new ViewHolder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.descripcion.setText(lista.get(position).getDescripcion());
        holder.imagen.setImageBitmap(BitmapFactory.decodeByteArray(lista.get(position).getFirma(),0,lista.get(position).getFirma().length));
    }
    @Override
    public int getItemCount() {
        return lista.size();
    }
}
