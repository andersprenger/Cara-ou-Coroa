package br.poa.andersonsprenger.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Intent jogarMoeda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jogarMoeda = new Intent(this, MoedaActivity.class);
    }

    public void jogar(View view){
        boolean cara = new Random().nextBoolean();
        jogarMoeda.putExtra("cara", cara);
        startActivity(jogarMoeda);
    }
}