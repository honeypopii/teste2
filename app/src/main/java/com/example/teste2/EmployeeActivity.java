package com.example.teste2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class EmployeeActivity extends AppCompatActivity {

    private Button button;
    private ImageButton imageButtonP;
    private ImageButton imageButtonW;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);

        button = findViewById(R.id.buttonRegister);
        Button buttonAlter = findViewById(R.id.buttonAlter);
        Button buttonDelete = findViewById(R.id.buttonDelete);
        imageButtonP = findViewById(R.id.buttonPanel);
        imageButtonW = findViewById(R.id.buttonWallet);

        imageButtonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmployeeActivity.this, PanelActivity.class);

                startActivity(intent);
            }
        });

        imageButtonW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmployeeActivity.this, PayrollSearchActivity.class);

                startActivity(intent);
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(EmployeeActivity.this, RegisterActivity.class);


                startActivity(intent);
            }
        });

        buttonAlter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crie uma Intent para abrir a próxima atividade (substitua "NextActivity.class" pela classe da próxima atividade)
                Intent intent = new Intent(EmployeeActivity.this, AlterSearchActivity.class);

                // Inicie a próxima atividade
                startActivity(intent);
            }
        });

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crie uma Intent para abrir a próxima atividade (substitua "NextActivity.class" pela classe da próxima atividade)
                Intent intent = new Intent(EmployeeActivity.this, DeleteSearchActivity.class);

                // Inicie a próxima atividade
                startActivity(intent);
            }
        });
    }
}
