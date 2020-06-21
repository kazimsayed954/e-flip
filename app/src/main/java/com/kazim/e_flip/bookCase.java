package com.kazim.e_flip;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class bookCase extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_case);
        webView=findViewById(R.id.webView2);

        WebSettings webSettings=webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.loadUrl("https://www.eflipmagazine.com/editions/book-case");
            webView.setWebViewClient(new WebViewClient());
        }

        @Override
        public void onBackPressed() {
            if(webView.canGoBack()){
                webView.goBack();
            }else {
                super.onBackPressed();
            }
        }
    }
