package radiobuttons.curso.com.radiobuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioEscolhido;
    private Button botaoEscolher;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioButtonID);
        botaoEscolher = (Button) findViewById(R.id.buttonEscolherID);
        textoResultado = (TextView) findViewById(R.id.resultadoID);

        botaoEscolher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int idRadioButtonEscolhido = radioGroup.getCheckedRadioButtonId();
                // textoResultado.setText("id: "+ R.id.radioButtonID)

                if (idRadioButtonEscolhido > 0){

                    radioEscolhido = (RadioButton) findViewById( idRadioButtonEscolhido );
                    //adioEscolhido.getText();
                    textoResultado.setText(radioEscolhido.getText());

                }
            }
        });
    }
}
