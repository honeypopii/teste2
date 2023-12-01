package com.example.teste2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PayrollActivity extends AppCompatActivity {

    private ImageButton buttonP;
    private ImageButton buttonE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payroll);

        buttonP = findViewById(R.id.buttonPanel);
        buttonE = findViewById(R.id.buttonEmployee);


        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(PayrollActivity.this, PanelActivity.class);


                startActivity(intent);
            }
        });
        buttonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(PayrollActivity.this, EmployeeActivity.class);

                // Inicie a próxima atividade
                startActivity(intent);
            }
        });
    }
}