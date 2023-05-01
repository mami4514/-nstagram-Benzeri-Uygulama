package com.example.vizeuygulama;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView benimrecyc;
    private ArrayList<Dog> dogs;
    private MyrecycAdaptor myadaptor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        benimrecyc=findViewById(R.id.myrecycler);
        dogs=new ArrayList<>();
        myadaptor=new MyrecycAdaptor(dogs);
        benimrecyc.setAdapter(myadaptor);
        benimrecyc.setLayoutManager(new LinearLayoutManager(this));
        diziolustur();
        myadaptor.notifyDataSetChanged();

    }

    private void diziolustur() {
        dogs.add(new Dog(R.drawable.pitbull,"Pitbull","Cesur"));
        dogs.add(new Dog(R.drawable.golden,"Golden","Tito"));
        dogs.add(new Dog(R.drawable.kangal,"Sivas Kangali","Pasa"));



    }
}