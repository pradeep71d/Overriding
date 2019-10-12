package com.example.override;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Animal a=new Animal();//in overriding we create references of parent class and objects of Both parent and child class.
        a.move();//and then call methods with the help of references.in overriding methods of child and parent class must be same
        Animal b=new Dog();// here we are creating another reference of parent class but object of child class
        b.move();
    }
}
