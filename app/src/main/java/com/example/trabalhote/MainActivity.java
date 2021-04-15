package com.example.trabalhote;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.google.android.material.textfield.TextInputEditText;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText textName;
    private TextInputEditText textPhoneNumber;
    private TextInputEditText textBirthDate;
    private CheckBox checkBlacklist;
    private Button buttonRegister;
    private Retrofit retrofit;
    private CustomerService customerService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializer();

        retrofit = new Retrofit.Builder()
                .baseUrl("http://guisfco-online-shopping-api.herokuapp.com/api/online-shopping/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        customerService = retrofit.create(CustomerService.class);

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
                customer.setBirthDateInMillis(textBirthDate.getText().toString());
                customer.setBlacklist(checkBlacklist.isChecked());

                customerService.create(customer);
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
