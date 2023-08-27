package com.fatma.oppdetay;

import static com.fatma.oppdetay.kedi.konusKediStatic;
import static com.fatma.oppdetay.kedi.turIsmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kedi kedi=new kedi("boncuk","mavi","beyaz");
        kedi kedi2=new kedi();
        kedi2.isim="pamuk";
        System.out.println(kedi2.isim);
        System.out.println(turIsmi);
        kedi.konusKedi();

        Kopek kopek=new Kopek();
        Kopek kopek2=new Kopek("çarli", "kahverengi","siyah");
        System.out.println(kopek2.isim);



    }
}