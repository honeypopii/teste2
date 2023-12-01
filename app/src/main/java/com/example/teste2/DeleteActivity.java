package com.example.teste2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class DeleteActivity extends AppCompatActivity {

    private Button buttonC;
    private ImageButton imageButton;
    private Button buttonD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);

        buttonC = findViewById(R.id.buttonCancel);
        imageButton = findViewById(R.id.buttonPanel); // Substitua "R.id.buttonEmployee" pelo ID correto do seu botão
        imageButton = findViewById(R.id.buttonEmployee); // Substitua "R.id.buttonEmployee" pelo ID correto do seu botão
        buttonD = findViewById(R.id.buttonDelete);

        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DeleteActivity.this, "Funcionário deletado com sucesso", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DeleteActivity.this, EmployeeActivity.class);


                startActivity(intent);
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crie uma Intent para abrir a próxima atividade (substitua "NextActivity.class" pela classe da próxima atividade)
                    Intent intent = new Intent(DeleteActivity.this, EmployeeActivity.class);

                // Inicie a próxima atividade
                startActivity(intent);
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crie uma Intent para abrir a próxima atividade (substitua "NextActivity.class" pela classe da próxima atividade)
                Intent intent = new Intent(DeleteActivity.this, PanelActivity.class);

                // Inicie a próxima atividade
                startActivity(intent);
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crie uma Intent para abrir a próxima atividade (substitua "NextActivity.class" pela classe da próxima atividade)
                Intent intent = new Intent(DeleteActivity.this, EmployeeActivity.class);

                // Inicie a próxima atividade
                startActivity(intent);
            }
        });
    }
}