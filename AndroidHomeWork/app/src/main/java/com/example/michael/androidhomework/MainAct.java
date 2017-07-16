package com.example.michael.androidhomework;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainAct extends Activity {
    View.OnClickListener btnOrder_click = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainAct.this,CoffeeOrder.class);
            startActivity(intent);

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actmain);
        InitialComponent();
    }

    private void InitialComponent() {
        btnOrder = (Button)findViewById(R.id.btnOrder);
        btnOrder.setOnClickListener(btnOrder_click);
    }

    Button btnOrder;

}
