package com.seventhheaven.usertap.UI.Activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.seventhheaven.usertap.R

class MainActivity : AppCompatActivity() {

    lateinit var homeBlankFragment: HomeBlankFragment
    lateinit var menuBlankFragment: MenuBlankFragment
    lateinit var galleryBlankFragment: GalleryBlankFragment
    lateinit var offersBlankFragment: OffersBlankFragment
    lateinit var aboutUsBlankFragment: AboutUsBlankFragment
    //private lateinit var mPager:ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
