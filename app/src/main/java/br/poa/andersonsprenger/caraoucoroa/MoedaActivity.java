package br.poa.andersonsprenger.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MoedaActivity extends AppCompatActivity {

    ImageView moeda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moeda);
        moeda = findViewById(R.id.moeda);
        boolean cara = getIntent().getExtras().getBoolean("cara");
        if (!cara){
            moeda.setImageResource(R.drawable.moeda_coroa);
        }
    }

    public void voltar(View view){
        finish();
    }
}