package com.brigittachesyapricilla.menuintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Menu1 extends AppCompatActivity {
    private CheckBox check1, check2, check3, check4, check5;
    private Button btnToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);
        addListenerOnButton();
        addListenerOnCheckBox();
    }
    public void addListenerOnCheckBox(){
        check1 =  (CheckBox) findViewById(R.id. checkBox_Coffee);
        check1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox)v).isChecked()){
                            Toast.makeText(Menu1.this, "Wakey wakey!", Toast.LENGTH_LONG).show();
                        }
                    }
                }

        );
        check2 =  (CheckBox) findViewById(R.id. checkBox_Juice);
        check2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox)v).isChecked()){
                            Toast.makeText(Menu1.this, "Healthy!", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );

        check3 =  (CheckBox) findViewById(R.id. checkBox_Milk);
        check3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox)v).isChecked()){
                            Toast.makeText(Menu1.this, "Chesya's favorite! Good choice!", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );

        check4 =  (CheckBox) findViewById(R.id. checkBox_Tea);
        check4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox)v).isChecked()){
                            Toast.makeText(Menu1.this, "So Zen!", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );

        check5 =  (CheckBox) findViewById(R.id. checkBox_Sundae);
        check5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox)v).isChecked()){
                            Toast.makeText(Menu1.this, "Hmm, Yummy!", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );

    }

    public void addListenerOnButton(){
        check1 =  (CheckBox) findViewById(R.id.checkBox_Coffee);
        check2 = (CheckBox) findViewById(R.id.checkBox_Juice);
        check3 = (CheckBox) findViewById(R.id.checkBox_Milk);
        check4 = (CheckBox) findViewById(R.id.checkBox_Tea);
        check5 = (CheckBox) findViewById(R.id.checkBox_Sundae);
        btnToast = (Button) findViewById(R.id.button_toast);

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                result.append("Coffee: ").append(check1.isChecked());
                result.append("\nJuice: ").append(check2.isChecked());
                result.append("\nMilk: ").append(check3.isChecked());
                result.append("\nTea: ").append(check4.isChecked());
                result.append("\nSundae: ").append(check5.isChecked());

                Toast.makeText(Menu1.this, result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
