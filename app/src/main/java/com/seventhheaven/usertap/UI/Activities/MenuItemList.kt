package com.seventhheaven.usertap.UI.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.seventhheaven.usertap.R
import kotlinx.android.synthetic.main.activity_menu_item_list.*

class MenuItemList : AppCompatActivity() {
    private lateinit var selectedItemList: RecyclerView
    private lateinit var selectedMenuAdapter: RecyclerView.Adapter<SelectedMenuAdapter.MyViewHolder>
    private lateinit var viewManager: RecyclerView.LayoutManager
 //   private lateinit var itemsList:ArrayList<SelectedItemDetails>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_item_list)
        val itemsList=ArrayList<SelectedItemDetails>()

        itemsList.add(SelectedItemDetails("cake","20$",R.drawable.icon_menu_item_new,R.drawable.icon_menu_bestseller_item,true,false))
        itemsList.add(SelectedItemDetails("cholclates","10$",R.drawable.icon_menu_item_new,R.drawable.icon_menu_bestseller_item,false,true))
        itemsList.add(SelectedItemDetails("biscuits","5$",R.drawable.icon_menu_item_new,R.drawable.icon_menu_bestseller_item,false,false))
        itemsList.add(SelectedItemDetails("puffs","6$",R.drawable.icon_menu_item_new,R.drawable.icon_menu_bestseller_item,false,false))
        itemsList.add(SelectedItemDetails("cookies","4$",R.drawable.icon_menu_item_new,R.drawable.icon_menu_bestseller_item,false,false))
        itemsList.add(SelectedItemDetails("buns","7$",R.drawable.icon_menu_item_new,R.drawable.icon_menu_bestseller_item,false,true))
        itemsList.add(SelectedItemDetails("ice creams","5$",R.drawable.icon_menu_item_new,R.drawable.icon_menu_bestseller_item,true,false))
        itemsList.add(SelectedItemDetails("coke","5$",R.drawable.icon_menu_item_new,R.drawable.icon_menu_bestseller_item,false,false))
        itemsList.add(SelectedItemDetails("fanta","5$",R.drawable.icon_menu_item_new,R.drawable.icon_menu_bestseller_item,false,true))
        itemsList.add(SelectedItemDetails("thumsup","20$",R.drawable.icon_menu_item_new,R.drawable.icon_menu_bestseller_item,true,false))
        itemsList.add(SelectedItemDetails("candles","20$",R.drawable.icon_menu_item_new,R.drawable.icon_menu_bestseller_item,false,true))
        itemsList.add(SelectedItemDetails("essence","20$",R.drawable.icon_menu_item_new,R.drawable.icon_menu_bestseller_item,true,false))

        viewManager = LinearLayoutManager(this)
        selected_item_list.layoutManager=viewManager
        selectedMenuAdapter = SelectedMenuAdapter(itemsList)
        selected_item_list.adapter=selectedMenuAdapter


    }
}
