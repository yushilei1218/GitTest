package com.yushilei.gittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String msg = "Dev 分支修改1";
        String msg2 = "Dev 分支修改2";
        String msg_1 = "Master分支修改1";
        String msg_2 = "Master分支修改2";
        String msg_3 = "Feature-1分支修改1";
        String msg_4 = "Feature-1分支修改2";

        String msg_5 = "Feature-1分支修改3";


        String msg_6 = "Master 分支修改3";
        String msg_7 = "Master1分支修改4";
        String msg_8 = "Dev分支修改3";
    }

    public void btn2(View view) {
        Toast.makeText(this, "你好1", Toast.LENGTH_SHORT).show();
    }

    public void btn3(View view) {
        Toast.makeText(this, "Dev1", Toast.LENGTH_SHORT).show();
    }
}
