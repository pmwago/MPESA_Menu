package com.example.mpesamenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Toolbar.OnMenuItemClickListener {
    private ListView lv;
    String menuItems[] = {"Send Money", "Withdraw Cash", "Buy Airtime", "Loans and Savings", "Lipa na M-PESA", "My Account"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Safaricom");
        toolbar.inflateMenu(R.menu.toolbar);
        toolbar.setOnMenuItemClickListener(this);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, menuItems);
        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        Intent sendMoney=new Intent(getApplicationContext(),SendMoney.class);
                        startActivity(sendMoney);
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        Intent lipaMpesa=new Intent(getApplicationContext(),LipanaMpesa.class);
                        startActivity(lipaMpesa);
                        break;
                    case 5:
                        break;
                    default:
                        break;
                }
            }
        });
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.threebuttons:
                Toast.makeText(this, "MPESA", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }
}