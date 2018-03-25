package com.alick.viewstubdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btn_empty;
    private Button btn_fail;
    private Button btn_loading;
    private Button btn_realview;

    private ViewStub vs_holder;
    private ViewStub vs_empty;
    private ViewStub vs_fail;
    private ViewStub vs_loading;

    private TextView hintText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_empty=findViewById(R.id.btn_empty);
        btn_fail=findViewById(R.id.btn_fail);
        btn_loading=findViewById(R.id.btn_loading);
        btn_realview=findViewById(R.id.btn_realview);

        vs_empty =findViewById(R.id.vs_empty);
        vs_fail =findViewById(R.id.vs_fail);
        vs_loading =findViewById(R.id.vs_loading);

        btn_empty.setOnClickListener(this);
        btn_fail.setOnClickListener(this);
        btn_loading.setOnClickListener(this);
        btn_realview.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_empty:
                vs_empty.inflate();
                break;
            case R.id.btn_fail:
                vs_fail.inflate();
                break;
            case R.id.btn_loading:
                vs_loading.inflate();
                break;
            case R.id.btn_realview:
                break;
        }
    }
}
