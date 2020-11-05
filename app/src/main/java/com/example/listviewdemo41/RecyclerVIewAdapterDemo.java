package com.example.listviewdemo41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerVIewAdapterDemo extends RecyclerView.Adapter<RecyclerVIewAdapterDemo.Viewhoder> {

    List<Contact> contactList;
    onItemClickContact onItemClickContact;

    public void setOnItemClickContact(onItemClickContact _onItemClickContact) {
        this.onItemClickContact = _onItemClickContact;
    }

    public RecyclerVIewAdapterDemo(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @NonNull
    @Override
    public RecyclerVIewAdapterDemo.Viewhoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_recyclerview_demo, parent, false);

        Viewhoder viewhoder = new Viewhoder(view);
        return viewhoder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerVIewAdapterDemo.Viewhoder holder, int position) {
        Contact contact = contactList.get(position);

        holder.tvName.setText(contact.getName());
        holder.tvPhone.setText(contact.getPhoneNumber() + "");

        holder.tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickContact.onNameClick(contact);
            }
        });

        holder.tvPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickContact.onNumberClick(contact.getPhoneNumber());
            }
        });


    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class Viewhoder extends RecyclerView.ViewHolder {
        TextView tvName, tvPhone;

        public Viewhoder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName_rv);
            tvPhone = itemView.findViewById(R.id.tvPhone_rv);
        }
    }
}
