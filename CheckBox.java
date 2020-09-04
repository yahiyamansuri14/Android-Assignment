package com.example.assignmentquestion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity<t1> extends AppCompatActivity {
    Button btn;
    CheckBox c1,c2;
    TextView textView;
    private Object view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=(CheckBox)findViewById(R.id.checkbox1);
        c2=(CheckBox)findViewById(R.id.checkbox2);
        textView=(TextView)findViewById(R.id.textView);
        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c1.isChecked())
                    textView.setText(c1.getText().toString());
                else if(c2.isChecked())
                        textView.setText(c2.getText().toString());
                else
                        textView.setText("Nothing is selected");
            }
        });
    }



}
