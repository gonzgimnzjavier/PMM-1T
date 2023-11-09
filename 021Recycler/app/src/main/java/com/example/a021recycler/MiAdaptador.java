package com.example.a021recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.MiViewHolder> {

    private List<String> nameList;
    private List<String> detailList;


    public MiAdaptador(List<String> nameList, List<String> detailList) {
        this.nameList = nameList;
        this.detailList = detailList;
    }

    @NonNull
    @Override
    public MiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.elemento, parent, false);
        return new MiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MiViewHolder holder, int position) {
        final String name = nameList.get(position);
        final String detail = detailList.get(position);

        holder.textView.setText(name);
        holder.detailView.setText(detail);
    }

    @Override
    public int getItemCount() {
        return nameList != null ? nameList.size() : 0;
    }

    public class MiViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public TextView detailView;

        public MiViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.texto);
            detailView = itemView.findViewById(R.id.detalle);
        }
    }
}
