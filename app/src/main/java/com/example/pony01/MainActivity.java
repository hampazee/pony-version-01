package com.example.pony01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

// https://www.youtube.com/watch?v=xmZA7nof7ec&ab_channel=AndroidCoding ----- fab tutorial

public class MainActivity extends AppCompatActivity {

    //---左上fab的define---
    Boolean PersonisOpen = false;

    FloatingActionButton menuFab;
    ExtendedFloatingActionButton menuSetting,menuSalary,menuChange,menuShare,menuMerge;
    //---右下ingBtn define---
    ImageButton addEvent_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //---左上的fab---
        menuFab =findViewById(R.id.burger_list);
        menuSetting = findViewById(R.id.burger_setting_btn);
        menuChange = findViewById(R.id.burger_change_btn);
        menuShare = findViewById(R.id.burger_share_btn);
        menuMerge = findViewById(R.id.burger_merge_btn);
        menuSalary = findViewById(R.id.burger_salary_btn);
        //---hide the extnedBtn---
        menuSetting.setVisibility(View.GONE);
        menuChange.setVisibility(View.GONE);
        menuMerge.setVisibility(View.GONE);
        menuSalary.setVisibility(View.GONE);
        menuShare.setVisibility(View.GONE);
        //---左上fab onclick---
        menuFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!PersonisOpen){
                    menuSetting.show();
                    menuChange.show();
                    menuMerge.show();
                    menuSalary.show();
                    menuShare.show();
                    PersonisOpen=true;
                }
                else{
                    menuSetting.hide();
                    menuChange.hide();
                    menuMerge.hide();
                    menuSalary.hide();
                    menuShare.hide();
                    PersonisOpen= false;
                }
            }
        });
        //---右下imgBtn---
        addEvent_btn = findViewById(R.id.addEvent_Btn);


        //---右下imgBtn的intent---
        Intent AddEvent = new Intent();
        addEvent_btn.setOnClickListener((v -> {
            AddEvent.setClass(this,addEventClass.class);
            startActivity(AddEvent);
        }));

    }


}