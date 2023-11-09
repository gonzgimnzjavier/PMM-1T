package com.example.ejercicioexamen;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private Spinner spinner;
    private TextView selectedTeamName;
    private ImageView selectedTeamBadge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spinner = findViewById(R.id.spinner);
        selectedTeamName = findViewById(R.id.selected_team_name);
        selectedTeamBadge = findViewById(R.id.selected_team_badge);


        List<EquipoBalonmano> listaEquipos = new ArrayList<>();
        listaEquipos.add(new EquipoBalonmano("Club Deportivo Baskonia", "Vitoria", "España", 1959, R.drawable.esapnia));
        listaEquipos.add(new EquipoBalonmano("PanathinaikosBasketball Club", "Atenas", "Grecia", 1919, R.drawable.grecia));
        listaEquipos.add(new EquipoBalonmano("Košarkaški Klub Crvena Zvezda", "Belgrado", "Serbia", 1945, R.drawable.serbia));
        listaEquipos.add(new EquipoBalonmano("Maccabi Basketball Club", "Tel Aviv", "Israel", 1932, R.drawable.isarael));
        listaEquipos.add(new EquipoBalonmano("Basketball Club Žalgiris", "Kaunas", "Lituana", 1944, R.drawable.lituania));


        EquipoBalonmanoAdapter adapter = new EquipoBalonmanoAdapter(this, listaEquipos);
        spinner.setAdapter(adapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                EquipoBalonmano seleccionado = (EquipoBalonmano) parent.getItemAtPosition(position);


                selectedTeamName.setText(seleccionado.getNombre());


                selectedTeamBadge.setImageResource(seleccionado.getImagenEscudo());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
