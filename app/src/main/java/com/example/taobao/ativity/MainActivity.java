package com.example.taobao.ativity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.taobao.R;
import com.example.taobao.fragment.MeFragment;
import com.example.taobao.fragment.ShopFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private TextView tv_shop, tv_me;
    private List<Fragment> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setViewPager();
    }

    private void setViewPager() {
        list = new ArrayList<>();
        list.add(new ShopFragment());
        list.add(new MeFragment());
        MyAdapter adapter = new MyAdapter(getSupportFragmentManager(), 0);
        mViewPager.setAdapter(adapter);
        tv_shop.setSelected(true);

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        setTabStyle(tv_shop);
                        setTitle("购物车");
                        break;
                    case 1:
                        setTabStyle(tv_me);
                        setTitle("个人中心");
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_shop:
                mViewPager.setCurrentItem(0);
                break;
            case R.id.tv_me:
                mViewPager.setCurrentItem(1);
                break;
        }
    }

    private class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return list.get(position);
        }

        @Override
        public int getCount() {
            return list.size();
        }
    }

    private void setTabStyle(TextView view) {
        tv_me.setSelected(false);
        tv_shop.setSelected(false);
        view.setSelected(true);
    }

    private void init() {
        mViewPager = findViewById(R.id.mViewPager);
        tv_shop = findViewById(R.id.tv_shop);
        tv_me = findViewById(R.id.tv_me);
    }
}