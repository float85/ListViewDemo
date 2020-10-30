package com.example.listviewdemo41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvDemo;
    Contact contact, contact1, contact2, contact3, contact4;
    List<Contact> contactList;
    RelativeLayout btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvDemo = findViewById(R.id.lvDemo);
        btnAdd = findViewById(R.id.btnAdd);

        contactList = new ArrayList<>();

        contact = new Contact(2224585, "Android 41", "89 láng hạ", true);
        contact1 = new Contact(55555, "Android 42", "1 láng hạ", false);
        contact2 = new Contact(66666, "Android 43", "100 láng hạ", true);
        contact3 = new Contact(77777, "Android 44", "1324 láng hạ", false);
        contact4 = new Contact(88888, "Android 45", "147852 láng hạ", true);

        contactList.add(contact);
        contactList.add(contact1);
        contactList.add(contact2);
        contactList.add(contact3);
        contactList.add(contact4);

        AdapterContact adapterContact = new AdapterContact(contactList);
        lvDemo.setAdapter(adapterContact);

        lvDemo.setOnItemClickListener((parent, view, position, id) -> {

            Contact contact = contactList.get(position);
            String name = contact.getName();
            Toast.makeText(getBaseContext(), name, Toast.LENGTH_LONG).show();

            Intent intent = new Intent(getBaseContext(), AddContactActivity.class);
            intent.putExtra("_name", name);
            intent.putExtra("KeyAdd",true );
            startActivity(intent);
        });

        btnAdd.setOnClickListener(v -> {
            Intent intent = new Intent(getBaseContext(), AddContactActivity.class);

            intent.putExtra("_name", "Android 40");
            intent.putExtra("KeyAdd",false );

            startActivity(intent);
        });

    }
}