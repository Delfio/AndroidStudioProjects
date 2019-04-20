package sgnos.curso.com.signos;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView listadeSignos;
    private String[] signos = {
        "Áries", "Escorpião", "Gêmeos", "Peixes", "Virgem", "Touro",
            "Libra", "Câncer"
    };

    private String[] infos = {
            "Rotina e paciência são duas palavras que não combinam com arianos.",
            "Para eles, tudo é possível, menos esperar. A resposta tem que ser sempre imediata.",
            "Nativos de Áries têm a capacidade de reagir automaticamente e de enfrentar de cara qualquer situação",
            "São bons em lutas e sempre conseguem conquistar aquilo que desejam.",
            "Apesar de serem extrovertidos ao extremo, os arianos também conseguem ter seus momentos de seriedade",
            "1111111111111111111111111111",
            "11111111111111111111111111111111111111111111111111",
            "11111111111111111111111111111111111111111111111111",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listadeSignos = (ListView) findViewById(R.id.listViewID);

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
        );

        listadeSignos.setAdapter( adapter );

        //Pega o valor do argumento que foi clicado e armazena ele na variavel "position"
        listadeSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //infos=[position];
                int codigoPosicao = position;
                Toast.makeText(
                        getApplicationContext(),
                        infos[position], Toast.LENGTH_LONG
                ).show();
            }
        });

    }
}
