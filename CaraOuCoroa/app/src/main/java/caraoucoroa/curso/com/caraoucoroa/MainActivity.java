package caraoucoroa.curso.com.caraoucoroa;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView botaoJogar;

    private String[] opcao = {"Cara", "Coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = (ImageView) findViewById(R.id.botaoJogarID);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Gerar numeros aleartórios
                Random randomico = new Random();
                int numero_aleatorio = randomico.nextInt(2);

                //opcao[numero_aleatorio];

                Intent intent = new Intent(MainActivity.this, DetalheActivity.class);
                intent.putExtra("opção", opcao[numero_aleatorio]);

                startActivity(intent);

            }
        });
    }
}
