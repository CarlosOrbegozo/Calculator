package com.example.paula.calculator;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.Menu;

import static java.lang.Math.*;

public class MainActivity extends AppCompatActivity {

    final Context context = this;
    StringBuilder sb = new StringBuilder();
    StringBuilder sbDeg = new StringBuilder();
    boolean isDeg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void numero9 (View view) {

        TextView editText = findViewById(R.id.textView);
        sb.append("9");
        sbDeg.append("9");
        editText.setText(sb.toString());
    }
    public void numero8 (View view) {

        TextView editText = findViewById(R.id.textView);
        sb.append("8");
        sbDeg.append("8");
        editText.setText(sb.toString());
    }
    public void numero7 (View view) {

        TextView editText = findViewById(R.id.textView);
        sb.append("7");
        sbDeg.append("7");
        editText.setText(sb.toString());
    }
    public void numero6 (View view) {

        TextView editText = findViewById(R.id.textView);
        sb.append("6");
        sbDeg.append("6");
        editText.setText(sb.toString());
    }
    public void numero5 (View view) {

        TextView editText = findViewById(R.id.textView);
        sb.append("5");
        sbDeg.append("5");
        editText.setText(sb.toString());
    }
    public void numero4 (View view) {

        TextView editText = findViewById(R.id.textView);
        sb.append("4");
        sbDeg.append("4");
        editText.setText(sb.toString());
    }
    public void numero3 (View view) {

        TextView editText = findViewById(R.id.textView);
        sb.append("3");
        sbDeg.append("3");
        editText.setText(sb.toString());
    }
    public void numero2 (View view) {

        TextView editText = findViewById(R.id.textView);
        sb.append("2");
        sbDeg.append("2");
        editText.setText(sb.toString());
    }
    public void numero1 (View view) {

        TextView editText = findViewById(R.id.textView);
        sb.append("1");
        sbDeg.append("1");
        editText.setText(sb.toString());
    }
    public void numero0 (View view) {

        TextView editText = findViewById(R.id.textView);
        sb.append("0");
        sbDeg.append("0");
        editText.setText(sb.toString());
    }
    public void coma (View view) {

        TextView editText = findViewById(R.id.textView);
        sb.append(".");
        sbDeg.append(".");
        editText.setText(sb.toString());
    }
    public void suma (View view) {

        TextView editText = findViewById(R.id.textView);
        sb.append("+");
        sbDeg.append("+");
        editText.setText(sb.toString());
    }
    public void resta (View view) {

        TextView editText = findViewById(R.id.textView);
        sb.append("-");
        sbDeg.append("-");
        editText.setText(sb.toString());
    }
    public void division (View view) {

        TextView editText = findViewById(R.id.textView);
        sb.append("/");
        sbDeg.append("/");
        editText.setText(sb.toString());
    }
    public void multiplicacion (View view) {

        TextView editText = findViewById(R.id.textView);
        sb.append("*");
        sbDeg.append("*");
        editText.setText(sb.toString());
    }
    public void sin (View view) {

        TextView editText = findViewById(R.id.textView);
        sb.append("sin(");
        sbDeg.append("sin((pi/180)*");
        editText.setText(sb.toString());
    }
    public void cos (View view) {

        TextView editText = findViewById(R.id.textView);
        sb.append("cos(");
        sbDeg.append("cos((pi/180)*");
        editText.setText(sb.toString());
    }
    public void tan (View view) {

        TextView editText = findViewById(R.id.textView);
        sb.append("tan(");
        sbDeg.append("tan((pi/180)*");
        editText.setText(sb.toString());
    }
    public void abreparentesis (View view) {

        TextView editText = findViewById(R.id.textView);
        sb.append("(");
        sbDeg.append("(");
        editText.setText(sb.toString());
    }
    public void cierraparentesis (View view) {

        TextView editText = findViewById(R.id.textView);
        sb.append(")");
        sbDeg.append(")");
        editText.setText(sb.toString());
    }
    public void clear (View view) {

        TextView editText = findViewById(R.id.textView);
        sb=new StringBuilder();
        sbDeg=new StringBuilder();
        editText.setText("0");
    }
    public void degrees (View view) {
        findViewById(R.id.buttondegrees).setBackgroundColor(Color.parseColor("red"));//  Le estoy dando vueltas y nada
        findViewById(R.id.buttonradians).setBackgroundColor(android.R.drawable.btn_default);
        isDeg=true;
    }
    public void  radians (View view) {
        findViewById(R.id.buttonradians).setBackgroundColor(Color.parseColor("blue"));
        findViewById(R.id.buttondegrees).setBackgroundColor(android.R.drawable.btn_default);
        isDeg = false;
    }
    public void igual (View view) {

        try {

            TextView editText = findViewById(R.id.textView);
            Double res = 0.0;
            Parseador p = new Parseador();
            if(isDeg) {
                res = p.f(p.parsear(sbDeg.toString()), res);
                editText.setText(res.toString());
            }
            else{
                res = p.f(p.parsear(sb.toString()), res);
                editText.setText(res.toString());
            }
            sb = new StringBuilder();
            sbDeg=new StringBuilder();
        }
        catch (Exception e){
            TextView editText = findViewById(R.id.textView);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
            alertDialogBuilder.setTitle("Message Error");
            alertDialogBuilder.setMessage("error,Please check Syntax");
            editText.setText("error,Please check Syntax");
            sb = new StringBuilder();
            sbDeg=new StringBuilder();


        }
    }
}
