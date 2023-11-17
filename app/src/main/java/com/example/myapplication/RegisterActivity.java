package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class RegisterActivity extends AppCompatActivity {

    private Button registerbuttonrs;
    private EditText registerPassword, registerET;
    private ProgressDialog loadingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerbuttonrs = (Button) findViewById(R.id.registerbuttonrs);
        registerET = (EditText) findViewById(R.id.registerET);
        registerPassword = (EditText) findViewById(R.id.registerPassword);
        //loadingBar = new ProgressDialog(this);

        registerbuttonrs.setOnClickListener(v -> CreateAccount());

    }

    private void CreateAccount() {
        String phone = registerET.getText().toString();
        String password = registerPassword.getText().toString();

        if(TextUtils.isEmpty(phone)){
            Toast.makeText(this, "Введите номер телефона", Toast.LENGTH_SHORT).show();
        }
        else if(TextUtils.isEmpty(password)){
            Toast.makeText(this, "Введите пароль", Toast.LENGTH_SHORT).show();
        }
        else {
            loadingBar.setTitle("Создание аккаунта");
            loadingBar.setCanceledOnTouchOutside(false);
            loadingBar.show();

            ValidatePhone(phone, password);
        }
    }

    private void ValidatePhone(String phone, String password) {
        final DatabaseReference RootRef;
        RootRef = FirebaseDatabase.getInstance().getReference();

        RootRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(!(snapshot.child("Users").child(phone).exists()))
                {
                    HashMap<String, Object> userDataMap = new HashMap<>();
                    userDataMap.put("phone", phone);
                    userDataMap.put("password", password);

                    RootRef.child("Users").child(phone).updateChildren(userDataMap).addOnCompleteListener(task -> {
                        if(task.isComplete()){
                            loadingBar.dismiss();
                            Toast.makeText(RegisterActivity.this, "Регистрация прошла успешно", Toast.LENGTH_SHORT).show();
                            Intent loginIntent = new Intent(RegisterActivity.this, MainActivity.class);
                            startActivity(loginIntent);
                        }
                        else{
                            loadingBar.dismiss();
                            Toast.makeText(RegisterActivity.this, "Ошибка", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
                else{
                    Toast.makeText(RegisterActivity.this, "Номер" + phone + "уже зарегистрирован", Toast.LENGTH_SHORT).show();
                    loadingBar.dismiss();
                    Intent loginIntent = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(loginIntent);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}