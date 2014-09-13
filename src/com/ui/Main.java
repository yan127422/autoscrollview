package com.ui;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ScrollView;

public class Main extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        /**
         *  ‰»Î∑®  ≈‰
         */
        final AutoScrollView rl = (AutoScrollView) findViewById(R.id.root_layout);
        rl.setVerticalScrollBarEnabled(false);
        rl.setHorizontalScrollBarEnabled(false);
        rl.setOnResizeListener(new AutoScrollView.OnResizeListener() {

            public void OnResize(int w, int h, int oldw, int oldh) {
                new Handler().post(new Runnable() {
                    @Override
                    public void run() {
                        rl.fullScroll(ScrollView.FOCUS_DOWN);
                    }
                });
            }
        });
    }
}
