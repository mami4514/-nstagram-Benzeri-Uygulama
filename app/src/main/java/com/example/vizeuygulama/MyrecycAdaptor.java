package com.example.vizeuygulama;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyrecycAdaptor extends RecyclerView.Adapter<MyrecycAdaptor.Myholder> {

    private ArrayList<Dog> dogs;

    public MyrecycAdaptor(ArrayList<Dog> dogs) {

        this.dogs=dogs;

    }

    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.dog_item,parent,false);


        return new Myholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myholder holder, int position) {

        holder.txttür.setText(dogs.get(position).getTür());
        holder.txtisim.setText(dogs.get(position).getIsim());
        holder.imglogo.setImageResource(dogs.get(position).getLogo());

    }

    @Override
    public int getItemCount() {

        return dogs.size();
    }

    public class Myholder extends RecyclerView.ViewHolder{

        TextView txttür,txtisim;
        ImageView imglogo;


        public Myholder(@NonNull View itemView) {
            super(itemView);
            imglogo=itemView.findViewById(R.id.img_logo);
            txttür=itemView.findViewById(R.id.txt_tür);
            txtisim=itemView.findViewById(R.id.txt_isim);
        }
    }



}
