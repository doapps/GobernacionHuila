package gobernacion.huila.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import gobernacion.huila.R;

/**
 * Created by Bryam on 25/02/2015.
 */
public class InicioActivity extends ActionBarActivity{

    private ImageView ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        getSupportActionBar().hide();

        ingresar=(ImageView) findViewById(R.id.btn_ingresar);
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(InicioActivity.this,"INGRESANDO...",Toast.LENGTH_LONG).show();
                Intent intent = new Intent (InicioActivity.this,MenuActivity.class);
                startActivity(intent);
            }
        });
    }
}
