package questionarioserie.curso.com.quantovocegostadeseries;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private ImageView exibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBarID);
        exibicao = (ImageView) findViewById(R.id.imagemexibicaoID);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int valorProgresso = progress;
                if (valorProgresso == 1){
                    exibicao.setImageResource(R.drawable.pouco);
                }else if (valorProgresso == 2){
                    exibicao.setImageResource(R.drawable.medio);
                }else if (valorProgresso == 3){
                    exibicao.setImageResource(R.drawable.muito);
                }else if (valorProgresso == 4){
                    exibicao.setImageResource(R.drawable.susto);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Escolha Sabiamente ", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
