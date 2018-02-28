package com.newborntown.clarmmanagertext;

import android.util.Log;

/**
 * Created by Graceful Sun on 18/2/28.
 * E-mail itzhishuaisun@sina.com
 */

public class Buyer implements Buy {
    @Override
    public void buyHourse(float money) {
        Log.e("proxy","买房子花费"+money);
    }
}
