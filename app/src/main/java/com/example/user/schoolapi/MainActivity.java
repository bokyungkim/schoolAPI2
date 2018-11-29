package com.example.user.schoolapi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button)findViewById(R.id.button);


        button1.setOnClickListener(new View.OnClickListener() {
            EditText schoolname = (EditText)findViewById(R.id.input);; //학교이름을 입력받는 입력창
            String school = schoolname.getText().toString(); //텍스트로 입력받은 문자열을 학교 코드로 이용하기

            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this, menu.class);
                intent1.putExtra("SCHOOL_NAME",school); //menu activity로 값을 전달하기위한 키-값 생성
                startActivity(intent1);
            }
        });



    }
}
