package com.example.exercisemenu18a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LingkaranActivity extends AppCompatActivity {

    EditText eJari, eLuas, eKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
    }

    public void myClickHandler(View v){
        eJari = (EditText) findViewById(R.id.ejari);
        eLuas = (EditText) findViewById(R.id.eluas);
        eKeliling = (EditText) findViewById(R.id.ekeliling);
        switch (v.getId()){
            case R.id.btnproses:
                int jari = Integer.parseInt(eJari.getText().toString());


                double luas = 3.14 * jari * jari ;
                double keliling = 2 * 3.14 ;

                eLuas.setText(String.valueOf(luas));
                eKeliling.setText(String.valueOf(keliling));

                break;
            case R.id.btnhapus:
                eJari.setText("");
                eLuas.setText("");
                eKeliling.setText("");

                break;
        }
    }

}