package com.example.teste2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PanelActivity extends AppCompatActivity {

    private ImageButton buttonEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel);

        buttonEmployee = findViewById(R.id.buttonEmployee); // Substitua "R.id.buttonEmployee" pelo ID correto do seu botão

        buttonEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crie uma Intent para abrir a próxima atividade (substitua "NextActivity.class" pela classe da próxima atividade)
                Intent intent = new Intent(PanelActivity.this, EmployeeActivity.class);

                // Inicie a próxima atividade
                startActivity(intent);
            }
        });
    }
}
