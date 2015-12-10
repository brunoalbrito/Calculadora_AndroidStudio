package com.example.bruno.calculadora;

import android.widget.EditText;

/**
 * Created by Bruno on 10/12/2015.
 */
public class Calc {


    //PARA LIMPAR OS BOTÔES TODA FEZ QUE FOR INITIALIZED
    public static void start_Clear(EditText z){
        z.setText(null);
    }
    //CRIACÃO DA MÉTODO PARA SOMA
    public static String Soma(Double x,Double y){
        String result;
        return result =String.valueOf( x + y);
    }

    //CRIACÃO DA MÉTODO PARA SUBTRACAO
    public static String Sub(Double x,Double y){
        String result;
        return result =String.valueOf( x - y);
    }

    //CRIACÃO DA MÉTODO PARA DIVISAO
    public static String Div(Double x,Double y){
        String result,resp;
        if(x==0){
            resp ="erro";
        }else {
            resp = String.valueOf(x / y);
        }
        return result = resp;
    }

    //CRIACÃO DA MÉTODO PARA MULTIPLICACAO
    public static String Mult(Double x,Double y){
        String result;
        return result =String.valueOf( x * y);
    }

    public static void Clear(EditText x,EditText y, EditText z){
        x.setText(null);
        y.setText(null);
        z.setText(null);
    }
}
