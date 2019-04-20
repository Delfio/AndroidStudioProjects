package curso.idadedecachorro.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText lblidadeID;
    private Button btnResultadoID;
    private TextView txtResultadoID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblidadeID = (EditText) findViewById(R.id.lblidadeID);
        btnResultadoID = (Button) findViewById(R.id.btnResultadoID);
        txtResultadoID = (TextView) findViewById(R.id.txtResultadoID);

        btnResultadoID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Recuperar o que a pessoa digitou
                String textoDIgitado = lblidadeID.getText().toString(); //Convertendo o que foi pego para string

                if(textoDIgitado.isEmpty()){
                    //Retornando mensagem de erro
                    txtResultadoID.setText("Por Favor, insira a idade do seu cachorrinho!");
                }else {
                    int valorDigitado = Integer.parseInt( textoDIgitado );
                    int resultadoFinal = valorDigitado * 7;

                    txtResultadoID.setText("A idade do seu cachorrinho é: " + resultadoFinal);
                }
            }
        });
    }
}
