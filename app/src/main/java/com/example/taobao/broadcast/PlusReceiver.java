package com.example.taobao.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.taobao.R;
import com.example.taobao.fragment.ShopFragment;

public class PlusReceiver extends BroadcastReceiver {
    private double value = 39.9;

    @Override
    public void onReceive(final Context context, Intent intent) {

        new Thread() {
            @Override
            public void run() {
                super.run();
                while (true) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    value += 1;
                    Log.i("测试", "value1: " + value);
                    Message message = Message.obtain();
                    message.obj = value;
                    ShopFragment.handler.sendMessage(message);
                }
            }
        }.start();
    }
}
