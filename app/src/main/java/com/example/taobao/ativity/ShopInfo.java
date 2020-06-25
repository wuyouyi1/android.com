package com.example.taobao.ativity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.taobao.R;
import com.example.taobao.fragment.ShopFragment;

public class ShopInfo extends AppCompatActivity {
    ImageView iv_shop;
    TextView tv_price, tv_name;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_info);

        init();
        setInfo();
    }

    private void setInfo() {
        intent = getIntent();
        int shopImg = intent.getIntExtra("shopImg", 0);
        String name = intent.getStringExtra("name");
        String price = intent.getStringExtra("price");
        iv_shop.setBackground(null);
        iv_shop.setImageResource(shopImg);
        tv_name.setText(name);
        tv_price.setText(price);
    }

    private void init() {
        iv_shop = findViewById(R.id.iv_shop);
        tv_price = findViewById(R.id.tv_price);
        tv_name = findViewById(R.id.tv_name);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.btn_cancel:
                finish();
                Toast.makeText(this, "取消", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_buy:
                setResult(100);
                finish();
                Toast.makeText(this, "购买成功！", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}