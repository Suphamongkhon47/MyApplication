package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<>();
        items.add(new Item("Yaris ATIV", "฿549,000", "รถยนต์ขนาดเล็กสำหรับคนเมือง ประหยัดน้ำมัน", R.drawable.a));
        items.add(new Item("Corolla Altis", "฿894,000", "รถยนต์ที่มีการออกแบบสวยงาม ขับขี่สบาย", R.drawable.b));
        items.add(new Item("Yaris Cross", "฿789,000", "รถยนต์ขนาดกลาง เหมาะสำหรับครอบครัว", R.drawable.c));
        items.add(new Item("Corolla Cross GR Sport", "฿1,254,000", "รถยนต์อเนกประสงค์สไตล์สปอร์ต พื้นที่กว้างขวาง", R.drawable.d));
        items.add(new Item("Veloz", "฿795,000", "รถยนต์ 7 ที่นั่งสำหรับครอบครัว ขับขี่สะดวกสบาย", R.drawable.e));
        items.add(new Item("Alphard", "฿4,129,000", "รถยนต์หรูหราระดับพรีเมี่ยม พร้อมความสะดวกสบายสูงสุด", R.drawable.f));
        items.add(new Item("Hilux Champ", "฿459,000", "รถกระบะที่มีความทนทาน ขับเคลื่อนสี่ล้อ เหมาะสำหรับทุกพื้นที่", R.drawable.g));
        items.add(new Item("Hilux Revo Z Edition", "฿669,000", "รถกระบะขับเคลื่อนสี่ล้อ ประหยัดน้ำมัน และดีไซน์ทันสมัย", R.drawable.h));
        items.add(new Item("Majesty", "฿1,989,000", "รถตู้ที่หรูหราสำหรับครอบครัวหรือการขับขี่ทางไกล", R.drawable.i));

        // Set up the RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Myadapter(this, items, new Myadapter.OnItemClickListener() {
            @Override
            public void onItemClick(Item item) {
                // Handle item click
                Toast.makeText(MainActivity.this,item.getName(), Toast.LENGTH_SHORT).show();
                // ส่งข้อมูลไปยังหน้า details.java
                Intent intent = new Intent(MainActivity.this, Details.class);
                intent.putExtra("name", item.getName());
                intent.putExtra("price", item.getPrice());
                intent.putExtra("details", item.getDetailss());
                intent.putExtra("image", item.getImage());
                startActivity(intent);
            }
        }));
    }

}