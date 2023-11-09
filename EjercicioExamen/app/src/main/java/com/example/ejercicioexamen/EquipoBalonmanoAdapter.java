package com.example.ejercicioexamen;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class EquipoBalonmanoAdapter extends ArrayAdapter<EquipoBalonmano> {

    public EquipoBalonmanoAdapter(Context context, List<EquipoBalonmano> equipos) {
        super(context, 0, equipos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        EquipoBalonmano equipo = getItem(position);


        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.spinner_item, parent, false);
        }


        TextView nombreTextView = (TextView) convertView.findViewById(R.id.nombre);
        TextView infoTextView = (TextView) convertView.findViewById(R.id.info);
        ImageView escudoImageView = (ImageView) convertView.findViewById(R.id.escudo);


        nombreTextView.setText(equipo.getNombre());
        String info = equipo.getCiudad() + ", " + equipo.getPais() + " - " + equipo.getAnioFundacion();
        infoTextView.setText(info);
        escudoImageView.setImageResource(equipo.getImagenEscudo());

        return convertView;
    }


    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getView(position, convertView, parent);
    }
}

