package com.example.th06_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtName;
    private Button btnClick_Main;
    private EditText edtData_Main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        StudentFragment studentFragment = new StudentFragment();
        fragmentTransaction.add(R.id.frag_Student, studentFragment);

        txtName = findViewById(R.id.txtName_Student);
        edtData_Main = findViewById(R.id.txtData);

        btnClick_Main = findViewById(R.id.btnClick);
        btnClick_Main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtName.setText(edtData_Main.getText().toString());
            }
        });
        fragmentTransaction.commit();


    }
}