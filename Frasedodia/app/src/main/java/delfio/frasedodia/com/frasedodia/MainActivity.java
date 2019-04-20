package delfio.frasedodia.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases = {
            "Domar o seu estresse não é simples, embora seja perfeitamente possível.",
            "Avaliar seriamente como você responde sob pressão é o primeiro passo produtivo na direção correta.",
            "Mudar a sua percepção pode ser o início do caminho da ansiedade até a liberdade."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.txtNovaFraseid);
        botaoNovaFrase = (Button) findViewById(R.id.btnNovaFraseId);

        //textoNovaFrase.setText(frases[0]);
        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomico = new Random();

                int numeroAleartorio = randomico.nextInt(frases.length);//descobrir o tamanho da lista - numero de elementos

                textoNovaFrase.setText(frases[numeroAleartorio]);
            }
        });

    }
}
