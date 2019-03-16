package com.feranstirman.ejercicio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView panel1,panel2,panel3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        panel1= findViewById(R.id.panel_rojo);
        panel2 = findViewById(R.id.panel_verde);
        panel3 = findViewById(R.id.panel_azul);

        panel1.setOnClickListener(this);
        panel2.setOnClickListener(this);
        panel3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int rojos[] = {R.color.rojo1,R.color.rojo2,R.color.rojo3,R.color.rojo4,R.color.rojo5,R.color.rojo6};
        int verdes[] = {R.color.verde1,R.color.verde2,R.color.verde3,R.color.verde4,R.color.verde5,R.color.verde6};
        int azules[] = {R.color.azul1,R.color.azul2,R.color.azul3,R.color.azul4,R.color.azul5,R.color.azul6};

        switch(v.getId()){
            case R.id.panel_rojo:
                panel1.setBackgroundColor(getResources().getColor(rojos[(int)(Math.random()*6)]));
                break;
            case R.id.panel_verde:
                panel2.setBackgroundColor(getResources().getColor(verdes[(int)(Math.random()*6)]));
                break;
            case R.id.panel_azul:
                panel3.setBackgroundColor(getResources().getColor(azules[(int)(Math.random()*6)]));
                break;
        }

    }
}
