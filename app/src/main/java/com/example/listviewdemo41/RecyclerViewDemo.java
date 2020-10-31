package com.example.listviewdemo41;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewDemo extends AppCompatActivity {
    Contact contact, contact1, contact2, contact3, contact4;
    List<Contact> contactList;

    RecyclerView rvList;
    RecyclerVIewAdapterDemo adapterDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_demo);

        rvList = findViewById(R.id.rvList);

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

        adapterDemo = new RecyclerVIewAdapterDemo(contactList);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(
                getBaseContext(), 2, RecyclerView.VERTICAL, false);

        rvList.setLayoutManager(layoutManager);
        rvList.setAdapter(adapterDemo);

    }
}