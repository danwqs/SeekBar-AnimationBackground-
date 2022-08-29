package com.DaniloDev.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBarEscala;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout LinearLayout = findViewById(R.id.mainActivity);

        AnimationDrawable animationDrawable = (AnimationDrawable) LinearLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();

        seekBarEscala = findViewById(R.id.seekBarEscala);
        textoResultado = findViewById(R.id.textoResultado);

        seekBarEscala.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //textoResultado.setText("onProgressChanges");
                textoResultado.setText("Progresso:" + progress + "/" + seekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //textoResultado.setText("onStartTrackingTouch");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //textoResultado.setText("public void onStopTrackingTouch");
            }
        });
    }

    public void recuperarProgresso(View view) {

        textoResultado.setText("Escolhido: " + seekBarEscala.getProgress());

    }


}