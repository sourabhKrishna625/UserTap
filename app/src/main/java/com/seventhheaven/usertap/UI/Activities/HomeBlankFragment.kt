package com.seventhheaven.usertap.UI.Activities


import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager

import com.seventhheaven.usertap.R
import kotlinx.android.synthetic.main.fragment_home_blank.*
import me.relex.circleindicator.CircleIndicator
import java.util.*
import com.seventhheaven.usertap.UI.Activities.ViewPagerAdapter as ViewPagerAdapter1

/**
 * A simple [Fragment] subclass.
 */
class HomeBlankFragment() : Fragment() {

    lateinit var viewPager: ViewPager
    lateinit var pagerAdapter: PagerAdapter
    lateinit var img:IntArray
    lateinit var fragmentView:View
    var currentPage=0
    var numpages=0
    val images:IntArray= intArrayOf(R.drawable.baseline_home_black_36dp,R.drawable.baseline_restaurant_menu_black_36dp
        ,R.drawable.baseline_collections_black_36dp,R.drawable.baseline_card_giftcard_black_36dp
        ,R.drawable.baseline_perm_identity_black_36dp)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentView=inflater.inflate(R.layout.fragment_home_blank, container, false)
        return fragmentView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        pagerAdapter=com.seventhheaven.usertap.UI.Activities.ViewPagerAdapter(images,fragmentView.context,layoutInflater)
        pager.adapter=pagerAdapter

        indicator.setViewPager(pager)

        pager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            override fun onPageScrollStateChanged(state: Int) {
                if (state==ViewPager.SCROLL_STATE_IDLE){
                    var pagecount=images.size
                    if(currentPage==0){
                        pager.setCurrentItem(pagecount-1,false)
                    }else if (currentPage==pagecount-1){
                        pager.setCurrentItem(0,false)
                    }
                }
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
            currentPage=position
            }


        })
        var handler:Handler= Handler()
        var runnable:Runnable= Runnable {
            fun run() {
                if (currentPage==numpages){
                    currentPage=0;
                }
                pager.setCurrentItem(currentPage++,true)
            }
        }
        handler.postDelayed(runnable,1000)


    }
}

