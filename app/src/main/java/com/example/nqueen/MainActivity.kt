package com.example.nqueen

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.decorView.systemUiVisibility = (
                android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
                )

        // Show splash screen first
        setContentView(R.layout.splash_screen)

        Handler(Looper.getMainLooper()).postDelayed({

            // Load WebView layout after splash
            setContentView(R.layout.activity_main)

            val webView: WebView = findViewById(R.id.webView)

            webView.settings.javaScriptEnabled = true
            webView.settings.domStorageEnabled = true
            webView.settings.allowFileAccess = true
            webView.settings.allowContentAccess = true
            webView.settings.mediaPlaybackRequiresUserGesture = false

            webView.webViewClient = WebViewClient()
            webView.webChromeClient = WebChromeClient()

            webView.loadUrl("file:///android_asset/index.html")

        }, 1500) // splash duration (1.5 seconds)
    }
}