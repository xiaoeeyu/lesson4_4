package com.xiaoeryu.lesson4_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static String total = "@@@@####@@@@";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            int m = fun(4, 5);
            Log.d("xiaoeryu m= ", String.valueOf(m));
            Log.d("xiaoeryu tolowercase", fun("LOWERCASEME!"));
        }
    }

    String fun(String x){
        total += x;
        return x.toLowerCase();
    }
    int fun(int x, int y){
        Log.d("xiaoeryu", String.valueOf(x + y));
        return x + y;
    }
    String secret(){
        return total;
    }
    public static String secret2(){
        return total;
    }
}