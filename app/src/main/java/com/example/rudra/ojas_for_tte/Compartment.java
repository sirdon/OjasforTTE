package com.example.rudra.ojas_for_tte;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Compartment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compartment);
    }

    public void cmprt1(View view){
        Intent intent=new Intent(Compartment.this,Compartment1.class);
        startActivity(intent);
    }
    public void cmprt2(View view){
        Intent intent=new Intent(Compartment.this,compartment2.class);
        startActivity(intent);
    }
    public void cmprt3(View view){
        Intent intent=new Intent(Compartment.this,compartment3.class);
        startActivity(intent);
    }
    public void cmprt4(View view){
        Intent intent=new Intent(Compartment.this,compartment4.class);
        startActivity(intent);
    }
    public void cmprt5(View view){
        Intent intent=new Intent(Compartment.this,compartment5.class);
        startActivity(intent);
    }
    public void cmprt6(View view){
        Intent intent=new Intent(Compartment.this,compartment6.class);
        startActivity(intent);
    }
    public void cmprt7(View view){
        Intent intent=new Intent(Compartment.this,compartment7.class);
        startActivity(intent);
    }
    public void cmprt8(View view){
        Intent intent=new Intent(Compartment.this,compartment8.class);
        startActivity(intent);
    }
    public void cmprt9(View view){
        Intent intent=new Intent(Compartment.this,compartment9.class);
        startActivity(intent);
    }

}
