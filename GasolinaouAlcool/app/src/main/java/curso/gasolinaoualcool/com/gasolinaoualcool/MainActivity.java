package curso.gasolinaoualcool.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button botaoVerificar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = (EditText) findViewById(R.id.precoAlcoolID);
        precoGasolina = (EditText) findViewById(R.id.precoGasolinaID);
        botaoVerificar = (Button) findViewById(R.id.btnVerificar);
        textoResultado = (TextView) findViewById(R.id.txtResultadoID);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Recuperar valores

                String textoPrecoAlcool = precoAlcool.getText().toString();
                String textoPrecoGasolina = precoGasolina.getText().toString();

                //Converter valores

                double valorAlcool = Double.parseDouble(textoPrecoAlcool);
                double valorGasolina = Double.parseDouble(textoPrecoGasolina);

                //verificação - dividir o preço do alcool pela gasolina

                double resultado = valorAlcool / valorGasolina;

                if (resultado>= 0.7){
                    textoResultado.setText("É melhor utilizar gasoluna!");
                }else{
                    textoResultado.setText("É melhor utilizar alcool!");
                }
            }
        });
    }
}
