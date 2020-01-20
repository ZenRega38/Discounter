package com.regadeveloper.discounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DiscountActivity extends AppCompatActivity {
    private EditText harga, diskon;
    private Button hasil;
    private TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount);

        harga = findViewById(R.id.edit1);
        diskon = findViewById(R.id.edit2);
        hasil = findViewById(R.id.button1);
        total = findViewById(R.id.teks4);

        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int nharga = Integer.parseInt(harga.getText().toString());
                int ndiskon = Integer.parseInt(diskon.getText().toString());
                int diskon = ndiskon * nharga;
                int totaldiskon = diskon / 100;
                int totalbayar = nharga -totaldiskon;
                total.setText(String.valueOf(totalbayar));
            }
        });
    }

    public void keluar (View view){
        finish();
    }
}

