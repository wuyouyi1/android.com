package com.example.taobao.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.taobao.R;
import com.example.taobao.ativity.ShopInfo;
import com.example.taobao.service.MyService;

import java.util.Objects;


public class ShopFragment extends Fragment implements View.OnClickListener {
    private View view;
    private LinearLayout myLinearLayout, myLinearLayout2, myLinearLayout3, myLinearLayout4, myLinearLayout5, myLinearLayout6;
    private LinearLayout myLinearLayout7, myLinearLayout8, myLinearLayout9, myLinearLayout10, myLinearLayout11, myLinearLayout12;
    private ImageView iv_minus, iv_minus2, iv_minus3, iv_minus4, iv_minus5, iv_minus6, iv_minus7, iv_minus8, iv_minus9, iv_minus10, iv_minus11, iv_minus12;
    private ImageView iv_plus, iv_plus2, iv_plus3, iv_plus4, iv_plus5, iv_plus6, iv_plus7, iv_plus8, iv_plus9, iv_plus10, iv_plus11, iv_plus12;
    private EditText et_value, et_value2, et_value3, et_value4, et_value5, et_value6;
    private EditText et_value7, et_value8, et_value9, et_value10, et_value11, et_value12;
    private static TextView tv_price;

    public static Handler handler = new Handler() {
        @SuppressLint("HandlerLeak")
        @Override
        public void handleMessage(@SuppressLint("HandlerLeak") @NonNull Message msg) {
            super.handleMessage(msg);
            Double value = (Double) msg.obj;
            tv_price.setText("¥" + value);
        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_shop, container, false);
        init();
        return view;
    }

