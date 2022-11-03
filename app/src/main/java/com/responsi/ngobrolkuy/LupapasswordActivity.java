package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LupapasswordActivity extends AppCompatActivity {

    private ImageView btn_back;
    private CardView btn_submit;
    private Intent submit, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupapassword);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back = new Intent(LupapasswordActivity.this, LoginActivity.class);

                startActivity(back);
            }
        });
    }
}