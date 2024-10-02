package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;


public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details); // อ้างอิงถึง details.xml



        // รับข้อมูลจาก Intent
        Intent intent = getIntent();
        String itemName = intent.getStringExtra("name");
        String itemPrice = intent.getStringExtra("price");
        String Detailss = intent.getStringExtra("details");
        int itemImage = intent.getIntExtra("image", 0);




    // ค้นหา views จาก details.xml
        TextView nameTextView = findViewById(R.id.name);
        TextView priceTextView = findViewById(R.id.price);
        TextView detailsTextView = findViewById(R.id.textView);
        ImageView imageView = findViewById(R.id.imageview);

        // แสดงข้อมูลใน views
        nameTextView.setText(itemName);
        priceTextView.setText(itemPrice);
        detailsTextView.setText(Detailss);
        imageView.setImageResource(itemImage);
    }
}