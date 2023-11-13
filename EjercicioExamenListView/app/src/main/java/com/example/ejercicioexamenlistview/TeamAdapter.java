package com.example.ejercicioexamenlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TeamAdapter extends ArrayAdapter<Team> {
    public TeamAdapter(Context context, ArrayList<Team> teams) {
        super(context, 0, teams);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Team team = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        ImageView imageViewEscudo = convertView.findViewById(R.id.imageViewEscudo);
        TextView textViewNombre = convertView.findViewById(R.id.textViewNombre);
        TextView textViewCiudad = convertView.findViewById(R.id.textViewCiudad);
        TextView textViewAnoFundacion = convertView.findViewById(R.id.textViewAnoFundacion);

        imageViewEscudo.setImageResource(team.getImageResourceId());
        textViewNombre.setText(team.getName());
        textViewCiudad.setText(team.getCity());
        textViewAnoFundacion.setText(team.getYearOfFoundation());

        return convertView;
    }
}
