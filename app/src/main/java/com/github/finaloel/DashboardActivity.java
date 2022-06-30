package com.github.finaloel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6;
    View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        setupListeners();
    }


    private void setupListeners() {


        btn1.setOnClickListener(view -> {
            AlertDialog.Builder builder
                    = new AlertDialog
                    .Builder(DashboardActivity.this);
            builder.setMessage("Clothes");
            builder.setTitle("Details");

            builder.setCancelable(false);


            AlertDialog alertDialog = builder.create();

            alertDialog.show();

        });
        btn1.setOnLongClickListener(view1 -> {
            Intent i = new Intent(DashboardActivity.this, clothes.class);
            startActivity(i);
            return true;
        });
        btn2.setOnClickListener(view -> {
            AlertDialog.Builder builder
                    = new AlertDialog
                    .Builder(DashboardActivity.this);
            builder.setMessage("Books");
            builder.setTitle("Details");

            builder.setCancelable(false);


            AlertDialog alertDialog = builder.create();

            alertDialog.show();

        });
        btn2.setOnLongClickListener(view -> {
            Intent i = new Intent(DashboardActivity.this, books.class);
            startActivity(i);
            return true;
        });
        btn3.setOnClickListener(view -> {
            AlertDialog.Builder builder
                    = new AlertDialog
                    .Builder(DashboardActivity.this);
            builder.setMessage("Music");
            builder.setTitle("Details");

            builder.setCancelable(false);


            AlertDialog alertDialog = builder.create();

            alertDialog.show();

        });
        btn3.setOnLongClickListener(view -> {
            Intent i = new Intent(DashboardActivity.this, music.class);
            startActivity(i);
            return true;
        });
        btn4.setOnClickListener(view -> {
            AlertDialog.Builder builder
                    = new AlertDialog
                    .Builder(DashboardActivity.this);
            builder.setMessage("Watches");
            builder.setTitle("Details");

            builder.setCancelable(false);


            AlertDialog alertDialog = builder.create();

            alertDialog.show();

        });
        btn4.setOnLongClickListener(view -> {
            Intent i = new Intent(DashboardActivity.this, watch.class);
            startActivity(i);
            return true;
        });
        btn5.setOnClickListener(view -> {
            AlertDialog.Builder builder
                    = new AlertDialog
                    .Builder(DashboardActivity.this);
            builder.setMessage("Mobiles");
            builder.setTitle("Details");

            builder.setCancelable(false);


            AlertDialog alertDialog = builder.create();

            alertDialog.show();


        });
        btn5.setOnLongClickListener(view -> {
            Intent i = new Intent(DashboardActivity.this, mobile.class);
            startActivity(i);
            return true;
        });
        btn6.setOnClickListener(view -> {
            AlertDialog.Builder builder
                    = new AlertDialog
                    .Builder(DashboardActivity.this);
            builder.setMessage("Appliance");
            builder.setTitle("Details");

            builder.setCancelable(false);


            AlertDialog alertDialog = builder.create();

            alertDialog.show();

        });
        btn6.setOnLongClickListener(view -> {
            Intent i = new Intent(DashboardActivity.this, appliances.class);
            startActivity(i);
            return true;
        });

    }


}
