package com.example.taobao.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.example.taobao.broadcast.PlusReceiver;

public class MyService extends Service {

    private Intent intent;

    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        intent = new Intent(this, PlusReceiver.class);
        Log.i("测试", "onCreate: " + "服务开启");
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        sendBroadcast(this.intent);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
