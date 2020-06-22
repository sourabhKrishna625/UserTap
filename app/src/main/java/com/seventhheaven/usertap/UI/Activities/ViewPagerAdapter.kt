package com.seventhheaven.usertap.UI.Activities

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.seventhheaven.usertap.R

public class ViewPagerAdapter(images:IntArray,context: Context,layoutInflater: LayoutInflater): PagerAdapter() {
    var imagez:IntArray=images
    var layoutInflater2=layoutInflater
    var context2=context
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
       //To change body of created functions use File | Settings | File Templates.
        return view==`object` as LinearLayout
    }

    override fun getCount(): Int {
        //To change body of created functions use File | Settings | File Templates.
        return imagez.size
    }


    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val trailing:ImageView
        layoutInflater2= context2.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val itemView:View=layoutInflater2.inflate(R.layout.image_item,container,false)
        trailing=itemView.findViewById(R.id.image_Collection) as ImageView
        trailing.setImageResource(imagez[position])

        // add item.xml to viewpager
        container.addView(itemView)

        return itemView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
         container.removeView(`object` as LinearLayout)
    }
}