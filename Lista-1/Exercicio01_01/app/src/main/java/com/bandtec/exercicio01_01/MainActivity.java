package com.bandtec.exercicio01_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Desafio passado:
 * O Brasil é uma país muito grande e com vocabulários diferentes por estado. Para tentar
 * ilustrar isso, crie um app android que contenha 3 botões, um para cada estado diferente
 * escolha os estados que quiser).
 * Para cada botão clicado, exiba uma mensagem (Toast) com uma frase típica daquele estado.
 *
 * Desafio pessoal:
 * Utilizando uma unica função, descobrir qual botão foi apertado, e utilizar o texto para
 * condicionar a mensagem a ser mostrada na tela.
 *
 * @author Cristian Paixão
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void typicalPhrase(View v) {
        // Coletando texto do botão clicado
        Button b = (Button) v;
        String btnTxt = b.getText().toString();
        String resultText;

        // Condição para a frase
        if (btnTxt.equals("São Paulo")) {
            resultText = String.format("%s: Mano do céu, cê nem ta ligado nessa fita", btnTxt);
        } else if (btnTxt.equals("Ceará")) {
            resultText = String.format("%s: Me clique não cabra da peste!", btnTxt);
        } else {
            resultText = String.format("%s: Não é propina, é um incentivo...", btnTxt);
        }

        // Criando um Toast para a frase
        Toast.makeText(this, resultText, Toast.LENGTH_SHORT).show();
    }
}
