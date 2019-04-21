       package dialog.curso.com.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

       public class MainActivity extends Activity {

    private Button bottao;

   private Button proxima;

    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottao = (Button) findViewById(R.id.buttonID);

        proxima = (Button) findViewById(R.id.ButtonProximoID);
        bottao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //atribuir
                dialog = new AlertDialog.Builder(MainActivity.this);
                //Configurar
                dialog.setTitle("Titulo da Dialog!");//Titulo
                dialog.setMessage("Setar a mensagem");//Mensagem

                //Atribuindo a função de proibido sair da dialog
                //dialog.setCancelable(false);

                //Definir icone
                dialog.setIcon(android.R.drawable.ic_delete);

                //Opção negativa com evento no clique
                dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(MainActivity.this, "Botão não clicaco", Toast.LENGTH_SHORT).show();

                    }

                });

                dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Botão sim clicado!", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.create();
                dialog.show();

            }
        });

        proxima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ChekBoxActivity.class));
            }
        });
    }
}
