package com.example.teste2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DeleteSearchActivity extends AppCompatActivity {

    private Button button;
    private ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_search);

        button = findViewById(R.id.buttonSearch); // Substitua "R.id.buttonEmployee" pelo ID correto do seu botão
        imageButton = findViewById(R.id.buttonPanel); // Substitua "R.id.buttonEmployee" pelo ID correto do seu botão
        imageButton = findViewById(R.id.buttonEmployee); // Substitua "R.id.buttonEmployee" pelo ID correto do seu botão

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crie uma Intent para abrir a próxima atividade (substitua "NextActivity.class" pela classe da próxima atividade)
                Intent intent = new Intent(DeleteSearchActivity.this, DeleteActivity.class);

                // Inicie a próxima atividade
                startActivity(intent);
            }
        });
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crie uma Intent para abrir a próxima atividade (substitua "NextActivity.class" pela classe da próxima atividade)
                Intent intent = new Intent(DeleteSearchActivity.this, PanelActivity.class);

                // Inicie a próxima atividade
                startActivity(intent);
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crie uma Intent para abrir a próxima atividade (substitua "NextActivity.class" pela classe da próxima atividade)
                Intent intent = new Intent(DeleteSearchActivity.this, EmployeeActivity.class);

                // Inicie a próxima atividade
                startActivity(intent);
            }
        });
    }
}