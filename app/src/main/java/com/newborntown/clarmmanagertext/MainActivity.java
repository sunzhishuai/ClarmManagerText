package com.newborntown.clarmmanagertext;

import android.app.AlarmManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MainActivity extends AppCompatActivity {

    private AlarmManager alarmManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Buyer buyer = new Buyer();
//        Buy o = (Buy) Proxy.newProxyInstance(Buy.class.getClassLoader(), new Class[]{Buy.class}, new DynamiclProxy(buyer));
//        o.buyHourse(1000000);


        Buy o = (Buy) Proxy.newProxyInstance(Buy.class.getClassLoader(), new Class[]{Buy.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return null;
            }
        });


    }
}
