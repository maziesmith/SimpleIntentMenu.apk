package com.brigittachesyapricilla.menuintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button menuBtn1, menuBtn2, Cat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuBtn1 = (Button) findViewById(R.id.Menu1);
        menuBtn2 = (Button) findViewById(R.id.Menu2);
        Cat = (Button) findViewById(R.id.Catatan);

//2016230006
//che
//sya
        menuBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            openMenu1();
            }
        });

        menuBtn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openMenu2();
            }
        });

        Cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCat();
            }
        });
    }
    public void openMenu1(){
        Intent intent = new Intent(this, Menu1.class);
        startActivity(intent);
    }

    public void openMenu2(){
        Intent intent = new Intent(this, Menu2.class);
        startActivity(intent);
    }

    public void openCat(){
        Intent intent = new Intent(this, Menu3.class);
        startActivity(intent);
    }

    public void btnKeluar(View view) {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
}
