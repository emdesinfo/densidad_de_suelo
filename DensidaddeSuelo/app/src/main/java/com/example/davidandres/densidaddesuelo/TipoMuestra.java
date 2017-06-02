package com.example.davidandres.densidaddesuelo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by DAVIDANDRES on 31-05-2017.
 */

public class TipoMuestra extends Activity{

    EditText numeroBoletaTipoEnsayo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tipo_muestra);

        Bundle datos = getIntent().getExtras();
        String numeroBoletaMostrar = datos.getString("proctor");
        numeroBoletaTipoEnsayo = (EditText) findViewById(R.id.editTextNumeroBoletaTipoEnsayo);
        numeroBoletaTipoEnsayo.setText(numeroBoletaMostrar);



        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    /*public void llevaDatosProctor(View view){
        String boleta = numeroBoleta.getText().toString();
        if(!boleta.isEmpty()){
            Intent r = new Intent(this,TipoMuestra.class);
            r.putExtra("protor" , boleta);
            startActivity(r);
        }else{
            Intent r = new Intent(this,TipoMuestra.class);
            r.putExtra("vacio","vacio");
            startActivity(r);
        }
    }*/



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
