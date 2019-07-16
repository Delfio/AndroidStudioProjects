package corpreferida.curso.com.corpreferida;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButtonSelecionado;
    private Button botaoSalvar;

    private static final String ARQUIVO_PREFERENCIA = "ArqPreferencia";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGrupID);
        botaoSalvar = (Button) findViewById(R.id.buttonSalvarID);

        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Pegando o id
                int idRadioButtonEscolhido = radioGroup.getCheckedRadioButtonId();

                if (idRadioButtonEscolhido > 0 ) {
                    radioButtonSelecionado = (RadioButton) findViewById(idRadioButtonEscolhido);
                    SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIA,0);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("Cor Escolhida", radioButtonSelecionado.getText().toString());

                }
            }
        });
    }
}
