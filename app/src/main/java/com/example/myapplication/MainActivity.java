package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity {
    private WebView aWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aWebView = findViewById(R.id.webViewId);

        WebSettings aWebSetting = aWebView.getSettings();
        aWebSetting.setJavaScriptEnabled(true); //javaScript enabled
        aWebView.setWebViewClient(new WebViewClient()); //show any tab in app
        aWebView.loadUrl("https://msrdev.xyz/");

    }

    //for go back

    @Override
    public void onBackPressed() {
        if(aWebView.canGoBack())
            aWebView.goBack();
        else
            super.onBackPressed();
    }
}