package togglebuttons.curso.com.togglebuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton;
    private TextView textoExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = (ToggleButton) findViewById(R.id.toggleButtonID);
        textoExibicao = (TextView) findViewById(R.id.textoResultado);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                textoExibicao.setText("");

                //o metodo ischeked já vem de padrão 0 ou 1, precisando apenas verificar
                //Se ele não é nulo!

                if ( isChecked ){
                    textoExibicao.setText("Mostrar....");
                }
            }
        });
    }
}
