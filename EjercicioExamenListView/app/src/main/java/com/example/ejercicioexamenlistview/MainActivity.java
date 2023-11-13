package com.example.ejercicioexamenlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private TeamAdapter teamAdapter;
    private ArrayList<Team> teams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        teams = new ArrayList<>();

        // Agregar equipos de baloncesto a la lista
        // teams.add(new Team("Nombre del equipo", "Ciudad", "País", "Año de fundación", R.mipmap.ic_launcher));
        teams.add(new Team("Club Deportivo Baskonia", "Vitoria", "España", "1959", R.drawable.baskonia));
        teams.add(new Team("Košarkaški Klub Crvena Zvezda", "Belgrado", "Serbia", "1945", R.drawable.zvezda));
        teams.add(new Team("Maccabi Basketball Club ", "Tel Aviv", "Israel", "1932", R.drawable.maccabi));
        teams.add(new Team("Basketball Club Žalgiris", "Kaunas", "Lituania", "1944", R.drawable.zalgaris));
        teams.add(new Team("PanathinaikosBasketball Club", "Atenas", "Grecia", "1919", R.drawable.panathinakos));

        teamAdapter = new TeamAdapter(this, teams);
        listView.setAdapter(teamAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Team selectedTeam = teams.get(position);


                TextView selectedTeamName = findViewById(R.id.selectedTeamName);
                ImageView selectedTeamLogo = findViewById(R.id.selectedTeamLogo);


                selectedTeamName.setText(selectedTeam.getName());
                selectedTeamLogo.setImageResource(selectedTeam.getImageResourceId());


            }
        });

    }
}
