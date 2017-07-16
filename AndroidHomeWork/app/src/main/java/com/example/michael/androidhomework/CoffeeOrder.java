package com.example.michael.androidhomework;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.String.valueOf;

/**
 * Created by Michael on 2017/5/20.
 */

public class CoffeeOrder extends Activity {
    int 濃縮_Count = 0;
    int 美式_Count = 0;
    int 拿鐵_Count = 0;
    int 卡布_Count = 0;
    int 摩卡_Count = 0;
    int total ;
    private void showMessage(String Message) {
        AlertDialog.Builder MyAlertDialog = new AlertDialog.Builder(this);
        MyAlertDialog.setTitle("OOPS");
        MyAlertDialog.setMessage(Message);

        DialogInterface.OnClickListener OkClick = new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        };
        MyAlertDialog.setNeutralButton("確定",OkClick );
        MyAlertDialog.show();
    }

    View.OnClickListener btn濃縮加_click  = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            try {
                濃縮_Count = Integer.parseInt(valueOf(txt濃縮.getText()));
                濃縮_Count += 1;
            }catch (Exception e){
                showMessage("請輸入數字");
            }

            if (濃縮_Count >= 99){

                濃縮_Count = 99;
            }
            txt濃縮.setText(valueOf(濃縮_Count));
            Toast message = Toast.makeText(
                    CoffeeOrder.this,
                    "Espresso點了"+濃縮_Count+"杯",
                    Toast.LENGTH_SHORT
            );
            message.show();
        }
    };



    View.OnClickListener btn濃縮減_click  = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            try{
                濃縮_Count = Integer.parseInt(valueOf(txt濃縮.getText()));
                濃縮_Count -= 1;
            }catch (Exception e){
                showMessage("請輸入數字");
            }
            if(濃縮_Count <= 0){
                濃縮_Count = 0;
            }
            txt濃縮.setText(valueOf(濃縮_Count));


            Toast message = Toast.makeText(
                    CoffeeOrder.this,
                    "Espresso點了"+濃縮_Count+"杯",
                    Toast.LENGTH_SHORT
            );
            message.show();
        }
    };
    View.OnClickListener btn美式加_click  = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            try {
                美式_Count = Integer.parseInt(valueOf(txt美式.getText()));
                美式_Count += 1;
            }catch (Exception e){
                showMessage("請輸入數字");
            }
            if (美式_Count >= 99){

                美式_Count = 99;
            }
            txt美式.setText(valueOf(美式_Count));

            Toast message = Toast.makeText(
                    CoffeeOrder.this,
                    "美式增加"+美式_Count+"杯",
                    Toast.LENGTH_SHORT
            );
            message.show();

        }
    };
    View.OnClickListener btn美式減_click  = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            try {
                美式_Count = Integer.parseInt(valueOf(txt美式.getText()));
                美式_Count -= 1;
            }catch (Exception e){
                showMessage("請輸入數字");
            }
            if(美式_Count <= 0){
                美式_Count = 0;
            }
            txt美式.setText(valueOf(美式_Count));
            Toast message = Toast.makeText(
                    CoffeeOrder.this,
                    "美式減少"+美式_Count+"杯",
                    Toast.LENGTH_SHORT
            );
            message.show();

        }
    };
    View.OnClickListener btn拿鐵加_click  = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            try {
                拿鐵_Count = Integer.parseInt(valueOf(txt拿鐵.getText()));
                拿鐵_Count += 1;
            }catch (Exception e){
                showMessage("請輸入數字");
            }
            if(拿鐵_Count <= 0){
                拿鐵_Count = 0;
            }
            txt拿鐵.setText(valueOf(拿鐵_Count));
            Toast message = Toast.makeText(
                    CoffeeOrder.this,
                    "拿鐵增加"+拿鐵_Count+"杯",
                    Toast.LENGTH_SHORT
            );
            message.show();

        }
    };
    View.OnClickListener btn拿鐵減_click  = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            try {
                拿鐵_Count = Integer.parseInt(valueOf(txt拿鐵.getText()));
                拿鐵_Count -= 1;
            }catch (Exception e){
                showMessage("請輸入數字");
            }
            if(拿鐵_Count <= 0){
                拿鐵_Count = 0;
            }
            txt拿鐵.setText(valueOf(拿鐵_Count));
            Toast message = Toast.makeText(
                    CoffeeOrder.this,
                    "拿鐵減少"+拿鐵_Count+"杯",
                    Toast.LENGTH_SHORT
            );
            message.show();

        }
    };
    View.OnClickListener btn卡布加_click  = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            try {
                卡布_Count = Integer.parseInt(valueOf(txt卡布奇諾.getText()));
                卡布_Count += 1;
            }catch (Exception e){
                showMessage("請輸入數字");
            }
            if(卡布_Count <= 0){
                卡布_Count = 0;
            }
            txt卡布奇諾.setText(valueOf(卡布_Count));

            Toast message = Toast.makeText(
                    CoffeeOrder.this,
                    "卡布奇諾增加"+卡布_Count+"杯",
                    Toast.LENGTH_SHORT
            );
            message.show();

        }
    };
    View.OnClickListener btn卡布減_click  = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            try {
                卡布_Count = Integer.parseInt(valueOf(txt卡布奇諾.getText()));
                卡布_Count -= 1;
            }catch (Exception e){
                showMessage("請輸入數字");
            }
            if(卡布_Count <= 0){
                卡布_Count = 0;
            }
            txt卡布奇諾.setText(valueOf(卡布_Count));
            Toast message = Toast.makeText(
                    CoffeeOrder.this,
                    "卡布奇諾減少"+卡布_Count+"杯",
                    Toast.LENGTH_SHORT
            );
            message.show();


        }
    };
    View.OnClickListener btn摩卡加_click  = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            try {
                摩卡_Count = Integer.parseInt(valueOf(txt摩卡.getText()));
                摩卡_Count += 1;
            }catch (Exception e){
                showMessage("請輸入數字");
            }
            if(摩卡_Count <= 0){
                摩卡_Count = 0;
            }
            txt摩卡.setText(valueOf(摩卡_Count));

            Toast message = Toast.makeText(
                    CoffeeOrder.this,
                    "摩卡增加"+摩卡_Count+"杯",
                    Toast.LENGTH_SHORT
            );
            message.show();

        }
    };
    View.OnClickListener btn摩卡減_click  = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            try {
                摩卡_Count = Integer.parseInt(valueOf(txt摩卡.getText()));
                摩卡_Count -= 1;
            }catch (Exception e){
                showMessage("請輸入數字");
            }
            if(摩卡_Count <= 0){
                摩卡_Count = 0;
            }
            txt摩卡.setText(valueOf(摩卡_Count));

            Toast message = Toast.makeText(
                    CoffeeOrder.this,
                    "摩卡減少"+摩卡_Count+"杯",
                    Toast.LENGTH_SHORT
            );
            message.show();

        }
    };
    View.OnClickListener btn看口味_click  = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(CoffeeOrder.this,CoffeeDetail.class);
            startActivity(intent);

        }
    };

    View.OnClickListener btn送出_click  = new View.OnClickListener(){

        @Override
        public void onClick(View v) {


            CDictionary.ESPRESSO_COUNT = Integer.parseInt(txt濃縮.getText().toString());
            CDictionary.AMERICAN_COUNT = Integer.parseInt(txt美式.getText().toString());
            CDictionary.LATTE_COUNT = Integer.parseInt(txt拿鐵.getText().toString());
            CDictionary.CAPPUCCINO_COUNT = Integer.parseInt(txt卡布奇諾.getText().toString());
            CDictionary.MOCHA_COUNT = Integer.parseInt(txt摩卡.getText().toString());

            CDictionary.ESPRESSO_TOTAL_PRICE = CDictionary.ESPRESSO_UNIT_PRICE * CDictionary.ESPRESSO_COUNT;
            CDictionary.AMERICAN_TOTAL_PRICE = CDictionary.AMERICAN_UNIT_PRICE * CDictionary.AMERICAN_COUNT;
            CDictionary.LATTE_TOTAL_PRICE = CDictionary.LATTE_UNIT_PRICE * CDictionary.LATTE_COUNT;
            CDictionary.CAPPUCCINO_TOTAL_PRICE = CDictionary.CAPPUCCINO_UNIT_PRICE * CDictionary.CAPPUCCINO_COUNT;
            CDictionary.MOCHA_TOTAL_PRICE = CDictionary.MOCHA_UNIT_PRICE * CDictionary.MOCHA_COUNT;

            total = CDictionary.ESPRESSO_TOTAL_PRICE+CDictionary.AMERICAN_TOTAL_PRICE+
                    CDictionary.LATTE_TOTAL_PRICE+CDictionary.CAPPUCCINO_TOTAL_PRICE+
                    CDictionary.MOCHA_TOTAL_PRICE;

            Bundle bund = new Bundle();
            Intent intent = new Intent(CoffeeOrder.this,CoffeeOrderlist.class);
            bund.putInt("kk",total);
            intent.putExtras(bund);
            startActivity(intent);
        }
    };
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coffeeorder);
        InitialComponent();
    }

    private void InitialComponent() {
        btn濃縮加 = (Button)findViewById(R.id.btn濃縮加);
        btn濃縮加.setOnClickListener(btn濃縮加_click);
        btn濃縮減 = (Button)findViewById(R.id.btn濃縮減);
        btn濃縮減.setOnClickListener(btn濃縮減_click);
        btn美式加 = (Button)findViewById(R.id.btn美式加);
        btn美式加.setOnClickListener(btn美式加_click);
        btn美式減 = (Button)findViewById(R.id.btn美式減);
        btn美式減.setOnClickListener(btn美式減_click);
        btn拿鐵加 = (Button)findViewById(R.id.btn拿鐵加);
        btn拿鐵加.setOnClickListener(btn拿鐵加_click);
        btn拿鐵減 = (Button)findViewById(R.id.btn拿鐵減);
        btn拿鐵減.setOnClickListener(btn拿鐵減_click);
        btn卡布加 = (Button)findViewById(R.id.btn卡布加);
        btn卡布加.setOnClickListener(btn卡布加_click);
        btn卡布減 = (Button)findViewById(R.id.btn卡布減);
        btn卡布減.setOnClickListener(btn卡布減_click);
        btn摩卡加 = (Button)findViewById(R.id.btn摩卡加);
        btn摩卡加.setOnClickListener(btn摩卡加_click);
        btn摩卡減 = (Button)findViewById(R.id.btn摩卡減);
        btn摩卡減.setOnClickListener(btn摩卡減_click);
        btn看口味 = (Button)findViewById(R.id.btn看口味);
        btn看口味.setOnClickListener(btn看口味_click);
        btn送出 = (Button)findViewById(R.id.btn送出);
        btn送出.setOnClickListener(btn送出_click);
        txt濃縮 = (EditText)findViewById(R.id.txt濃縮);
        txt美式 = (EditText)findViewById(R.id.txt美式);
        txt拿鐵 = (EditText)findViewById(R.id.txt拿鐵);
        txt卡布奇諾 = (EditText)findViewById(R.id.txt卡布奇諾);
        txt摩卡 = (EditText)findViewById(R.id.txt摩卡);
        tvEspresso = (TextView)findViewById(R.id.tvEspresso);
        tvEspresso價格 = (TextView)findViewById(R.id.tvEspresso價格);
        tv美式 = (TextView)findViewById(R.id.tv美式);
        tv美式價格 = (TextView)findViewById(R.id.tv美式價格);
        tv拿鐵 = (TextView)findViewById(R.id.tv拿鐵);
        tv拿鐵價格 = (TextView)findViewById(R.id.tv拿鐵價格);
        tv卡布 = (TextView)findViewById(R.id.tv卡布);
        tv卡布價格 = (TextView)findViewById(R.id.tv卡布價格);
        tv摩卡 = (TextView)findViewById(R.id.tv摩卡);
        tv摩卡價格 = (TextView)findViewById(R.id.tv摩卡);

        lblMessage = (TextView)findViewById(R.id.lblMessage);
    }
    Button btn濃縮加,btn濃縮減;
    Button btn美式加,btn美式減;
    Button btn拿鐵加,btn拿鐵減;
    Button btn卡布加,btn卡布減;
    Button btn摩卡加,btn摩卡減;
    Button btn看口味,btn送出;
    EditText txt濃縮,txt美式,txt拿鐵,txt卡布奇諾,txt摩卡;
    TextView tvEspresso,tvEspresso價格,tv美式,tv美式價格;
    TextView tv拿鐵,tv拿鐵價格,tv卡布,tv卡布價格,tv摩卡,tv摩卡價格;
    TextView lblMessage;


}
