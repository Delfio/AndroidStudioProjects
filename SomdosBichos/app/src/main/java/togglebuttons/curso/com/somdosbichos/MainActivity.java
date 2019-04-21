package togglebuttons.curso.com.somdosbichos;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView cao;
    private ImageView gato;
    private ImageView leao;
    private ImageView macaco;
    private ImageView ovelha;
    private ImageView vaca;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cao = (ImageView) findViewById(R.id.cachorroID);
        gato = (ImageView) findViewById(R.id.gatoID);
        leao = (ImageView) findViewById(R.id.leaoID);
        macaco = (ImageView) findViewById(R.id.macacoID);
        ovelha = (ImageView) findViewById(R.id.ovelhaID);
        vaca = (ImageView) findViewById(R.id.vacaID);


        //fazer um evento para todos os botões para depois verificar


        /*cao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/


        //apenas retornando os IDs para ser executados na outra função
        cao.setOnClickListener(this);
        gato.setOnClickListener(this);
        leao.setOnClickListener(this);
        macaco.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        vaca.setOnClickListener(this);


    }

    //Idepdende do clicke ele irá executar esse methodo

    @Override
    public void onClick(View v) {
        //v.getId(); para pegar os ids que foram clicados, idepdente de qual

        switch (v.getId()){

            case R.id.cachorroID:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.cao);
                tocarSom(); //criando metodo para tocar o som
                break;

            case R.id.gatoID:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.gato);
                tocarSom(); //criando metodo para tocar o som
                break;

            case R.id.leaoID:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.leao);
                tocarSom(); //criando metodo para tocar o som
                break;

            case R.id.macacoID:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.macaco);
                tocarSom(); //criando metodo para tocar o som
                break;
            case R.id.ovelhaID:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.ovelha);
                tocarSom(); //criando metodo para tocar o som
                break;

            case R.id.vacaID:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.vaca);
                tocarSom(); //criando metodo para tocar o som
                break;
        }

    }

    public void  tocarSom(){
        if (mediaPlayer != null){
            mediaPlayer.start();
        }
    }

    //Limpando a memória do celular quando o app for fechado
    @Override
    protected void onDestroy() {

        if (mediaPlayer != null) {

            mediaPlayer.release();
            mediaPlayer = null;
        }
        super.onDestroy();
    }
}
