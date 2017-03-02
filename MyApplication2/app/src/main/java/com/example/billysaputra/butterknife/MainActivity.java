package com.example.billysaputra.butterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.hello) TextView hello;
    @BindView(R.id.button) Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.hello)
        public void test(TextView hello){
            hello.setText("hello");
        }

    @OnClick(R.id.button)
    public void sayHi(Button button) {
        button.setText("Hello!");
    }
}
