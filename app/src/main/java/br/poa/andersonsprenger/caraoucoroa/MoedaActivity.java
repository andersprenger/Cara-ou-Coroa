package br.poa.andersonsprenger.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MoedaActivity extends AppCompatActivity {

    Intent voltar;
    ImageView moeda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moeda);
        moeda = findViewById(R.id.moeda);
        voltar = new Intent(this, MainActivity.class);
        boolean cara = getIntent().getExtras().getBoolean("cara");
        if (!cara){
            moeda.setImageResource(R.drawable.moeda_coroa);
        }
    }

    public void voltar(View view){
        startActivity(voltar);
    }
}