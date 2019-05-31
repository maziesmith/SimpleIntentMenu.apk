package com.brigittachesyapricilla.menuintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class Menu2 extends AppCompatActivity {
    ArrayList<String> pilihan = new ArrayList<String>();
    TextView textAkhir ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
        textAkhir = (TextView)findViewById(R.id.tampilMenu);
    }

    public void itemPilih(View view){
        boolean terpilih = ((CheckBox) view).isChecked();
        switch (view.getId())
        {
            case R.id.checkBox_Pizza:
                if (terpilih)
                {pilihan.add("Order anda: Pizza");}
                else
                {
                    pilihan.remove("Order anda: Pizza");
                }
                break;

            case R.id.checkBox_Sashimi:
                if (terpilih)
                {pilihan.add("Order anda: Sashimi");}
                else
                {
                    pilihan.remove("Order anda: Sashimi");
                }
                break;

            case R.id.checkBox_Tokoroten:
                if (terpilih)
                {pilihan.add("Order anda: Tokoroten");}
                else
                {
                    pilihan.remove("Order anda: Tokoroten");
                }
                break;

            case R.id.checkBox_CheeseC:
                if (terpilih)
                {pilihan.add("Order anda: Cheese Cake");}
                else
                {
                    pilihan.remove("Order anda: Cheese Cake");
                }
                break;

            case R.id.checkBox_Gyoza:
                if (terpilih)
                {pilihan.add("Order anda: Gyoza");}
                else
                {
                    pilihan.remove("Order anda: Gyoza");
                }
                break;
        }
    }

    public void pilihanAkhir(View view) {
        String menu_yang_terpilih = "";
        for(String pilihan : pilihan)
        {
            menu_yang_terpilih = menu_yang_terpilih + pilihan + "\n";
        }
        textAkhir.setText(menu_yang_terpilih);
    }
}

