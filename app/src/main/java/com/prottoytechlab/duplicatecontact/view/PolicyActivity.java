package com.prottoytechlab.duplicatecontact.view;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.prottoytechlab.duplicatecontact.R;
import com.prottoytechlab.duplicatecontact.utils.Helper;

public class PolicyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policy);
        Helper.setColorStatusBar(this, R.color.status_bar);

         findViewById(R.id.imgBack).setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 onBackPressed();
             }
         });

        //Ads.initBanner(((LinearLayout)findViewById(R.id.lnNative)), this, true);

        initView();
    }

    private void initView() {
        try {
            WebView wvHome = (WebView) findViewById(R.id.webView);
            wvHome.loadUrl("file:///android_asset/index.html");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