    @SuppressLint("NewApi")
    private void init() {
        myLinearLayout = view.findViewById(R.id.myLinearLayout);
        myLinearLayout2 = view.findViewById(R.id.myLinearLayout2);
        myLinearLayout3 = view.findViewById(R.id.myLinearLayout3);
        myLinearLayout4 = view.findViewById(R.id.myLinearLayout4);
        myLinearLayout5 = view.findViewById(R.id.myLinearLayout5);
        myLinearLayout6 = view.findViewById(R.id.myLinearLayout6);
        myLinearLayout7 = view.findViewById(R.id.myLinearLayout7);
        myLinearLayout8 = view.findViewById(R.id.myLinearLayout8);
        myLinearLayout9 = view.findViewById(R.id.myLinearLayout9);
        myLinearLayout10 = view.findViewById(R.id.myLinearLayout10);
        myLinearLayout11 = view.findViewById(R.id.myLinearLayout11);
        myLinearLayout12 = view.findViewById(R.id.myLinearLayout12);
        myLinearLayout.setOnClickListener(this);
        myLinearLayout2.setOnClickListener(this);
        myLinearLayout3.setOnClickListener(this);
        myLinearLayout4.setOnClickListener(this);
        myLinearLayout5.setOnClickListener(this);
        myLinearLayout6.setOnClickListener(this);
        myLinearLayout7.setOnClickListener(this);
        myLinearLayout8.setOnClickListener(this);
        myLinearLayout9.setOnClickListener(this);
        myLinearLayout10.setOnClickListener(this);
        myLinearLayout11.setOnClickListener(this);
        myLinearLayout12.setOnClickListener(this);
        tv_price = view.findViewById(R.id.tv_price);
        iv_minus = view.findViewById(R.id.iv_minus);
        et_value = view.findViewById(R.id.et_value);
        iv_plus = view.findViewById(R.id.iv_plus);
        iv_minus2 = view.findViewById(R.id.iv_minus2);
        et_value2 = view.findViewById(R.id.et_value2);
        iv_plus2 = view.findViewById(R.id.iv_plus2);
        iv_minus3 = view.findViewById(R.id.iv_minus3);
        et_value3 = view.findViewById(R.id.et_value3);
        iv_plus3 = view.findViewById(R.id.iv_plus3);
        iv_minus4 = view.findViewById(R.id.iv_minus4);
        et_value4 = view.findViewById(R.id.et_value4);
        iv_plus4 = view.findViewById(R.id.iv_plus4);
        iv_minus5 = view.findViewById(R.id.iv_minus5);
        et_value5 = view.findViewById(R.id.et_value5);
        iv_plus5 = view.findViewById(R.id.iv_plus5);
        iv_minus6 = view.findViewById(R.id.iv_minus6);
        et_value6 = view.findViewById(R.id.et_value6);
        iv_plus6 = view.findViewById(R.id.iv_plus6);
        iv_minus7 = view.findViewById(R.id.iv_minus7);
        et_value7 = view.findViewById(R.id.et_value7);
        iv_plus7 = view.findViewById(R.id.iv_plus7);
        iv_minus8 = view.findViewById(R.id.iv_minus8);
        et_value8 = view.findViewById(R.id.et_value8);
        iv_plus8 = view.findViewById(R.id.iv_plus8);
        iv_minus9 = view.findViewById(R.id.iv_minus9);
        et_value9 = view.findViewById(R.id.et_value9);
        iv_plus9 = view.findViewById(R.id.iv_plus9);
        iv_minus10 = view.findViewById(R.id.iv_minus10);
        et_value10 = view.findViewById(R.id.et_value10);
        iv_plus10 = view.findViewById(R.id.iv_plus10);
        iv_minus11 = view.findViewById(R.id.iv_minus11);
        et_value11 = view.findViewById(R.id.et_value11);
        iv_plus11 = view.findViewById(R.id.iv_plus11);
        iv_minus12 = view.findViewById(R.id.iv_minus12);
        et_value12 = view.findViewById(R.id.et_value12);
        iv_plus12 = view.findViewById(R.id.iv_plus12);
        iv_minus.setOnClickListener(this);
        iv_minus2.setOnClickListener(this);
        iv_minus3.setOnClickListener(this);
        iv_minus4.setOnClickListener(this);
        iv_minus5.setOnClickListener(this);
        iv_minus6.setOnClickListener(this);
        iv_minus7.setOnClickListener(this);
        iv_minus8.setOnClickListener(this);
        iv_minus9.setOnClickListener(this);
        iv_minus10.setOnClickListener(this);
        iv_minus11.setOnClickListener(this);
        iv_minus12.setOnClickListener(this);
        iv_plus.setOnClickListener(this);
        iv_plus2.setOnClickListener(this);
        iv_plus3.setOnClickListener(this);
        iv_plus4.setOnClickListener(this);
        iv_plus5.setOnClickListener(this);
        iv_plus6.setOnClickListener(this);
        iv_plus7.setOnClickListener(this);
        iv_plus8.setOnClickListener(this);
        iv_plus9.setOnClickListener(this);
        iv_plus10.setOnClickListener(this);
        iv_plus11.setOnClickListener(this);
        iv_plus12.setOnClickListener(this);

        
        Intent intent = new Intent(getContext(), MyService.class);
        Objects.requireNonNull(getActivity()).startService(intent);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getContext(), ShopInfo.class);
        String value = et_value.getText().toString().trim();
        String value2 = et_value2.getText().toString().trim();
        String value3 = et_value3.getText().toString().trim();
        String value4 = et_value4.getText().toString().trim();
        String value5 = et_value5.getText().toString().trim();
        String value6 = et_value6.getText().toString().trim();
        String value7 = et_value7.getText().toString().trim();
        String value8 = et_value8.getText().toString().trim();
        String value9 = et_value9.getText().toString().trim();
        String value10 = et_value10.getText().toString().trim();
        String value11 = et_value11.getText().toString().trim();
        String value12 = et_value12.getText().toString().trim();
        switch (v.getId()) {
            case R.id.myLinearLayout:
                String price = tv_price.getText().toString().trim();
                intent.putExtra("shopImg", R.drawable.milk);
                intent.putExtra("price", price);
                intent.putExtra("name", "蒙牛纯真牛奶");
                startActivityForResult(intent, 1);
                break;
            case R.id.myLinearLayout2:
                intent.putExtra("shopImg", R.drawable.book);
                intent.putExtra("price", "¥75.5");
                intent.putExtra("name", "数据库原理与应用");
                startActivityForResult(intent, 2);
                break;
            case R.id.myLinearLayout3:
                intent.putExtra("shopImg", R.drawable.computer);
                intent.putExtra("price", "¥5999.9");
                intent.putExtra("name", "华硕笔记本");
                startActivityForResult(intent, 3);
                break;
            case R.id.myLinearLayout4:
                intent.putExtra("shopImg", R.drawable.a);
                intent.putExtra("price", "¥588.8");
                intent.putExtra("name", "最新款正品ck手表");
                startActivityForResult(intent, 4);
                break;
            case R.id.myLinearLayout5:
                intent.putExtra("shopImg", R.drawable.c);
                intent.putExtra("price", "¥1399.9");
                intent.putExtra("name", "女士手提包");
                startActivityForResult(intent, 5);
                break;
            case R.id.myLinearLayout6:
                intent.putExtra("shopImg", R.drawable.e);
                intent.putExtra("price", "¥9.9");
                intent.putExtra("name", "乐事45g经典原味");
                startActivityForResult(intent, 6);
                break;
            case R.id.myLinearLayout7:
                intent.putExtra("shopImg", R.drawable.f);
                intent.putExtra("price", "¥4.5");
                intent.putExtra("name", "卫龙辣条");
                startActivityForResult(intent, 7);
                break;
            case R.id.myLinearLayout8:
                intent.putExtra("shopImg", R.drawable.g);
                intent.putExtra("price", "¥4.5");
                intent.putExtra("name", "卫龙辣条");
                startActivityForResult(intent, 8);
                break;
            case R.id.myLinearLayout9:
                intent.putExtra("shopImg", R.drawable.h);
                intent.putExtra("price", "¥50.5");
                intent.putExtra("name", "Android移动开发基础案例教程");
                startActivityForResult(intent, 9);
                break;
            case R.id.myLinearLayout10:
                intent.putExtra("shopImg", R.drawable.i);
                intent.putExtra("price", "¥88.8");
                intent.putExtra("name", "第一行代码");
                startActivityForResult(intent, 10);
                break;
            case R.id.myLinearLayout11:
                intent.putExtra("shopImg", R.drawable.j);
                intent.putExtra("price", "¥5880.9");
                intent.putExtra("name", "Lenovo笔记本");
                startActivityForResult(intent, 11);
                break;
            case R.id.myLinearLayout12:
                intent.putExtra("shopImg", R.drawable.k);
                intent.putExtra("price", "¥1999.9");
                intent.putExtra("name", "vivoY71");
                startActivityForResult(intent, 12);
                break;
            case R.id.iv_minus:
                if (Integer.parseInt(value) > 0)
                    et_value.setText(Integer.parseInt(value) - 1 + "");
                break;
            case R.id.iv_plus:
                et_value.setText(Integer.parseInt(value) + 1 + "");
                break;
            case R.id.iv_minus2:
                if (Integer.parseInt(value2) > 0)
                    et_value2.setText(Integer.parseInt(value2) - 1 + "");
                break;
            case R.id.iv_plus2:
                et_value2.setText(Integer.parseInt(value2) + 1 + "");
                break;
            case R.id.iv_minus3:
                if (Integer.parseInt(value3) > 0)
                    et_value3.setText(Integer.parseInt(value3) - 1 + "");
                break;
            case R.id.iv_plus3:
                et_value3.setText(Integer.parseInt(value3) + 1 + "");
                break;
            case R.id.iv_minus4:
                if (Integer.parseInt(value4) > 0)
                    et_value4.setText(Integer.parseInt(value4) - 1 + "");
                break;
            case R.id.iv_plus4:
                et_value4.setText(Integer.parseInt(value4) + 1 + "");
                break;
            case R.id.iv_minus5:
                if (Integer.parseInt(value5) > 0)
                    et_value5.setText(Integer.parseInt(value5) - 1 + "");
                break;
            case R.id.iv_plus5:
                et_value5.setText(Integer.parseInt(value5) + 1 + "");
                break;
            case R.id.iv_minus6:
                if (Integer.parseInt(value6) > 0)
                    et_value6.setText(Integer.parseInt(value6) - 1 + "");
                break;
            case R.id.iv_plus6:
                et_value6.setText(Integer.parseInt(value6) + 1 + "");
                break;
            case R.id.iv_minus7:
                if (Integer.parseInt(value7) > 0)
                    et_value7.setText(Integer.parseInt(value7) - 1 + "");
                break;
            case R.id.iv_plus7:
                et_value7.setText(Integer.parseInt(value7) + 1 + "");
                break;
            case R.id.iv_minus8:
                if (Integer.parseInt(value8) > 0)
                    et_value8.setText(Integer.parseInt(value8) - 1 + "");
                break;
            case R.id.iv_plus8:
                et_value8.setText(Integer.parseInt(value8) + 1 + "");
                break;
            case R.id.iv_minus9:
                if (Integer.parseInt(value9) > 0)
                    et_value9.setText(Integer.parseInt(value9) - 1 + "");
                break;
            case R.id.iv_plus9:
                et_value9.setText(Integer.parseInt(value9) + 1 + "");
                break;
            case R.id.iv_minus10:
                if (Integer.parseInt(value10) > 0)
                    et_value10.setText(Integer.parseInt(value10) - 1 + "");
                break;
            case R.id.iv_plus10:
                et_value10.setText(Integer.parseInt(value10) + 1 + "");
                break;
            case R.id.iv_minus11:
                if (Integer.parseInt(value11) > 0)
                    et_value11.setText(Integer.parseInt(value11) - 1 + "");
                break;
            case R.id.iv_plus11:
                et_value11.setText(Integer.parseInt(value11) + 1 + "");
                break;
            case R.id.iv_minus12:
                if (Integer.parseInt(value12) > 0)
                    et_value12.setText(Integer.parseInt(value12) - 1 + "");
                break;
            case R.id.iv_plus12:
                et_value12.setText(Integer.parseInt(value12) + 1 + "");
                break;
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 100) {
            switch (requestCode) {
                case 1:
                    myLinearLayout.setVisibility(View.GONE);
                    break;
                case 2:
                    myLinearLayout2.setVisibility(View.GONE);
                    break;
                case 3:
                    myLinearLayout3.setVisibility(View.GONE);
                    break;
                case 4:
                    myLinearLayout4.setVisibility(View.GONE);
                    break;
                case 5:
                    myLinearLayout5.setVisibility(View.GONE);
                    break;
                case 6:
                    myLinearLayout6.setVisibility(View.GONE);
                    break;
                case 7:
                    myLinearLayout7.setVisibility(View.GONE);
                    break;
                case 8:
                    myLinearLayout8.setVisibility(View.GONE);
                    break;
                case 9:
                    myLinearLayout9.setVisibility(View.GONE);
                    break;
                case 10:
                    myLinearLayout10.setVisibility(View.GONE);
                    break;
                case 11:
                    myLinearLayout11.setVisibility(View.GONE);
                    break;
                case 12:
                    myLinearLayout12.setVisibility(View.GONE);
                    break;
            }
        }
    }
}