package com.example.michael.androidhomework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by Michael on 2017/5/22.
 */

public class CoffeeDetail extends Activity {
    View.OnClickListener btn回上頁_click = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(CoffeeDetail.this,CoffeeOrder.class);
            startActivity(intent);
        }
    };
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coffeedetail);
        InitialComponent();
    }

    private void InitialComponent() {
        btn回上頁 = (Button)findViewById(R.id.btn回上頁);
        btn回上頁.setOnClickListener(btn回上頁_click);
    }
    Button btn回上頁 ;
}
