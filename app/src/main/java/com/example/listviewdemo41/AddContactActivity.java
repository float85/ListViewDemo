package com.example.listviewdemo41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddContactActivity extends AppCompatActivity {

    TextView tvTitlAdd;
    EditText etEdit;
    Button btnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        tvTitlAdd = findViewById(R.id.tvTitleAdd);
        etEdit = findViewById(R.id.etName);
        btnConfirm = findViewById(R.id.btnConfirm);

        Intent intent = getIntent();
        String name = intent.getStringExtra("_name");
        boolean addKey =intent.getBooleanExtra("KeyAdd",false);

        tvTitlAdd.setText(name);

        if (addKey) btnConfirm.setText("Edit");
        else btnConfirm.setText("Add");

    }
}