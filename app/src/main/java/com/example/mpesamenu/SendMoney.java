package com.example.mpesamenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SendMoney extends AppCompatActivity {
private EditText phoneNo,amount;
private Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_money);

        phoneNo=findViewById(R.id.phone);
        amount=findViewById(R.id.amount);
        send=findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone=phoneNo.getText().toString();
                String amt=amount.getText().toString();

                if (amt.equals("")||phone.equals("")){
                    Toast.makeText(SendMoney.this, "Fill all the fields!!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Transaction successful", Toast.LENGTH_SHORT).show();
                    Intent back=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(back);
                }
            }
        });
    }
}