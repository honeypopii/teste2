package com.example.teste2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.text.SimpleDateFormat;

public class AlterActivity extends AppCompatActivity {

    private Button button;
    private ImageButton imageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alter);

        button = findViewById(R.id.buttonCancel);
        button = findViewById(R.id.buttonAlter);
        imageButton = findViewById(R.id.buttonPanel);
        imageButton = findViewById(R.id.buttonEmployee);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlterActivity.this, EmployeeActivity.class);

                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AlterActivity.this, "Alterado com sucesso", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AlterActivity.this, EmployeeActivity.class);

                startActivity(intent);
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlterActivity.this, PanelActivity.class);

                startActivity(intent);
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlterActivity.this, EmployeeActivity.class);

                startActivity(intent);
            }
        });
    }
}
