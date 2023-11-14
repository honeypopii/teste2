package com.example.teste2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextUsername;
    private EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextUsername = findViewById(R.id.editText);
        editTextPassword = findViewById(R.id.editText2);
        Button buttonLogin = findViewById(R.id.button);

        buttonLogin.setOnClickListener(v -> {
            String username = editTextUsername.getText().toString();
            String password = editTextPassword.getText().toString();

            // Verifique as credenciais do usuário (isso é apenas um exemplo)
            if (username.equals("joyce") && password.equals("1234")) {
                // Credenciais corretas, faça algo, como iniciar uma nova atividade
                Toast.makeText(LoginActivity.this, "Login bem-sucedido", Toast.LENGTH_SHORT).show();
                // Iniciar a próxima atividade ou executar a ação desejada
                Intent intent = new Intent(LoginActivity.this, PanelActivity.class);
                startActivity(intent);
                finish();
            } else {
                // Credenciais incorretas, exiba uma mensagem de erro
                Toast.makeText(LoginActivity.this, "Credenciais incorretas", Toast.LENGTH_SHORT).show();
            }
        });
    }
}