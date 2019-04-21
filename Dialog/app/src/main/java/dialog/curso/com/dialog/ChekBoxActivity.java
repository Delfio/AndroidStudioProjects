package dialog.curso.com.dialog;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class ChekBoxActivity extends AppCompatActivity {

    private CheckBox cao;
    private CheckBox gato;
    private CheckBox passaro;
    private Button mostrar;
    private TextView mostrarOpcao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chek_box);

        cao = (CheckBox) findViewById(R.id.chekboxCachorroID);
        gato = (CheckBox) findViewById(R.id.checkBoxGatoID);
        passaro = (CheckBox) findViewById(R.id.checkBoxPassadoID);

        mostrar = (Button) findViewById(R.id.buttonMostarID);
        mostrarOpcao = (TextView) findViewById(R.id.textoExibicaoID);

        mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String itensSelecionado = "Itens: " + "\n";



                if (cao.isChecked() == true){
                    itensSelecionado += cao.getText().toString() + "\n";
                }if(gato.isChecked() == true){
                    itensSelecionado += gato.getText().toString()+ "\n";
                }if (passaro.isChecked() == true){
                    itensSelecionado+=passaro.getText().toString()+ "\n";
                }

                //cao.getText().toString()

                mostrarOpcao.setText(itensSelecionado);

            }
        });
    }
}
