package sharedpreferences.curso.com.sharedpreference;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nome;
    private Button enviar;
    private TextView resultado;


    //arquivo de preferencia constante - static final"
    //Final = Não pode ser mudado
    //Static = Constate
    private static final String ARQUIVO_PREFERENCE = "ArquivoPreferencia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = (EditText) findViewById(R.id.textoNomeID);
        resultado = (TextView) findViewById(R.id.textoResultadoID);
        enviar = (Button) findViewById(R.id.buttonSalvarID);



        //Evento que salva o que foi digitado
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCE,0);
                SharedPreferences.Editor editor = sharedPreferences.edit();

                if (nome.getText().toString().equals("")){

                    Toast.makeText(MainActivity.this,"Porfavor preencher o nome", Toast.LENGTH_SHORT).show();

                }else {
                    editor.putString("nome", nome.getText().toString());
                    editor.commit();
                }
            }
        });

        //Recuperar dados salvos

        SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCE,0);

        if (sharedPreferences.contains("nome")){

            String nomeUsuario = sharedPreferences.getString("nome", "Usúario não definicdo");
            resultado.setText("Olá, "+nomeUsuario);
        }else {
            resultado.setText("Olá, Usuário não definido");
        }
    }
}
