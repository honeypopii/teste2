package com.example.teste2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextUsername = findViewById(R.id.editText);
        editTextPassword = findViewById(R.id.editText2);
        buttonLogin = findViewById(R.id.button);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                // Verifique as credenciais do usuário (isso é apenas um exemplo)
                if (username.equals("joyce") && password.equals("1234")) {
                    // Credenciais corretas, faça algo, como iniciar uma nova atividade
                    Toast.makeText(LoginActivity.this, "Login bem-sucedido", Toast.LENGTH_SHORT).show();
                    // Iniciar a próxima atividade ou executar a ação desejada
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    // Credenciais incorretas, exiba uma mensagem de erro
                    Toast.makeText(LoginActivity.this, "Credenciais incorretas", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}