package com.soetun.guitarchord

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class MainActivity : AppCompatActivity() {
    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileAds.initialize(this,getString(R.string.admob_app_id))
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().addTestDevice("F4DAD748D96597A0A2C1A8F0869DEB7F").build()
        mAdView.loadAd(adRequest)
    }
}
