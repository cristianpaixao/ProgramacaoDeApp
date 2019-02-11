package com.bandtec.exercicio01_02;
/**
 * Costuma-se enumerar a média de gols de atacantes num campeonato. O atacante brasileiro
 * Gabriel Jesus, por exemplo, homenageou o Palmeiras com 1 gol para cada Mundial de Clubes
 * que ele tem na copa da Rússia em 2018.
 *
 * Crie um app android que tenha as seguintes entradas:
 * - O nome de um jogador;
 * - O número de jogos que disputou (só aceite números);
 * - O número de gols que marcou (só aceite números);
 * - Um botão com o texto "Calcular média"
 *
 * Ao clicar no botão, o app deve exibir a mensagem:
 * (Toast) "O jogador NOME teve uma média de X gols por partida"
 *
 * @author Cristian Paixão
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText editName;
    EditText editGames;
    EditText editGoals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.editName = findViewById(R.id.editName);
        this.editGames = findViewById(R.id.editGames);
        this.editGoals = findViewById(R.id.editGoals);
    }

    public void goalAverage(View v) {
        // Pegando valores
        int games = Integer.parseInt(this.editGames.getText().toString());
        int goals = Integer.parseInt(this.editGoals.getText().toString());
        String name = this.editName.getText().toString();

        // Tirando média (formatação + pequena solução paleativa permantente, vulgo gambi)
        DecimalFormat df = new DecimalFormat("#0.00");
        String average = df.format((double) goals / games);

        // Gerando resultado e lançando TOAST
        String result = "O jogador " + name + " fez uma média de " + average + " gols em " + games + " partidas";
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
    }


}
