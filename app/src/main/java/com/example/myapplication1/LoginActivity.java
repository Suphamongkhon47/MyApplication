package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText usernameEditText = findViewById(R.id.usernameEditText);
        EditText passwordEditText = findViewById(R.id.passwordEditText);
        Button loginButton = findViewById(R.id.loginButton);

        // เมื่อผู้ใช้กดปุ่มล็อกอิน
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // ตรวจสอบข้อมูลล็อกอิน (ในตัวอย่างนี้เป็นค่าคงที่)
                if (username.equals("admin") && password.equals("1234")) {
                    // การล็อกอินสำเร็จ ไปที่หน้า MainActivity
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();  // ปิดหน้าล็อกอินเพื่อไม่ให้กลับมาเมื่อกดปุ่ม back
                } else {
                    // การล็อกอินล้มเหลว
                    Toast.makeText(LoginActivity.this, "ชื่อผู้ใช้หรือรหัสผ่านไม่ถูกต้อง", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

