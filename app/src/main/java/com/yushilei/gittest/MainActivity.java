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
        String msg_1 = "Master分支修改1";
    }

    public void btn2(View view) {
        Toast.makeText(this, "你好1", Toast.LENGTH_SHORT).show();
    }

    public void btn3(View view) {
        Toast.makeText(this, "Dev1", Toast.LENGTH_SHORT).show();
    }
}
