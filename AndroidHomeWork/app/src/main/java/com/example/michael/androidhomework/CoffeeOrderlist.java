package com.example.michael.androidhomework;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static java.lang.String.valueOf;

public class CoffeeOrderlist extends Activity {


    private View.OnClickListener btnGoback_click = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(CoffeeOrderlist.this,MainAct.class);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coffeeorderlist);
        Button btnGoback = (Button) findViewById(R.id.btnGoback);
        btnGoback.setOnClickListener(btnGoback_click);
        TextView lblList= (TextView) findViewById(R.id.lblList);
        TextView lblName = (TextView) findViewById(R.id.lblName);
        TextView lblCount = (TextView) findViewById(R.id.lblCount);
        TextView lblSubtotal = (TextView) findViewById(R.id.lblSubtotal);
        Intent intent = getIntent();
        Bundle bund = intent.getExtras();
        int data = bund.getInt("kk");
        String Name = "";
        String Count = "";
        String Subtotal ="";

        if (CDictionary.ESPRESSO_COUNT !=0){
            Name += "ESPRESSO"+"\n";
            Count += String.valueOf(CDictionary.ESPRESSO_COUNT)+"\n";
            Subtotal += String.valueOf(CDictionary.ESPRESSO_TOTAL_PRICE)+"\n";
        }

        if(CDictionary.AMERICAN_COUNT !=0){
            Name += "美式咖啡"+"\n";
            Count += String.valueOf(CDictionary.AMERICAN_COUNT)+"\n";
            Subtotal += String.valueOf(CDictionary.AMERICAN_TOTAL_PRICE)+"\n";
        }

        if(CDictionary.LATTE_COUNT != 0){
            Name += "拿鐵咖啡"+"\n";
            Count += String.valueOf(CDictionary.LATTE_COUNT)+"\n";
            Subtotal += String.valueOf(CDictionary.LATTE_TOTAL_PRICE)+"\n";
        }

        if(CDictionary.CAPPUCCINO_COUNT != 0){
            Name += "卡布奇諾"+"\n";
            Count += String.valueOf(CDictionary.CAPPUCCINO_COUNT)+"\n";
            Subtotal += String.valueOf(CDictionary.CAPPUCCINO_TOTAL_PRICE)+"\n";
        }

        if (CDictionary.MOCHA_COUNT != 0){
            Name += "摩卡咖啡" +"\n";
            Count += String.valueOf(CDictionary.MOCHA_COUNT)+"\n";
            Subtotal += String.valueOf(CDictionary.MOCHA_TOTAL_PRICE)+"\n";
        }


        lblName.setTextSize(30.0f);
        lblCount.setTextSize(30.0f);
        lblSubtotal.setTextSize(30.0f);
        lblList.setTextSize(30.0f);
        lblName.setText(Name);
        lblCount.setText(Count);
        lblSubtotal.setText(Subtotal);

        lblList.setText(valueOf(data));


    }




}
