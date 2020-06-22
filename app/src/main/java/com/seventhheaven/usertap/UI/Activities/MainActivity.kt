package com.seventhheaven.usertap.UI.Activities

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
//import android.widget.Toolbar
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import androidx.viewpager.widget.ViewPager
import com.google.android.material.bottomnavigation.BottomNavigationView
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

        val images:IntArray= intArrayOf(R.drawable.baseline_home_black_36dp,R.drawable.baseline_restaurant_menu_black_36dp
        ,R.drawable.baseline_collections_black_36dp,R.drawable.baseline_card_giftcard_black_36dp
        ,R.drawable.baseline_perm_identity_black_36dp)


        val mNavView:BottomNavigationView=findViewById(R.id.nav_bottomNavigationView)
        val actionBar:Toolbar=findViewById(R.id.nav_ActioBar)
        setSupportActionBar(actionBar)


      //  actionBar.setLogo(R.drawable.ic_launcher)
       // actionBar.setTitle("Seventh Heaven")
       // actionBar.navigationIcon=getDrawable(R.drawable.ic_launcher)

        homeBlankFragment=HomeBlankFragment()
            supportFragmentManager.beginTransaction().replace(R.id.Disp_screen,homeBlankFragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()


            mNavView.setOnNavigationItemSelectedListener {item ->

            when(item.itemId){

                R.id.nav_home -> {
                    homeBlankFragment=HomeBlankFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.Disp_screen,homeBlankFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()
                }
                R.id.nav_menu -> {
                    menuBlankFragment= MenuBlankFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.Disp_screen,menuBlankFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()
                }
                R.id.nav_gallery -> {
                    galleryBlankFragment= GalleryBlankFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.Disp_screen,galleryBlankFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()
                }
                R.id.nav_offers -> {
                    offersBlankFragment= OffersBlankFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.Disp_screen,offersBlankFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()
                }
                R.id.nav_aboutus -> {
                    aboutUsBlankFragment= AboutUsBlankFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.Disp_screen,aboutUsBlankFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()
                }

            }
                    true


        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id=item.itemId
        if (id == R.id.toolbar_notifications){

        }else if (id==R.id.toolbar_location){

        }else if (id==R.id.toolbar_call){

        }
        return super.onOptionsItemSelected(item)
    }

}
