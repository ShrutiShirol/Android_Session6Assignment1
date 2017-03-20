package com.mobilerepair.app.fragmentsinglescreen61;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements MessagePasserInterface{

    FragmentClass fragment;

    EditText edittext;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext=(EditText)findViewById(R.id.editText);
        btn=(Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text_of_edittext=edittext.getText().toString();

                onMessage(text_of_edittext);

            }
        });

    }

    @Override
    public void onMessage(String message) {
        fragment= (FragmentClass) getFragmentManager().findFragmentById(R.id.fragment2);
        fragment.setMessage(message);
    }
}
