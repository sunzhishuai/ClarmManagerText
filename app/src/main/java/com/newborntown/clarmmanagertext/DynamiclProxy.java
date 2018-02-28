package com.newborntown.clarmmanagertext;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Graceful Sun on 18/2/28.
 * E-mail itzhishuaisun@sina.com
 */

public class DynamiclProxy implements InvocationHandler {
    private Buy buy;

    public DynamiclProxy(Buy buy) {
        this.buy = buy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("buyHourse")) {
            float arg = (float) args[0];
            float newMoney = arg * 0.99f;
            Log.e("proxy", "坑了我们" + (arg - newMoney));
            return method.invoke(buy, args);
        }
        return null;
    }
}
