package com.favio.loteria;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_limpiar, btn_carta1, btn_carta2, btn_carta3, btn_carta4, btn_carta5, btn_carta6, btn_carta7, btn_carta8,
            btn_carta9, btn_carta10, btn_carta11, btn_carta12, btn_carta13, btn_carta14, btn_carta15, btn_carta16, btn;
    TextView txtv_ganador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_limpiar=findViewById(R.id.btn_limpiar);
        btn_carta1=findViewById(R.id.btn_carta1);
        btn_carta2=findViewById(R.id.btn_carta2);
        btn_carta3=findViewById(R.id.btn_carta3);
        btn_carta4=findViewById(R.id.btn_carta4);
        btn_carta5=findViewById(R.id.btn_carta5);
        btn_carta6=findViewById(R.id.btn_carta6);
        btn_carta7=findViewById(R.id.btn_carta7);
        btn_carta8=findViewById(R.id.btn_carta8);
        btn_carta9=findViewById(R.id.btn_carta9);
        btn_carta10=findViewById(R.id.btn_carta10);
        btn_carta11=findViewById(R.id.btn_carta11);
        btn_carta12=findViewById(R.id.btn_carta12);
        btn_carta13=findViewById(R.id.btn_carta13);
        btn_carta14=findViewById(R.id.btn_carta14);
        btn_carta15=findViewById(R.id.btn_carta15);
        btn_carta16=findViewById(R.id.btn_carta16);
        txtv_ganador=findViewById(R.id.txtv_ganador);

        btn_carta1.setOnClickListener(this);
        btn_carta2.setOnClickListener(this);
        btn_carta3.setOnClickListener(this);
        btn_carta4.setOnClickListener(this);
        btn_carta5.setOnClickListener(this);
        btn_carta6.setOnClickListener(this);
        btn_carta7.setOnClickListener(this);
        btn_carta8.setOnClickListener(this);
        btn_carta9.setOnClickListener(this);
        btn_carta10.setOnClickListener(this);
        btn_carta11.setOnClickListener(this);
        btn_carta12.setOnClickListener(this);
        btn_carta13.setOnClickListener(this);
        btn_carta14.setOnClickListener(this);
        btn_carta15.setOnClickListener(this);
        btn_carta16.setOnClickListener(this);

        btn_limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                limpiar();
            }
        });

    }

    @Override
    public void onClick(View v) {

        btn=(Button)v;
        btn.setText("X");
        btn.setTextColor(Color.RED);
    }

    public void restablecerTextoBotones(){

        LinearLayout ll_botones1=(LinearLayout)findViewById(R.id.ll_botones1);
        LinearLayout ll_botones2=(LinearLayout)findViewById(R.id.ll_botones2);
        LinearLayout ll_botones3=(LinearLayout)findViewById(R.id.ll_botones3);
        LinearLayout ll_botones4=(LinearLayout)findViewById(R.id.ll_botones4);

        int numBotones=ll_botones1.getChildCount();

        for (int i=0; i<numBotones; i++){

            View v1=ll_botones1.getChildAt(i);
            View v2=ll_botones2.getChildAt(i);
            View v3=ll_botones3.getChildAt(i);
            View v4=ll_botones4.getChildAt(i);
            Button btnTexto1=(Button)v1;
            Button btnTexto2=(Button)v2;
            Button btnTexto3=(Button)v3;
            Button btnTexto4=(Button)v4;
            btnTexto1.setText(" ");
            btnTexto2.setText(" ");
            btnTexto3.setText(" ");
            btnTexto4.setText(" ");
        }
    }

    public void limpiar(){

        restablecerTextoBotones();
        txtv_ganador.setText("");
    }


}
