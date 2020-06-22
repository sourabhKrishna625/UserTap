package com.seventhheaven.usertap.UI.Activities


import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

import com.seventhheaven.usertap.R
import kotlinx.android.synthetic.main.fragment_menu_blank2.*

/**
 * A simple [Fragment] subclass.
 */
class MenuBlankFragment : Fragment(),AdapterView.OnItemClickListener {
    override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        var menuItem:MenuItem=menuList!!.get(p2)
        var toMenuItem:Intent=Intent(activity,MenuItemList::class.java)
        startActivity(toMenuItem)
    }

    //  private var gridView:GridView?=null
    private var menuList:ArrayList<MenuItem>?=null
    private var menuAdapter:MenuAdapter?=null
    private var menuView:View?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        menuView=inflater.inflate(R.layout.fragment_menu_blank2, container, false)
        return menuView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        menuList= ArrayList()
        menuList?.add(MenuItem(R.drawable.baseline_home_black_36dp,"home"))
        menuList?.add(MenuItem(R.drawable.baseline_card_giftcard_black_36dp,"gift"))
        menuList?.add(MenuItem(R.drawable.baseline_collections_black_36dp,"gallery"))
        menuList?.add(MenuItem(R.drawable.baseline_local_phone_black_36dp,"contact"))
        menuList?.add(MenuItem(R.drawable.baseline_perm_identity_black_18dp,"about"))

        menuAdapter= MenuAdapter(menuView!!.context, menuList!!)
        menu_grid.adapter=menuAdapter
        menu_grid.onItemClickListener=this





    }

}
