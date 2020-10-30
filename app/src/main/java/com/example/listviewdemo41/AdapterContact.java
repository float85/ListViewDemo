package com.example.listviewdemo41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterContact extends BaseAdapter {
    List<Contact> contactList;

    public AdapterContact(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public int getCount() {
        return contactList.size();
    }

    @Override
    public Object getItem(int position) {
        return contactList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_contact, parent, false);

        TextView tvname = view.findViewById(R.id.tvName);
        TextView tvPhone = view.findViewById(R.id.tvPhone);
        ImageView imgIcon = view.findViewById(R.id.imgIcon);

        Contact contact = contactList.get(position);

        tvname.setText(contact.getName());
        tvPhone.setText(contact.getPhoneNumber() + "");

        if (contact.isIcon()) imgIcon.setVisibility(View.VISIBLE);
        else imgIcon.setVisibility(View.GONE);

        return view;
    }
}
