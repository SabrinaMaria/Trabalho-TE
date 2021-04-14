package com.example.trabalhote;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.google.android.material.textfield.TextInputEditText;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText textName;
    private TextInputEditText textPhoneNumber;
    private TextInputEditText textBirthDate;
    private CheckBox checkBlacklist;
    private Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initializer();

        setContentView(R.layout.activity_main);

        Customer customer = new Customer();

        checkBlacklist.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                customer.setBlacklist(isChecked);
            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customer.setName(textName.getText().toString());
                customer.setPhoneNumber(textPhoneNumber.getText().toString());

                DateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
                Date date = null;
                try {
                    date = formatter.parse(textBirthDate.getText().toString());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                //customer.setBirthDateInMillis(date);

                customer.setBlacklist(checkBlacklist.isChecked());
            }
        });
    }

    private void initializer() {
        this.textName = findViewById(R.id.tx_nome);
        this.textPhoneNumber = findViewById(R.id.tx_celular);
        this.textBirthDate = findViewById(R.id.tx_datanasc);
        this.checkBlacklist = findViewById(R.id.cb_blacklist);
        this.buttonRegister = findViewById(R.id.bt_cadastrar);
    }
}