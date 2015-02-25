package gobernacion.huila.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import gobernacion.huila.R;

/**
 * Created by Bryam on 25/02/2015.
 */
public class MenuActivity extends ActionBarActivity {

    private ImageView pregunta,tv,noticias, imagenes, audios, institucional;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().hide();
        pregunta=(ImageView) findViewById(R.id.btn_pregunta);
        pregunta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this, "PREGUNTANDO...", Toast.LENGTH_LONG).show();
                Intent intent = new Intent (MenuActivity.this,PreguntaActivity.class);
                startActivity(intent);
            }
        });
        tv=(ImageView) findViewById(R.id.btn_tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this,"TV...",Toast.LENGTH_LONG).show();
                Intent intent = new Intent (MenuActivity.this,TvActivity.class);
                startActivity(intent);

            }
        });
        noticias=(ImageView) findViewById(R.id.btn_noticias);
        noticias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this,"NOTICIAS...",Toast.LENGTH_LONG).show();
                Intent intent = new Intent (MenuActivity.this,NoticiasActivity.class);
                startActivity(intent);

            }
        });
        imagenes=(ImageView) findViewById(R.id.btn_image);
        imagenes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this, "IMAGENES...", Toast.LENGTH_LONG).show();
                Intent intent = new Intent (MenuActivity.this,ImagenesActivity.class);
                startActivity(intent);
            }
        });
        audios=(ImageView) findViewById(R.id.btn_audio);
        audios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this,"AUDIOS...",Toast.LENGTH_LONG).show();
                Intent intent = new Intent (MenuActivity.this,AudiosActivity.class);
                startActivity(intent);
            }
        });
        institucional=(ImageView) findViewById(R.id.btn_institucional);
        institucional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this,"INSTITUCIONAL...",Toast.LENGTH_LONG).show();
                Intent intent = new Intent (MenuActivity.this,InstitucionalActivity.class);
                startActivity(intent);

            }
        });
    }
}
