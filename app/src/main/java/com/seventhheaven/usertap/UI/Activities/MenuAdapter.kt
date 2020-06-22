package com.seventhheaven.usertap.UI.Activities

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.seventhheaven.usertap.R

class MenuAdapter(var conetxt:Context,var arrayList: ArrayList<MenuItem>):BaseAdapter(){
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var view: View = View.inflate(conetxt, R.layout.menu_grid, null)
        var Icons:ImageView=view.findViewById(R.id.menu_icons)
        var names:TextView=view.findViewById(R.id.image_name)

        var menuItem:MenuItem=arrayList.get(p0)

        Icons.setImageResource(menuItem.icons!!)
        names.text=menuItem.name

        return view
    }

    override fun getItem(p0: Int): Any {
        return arrayList.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return arrayList.size
    }
}