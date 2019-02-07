package com.favio.loteria;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_limpiar, btn_carta1, btn_carta2, btn_carta3, btn_carta4, btn_carta5, btn_carta6, btn_carta7, btn_carta8,
            btn_carta9, btn_carta10, btn_carta11, btn_carta12, btn_carta13, btn_carta14, btn_carta15, btn_carta16;
    String valorCarta1=" ", valorCarta2=" ", valorCarta3=" ", valorCarta4=" ", valorCarta5=" ", valorCarta6=" ", valorCarta7=" ", valorCarta8=" ",
            valorCarta9=" ", valorCarta10=" ", valorCarta11=" ", valorCarta12=" ", valorCarta13=" ", valorCarta14=" ", valorCarta15=" ", valorCarta16=" ";
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

        btn_limpiar.setOnClickListener(this);
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
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.btn_carta1:
                btn_carta1.setText("X");
                btn_carta1.setTextColor(Color.RED);
                valorCarta1=btn_carta1.getText().toString();
                comparar();
                break;
            case R.id.btn_carta2:
                btn_carta2.setText("X");
                btn_carta2.setTextColor(Color.RED);
                valorCarta2=btn_carta2.getText().toString();
                comparar();
                break;
            case R.id.btn_carta3:
                btn_carta3.setText("X");
                btn_carta3.setTextColor(Color.RED);
                valorCarta3=btn_carta3.getText().toString();
                comparar();
                break;
            case R.id.btn_carta4:
                btn_carta4.setText("X");
                btn_carta4.setTextColor(Color.RED);
                valorCarta4=btn_carta4.getText().toString();
                comparar();
                break;
            case R.id.btn_carta5:
                btn_carta5.setText("X");
                btn_carta5.setTextColor(Color.RED);
                valorCarta5=btn_carta5.getText().toString();
                comparar();
                break;
            case R.id.btn_carta6:
                btn_carta6.setText("X");
                btn_carta6.setTextColor(Color.RED);
                valorCarta6=btn_carta6.getText().toString();
                comparar();
                break;
            case R.id.btn_carta7:
                btn_carta7.setText("X");
                btn_carta7.setTextColor(Color.RED);
                valorCarta7=btn_carta7.getText().toString();
                comparar();
                break;
            case R.id.btn_carta8:
                btn_carta8.setText("X");
                btn_carta8.setTextColor(Color.RED);
                valorCarta8=btn_carta8.getText().toString();
                comparar();
                break;
            case R.id.btn_carta9:
                btn_carta9.setText("X");
                btn_carta9.setTextColor(Color.RED);
                valorCarta9=btn_carta9.getText().toString();
                comparar();
                break;
            case R.id.btn_carta10:
                btn_carta10.setText("X");
                btn_carta10.setTextColor(Color.RED);
                valorCarta10=btn_carta10.getText().toString();
                comparar();
                break;
            case R.id.btn_carta11:
                btn_carta11.setText("X");
                btn_carta11.setTextColor(Color.RED);
                valorCarta11=btn_carta11.getText().toString();
                comparar();
                break;
            case R.id.btn_carta12:
                btn_carta12.setText("X");
                btn_carta12.setTextColor(Color.RED);
                valorCarta12=btn_carta12.getText().toString();
                comparar();
                break;
            case R.id.btn_carta13:
                btn_carta13.setText("X");
                btn_carta13.setTextColor(Color.RED);
                valorCarta13=btn_carta13.getText().toString();
                comparar();
                break;
            case R.id.btn_carta14:
                btn_carta14.setText("X");
                btn_carta14.setTextColor(Color.RED);
                valorCarta14=btn_carta14.getText().toString();
                comparar();
                break;
            case R.id.btn_carta15:
                btn_carta15.setText("X");
                btn_carta15.setTextColor(Color.RED);
                valorCarta15=btn_carta15.getText().toString();
                comparar();
                break;
            case R.id.btn_carta16:
                btn_carta16.setText("X");
                btn_carta16.setTextColor(Color.RED);
                valorCarta16=btn_carta16.getText().toString();
                comparar();
                break;
            case R.id.btn_limpiar:
                limpiar();
                break;
        }
    }

    public void comparar(){

        if((valorCarta1.equals("X")&&valorCarta2.equals("X")&&valorCarta3.equals("X")&&valorCarta4.equals("X"))||
                (valorCarta5.equals("X")&&valorCarta6.equals("X")&&valorCarta7.equals("X")&&valorCarta8.equals("X"))||
                (valorCarta9.equals("X")&&valorCarta10.equals("X")&&valorCarta11.equals("X")&&valorCarta12.equals("X"))||
                (valorCarta13.equals("X")&&valorCarta14.equals("X")&&valorCarta15.equals("X")&&valorCarta16.equals("X"))||
                (valorCarta1.equals("X")&&valorCarta5.equals("X")&&valorCarta9.equals("X")&&valorCarta13.equals("X"))||
                (valorCarta2.equals("X")&&valorCarta6.equals("X")&&valorCarta10.equals("X")&&valorCarta14.equals("X"))||
                (valorCarta3.equals("X")&&valorCarta7.equals("X")&&valorCarta11.equals("X")&&valorCarta15.equals("X"))||
                (valorCarta4.equals("X")&&valorCarta8.equals("X")&&valorCarta12.equals("X")&&valorCarta16.equals("X"))||
                (valorCarta1.equals("X")&&valorCarta6.equals("X")&&valorCarta11.equals("X")&&valorCarta16.equals("X"))||
                (valorCarta4.equals("X")&&valorCarta7.equals("X")&&valorCarta10.equals("X")&&valorCarta13.equals("X"))){

            txtv_ganador.setText("Has Ganado!!");

        }

    }

    public void limpiar(){

        btn_carta1.setText(" ");
        btn_carta2.setText(" ");
        btn_carta3.setText(" ");
        btn_carta4.setText(" ");
        btn_carta5.setText(" ");
        btn_carta6.setText(" ");
        btn_carta7.setText(" ");
        btn_carta8.setText(" ");
        btn_carta9.setText(" ");
        btn_carta10.setText(" ");
        btn_carta11.setText(" ");
        btn_carta12.setText(" ");
        btn_carta13.setText(" ");
        btn_carta14.setText(" ");
        btn_carta15.setText(" ");
        btn_carta16.setText(" ");
        txtv_ganador.setText(" ");

        valorCarta1=" ";
        valorCarta2=" ";
        valorCarta3=" ";
        valorCarta4=" ";
        valorCarta5=" ";
        valorCarta6=" ";
        valorCarta7=" ";
        valorCarta8=" ";
        valorCarta9=" ";
        valorCarta10=" ";
        valorCarta11=" ";
        valorCarta12=" ";
        valorCarta13=" ";
        valorCarta14=" ";
        valorCarta15=" ";
        valorCarta16=" ";

    }


}
