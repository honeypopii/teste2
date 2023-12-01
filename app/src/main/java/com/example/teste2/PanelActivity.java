package com.example.teste2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PanelActivity extends AppCompatActivity {

    private ImageButton buttonE;
    private ImageButton buttonw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel);

        buttonE = findViewById(R.id.buttonEmployee); // Substitua "R.id.buttonEmployee" pelo ID correto do seu botão
        buttonw = findViewById(R.id.buttonWallet); // Substitua "R.id.buttonEmployee" pelo ID correto do seu botão


        buttonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crie uma Intent para abrir a próxima atividade (substitua "NextActivity.class" pela classe da próxima atividade)
                Intent intent = new Intent(PanelActivity.this, EmployeeActivity.class);

                // Inicie a próxima atividade
                startActivity(intent);
            }
        });

        buttonw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crie uma Intent para abrir a próxima atividade (substitua "NextActivity.class" pela classe da próxima atividade)
                Intent intent = new Intent(PanelActivity.this, PayrollSearchActivity.class);

                // Inicie a próxima atividade
                startActivity(intent);
            }
        });
    }
}
