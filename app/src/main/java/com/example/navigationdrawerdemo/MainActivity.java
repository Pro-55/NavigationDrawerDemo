package com.example.navigationdrawerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText idEtEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idEtEditText = findViewById(R.id.idEtEditText);
        idEtEditText.setText("http://");
        Selection.setSelection(idEtEditText.getText(), idEtEditText.getText().length());
        idEtEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!s.toString().startsWith("http://")) {
                    idEtEditText.setText("http://");
                    Selection.setSelection(idEtEditText.getText(), idEtEditText.getText().length());
                }
            }
        });
    }
}
