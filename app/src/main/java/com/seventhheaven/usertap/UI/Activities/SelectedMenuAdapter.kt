package com.seventhheaven.usertap.UI.Activities

import android.content.Context
import android.opengl.Visibility
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.recyclerview.widget.RecyclerView
import com.seventhheaven.usertap.R
import kotlinx.android.synthetic.main.selecte_menu_list_item.view.*
import java.util.*
import kotlin.collections.ArrayList

class SelectedMenuAdapter(val itemList:ArrayList<SelectedItemDetails>): RecyclerView.Adapter<SelectedMenuAdapter.MyViewHolder>() {
     var constraintSet:ConstraintSet= ConstraintSet()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView:View=LayoutInflater.from(parent.context).inflate(R.layout.selecte_menu_list_item,parent,false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem=itemList[position]

        holder.itemName.text=currentItem.ItemName
        holder.itemPrice.text=currentItem.Price
        if (currentItem.newStampFlag==true && currentItem.bestStampFLag==true){
            holder.newItem.setImageResource(currentItem.NewStamp!!)
            holder.bestItem.visibility=View.GONE
            constraintSet.clone(holder.cLayout)
            constraintSet.setHorizontalBias(R.id.BestSeller,0.0F)
        }
        else if (currentItem.newStampFlag==true && currentItem.bestStampFLag==false){
            holder.newItem.setImageResource(currentItem.NewStamp!!)
            holder.bestItem.visibility=View.GONE
            constraintSet.clone(holder.cLayout)
            constraintSet.setHorizontalBias(R.id.BestSeller,0.0F)
        }else if (currentItem.newStampFlag==false && currentItem.bestStampFLag==true){
            holder.bestItem.setImageResource(currentItem.NewStamp!!)
            holder.newItem.visibility=View.GONE
            constraintSet.clone(holder.cLayout)
            constraintSet.setHorizontalBias(R.id.NewItem,0.0F)
        }else{
            holder.bestItem.visibility=View.GONE
            constraintSet.clone(holder.cLayout)
            constraintSet.setHorizontalBias(R.id.BestSeller,0.0F)
            holder.newItem.visibility=View.GONE
            constraintSet.clone(holder.cLayout)
            constraintSet.setHorizontalBias(R.id.NewItem,0.0F)
        }

    }


    class MyViewHolder(itemView:View): RecyclerView.ViewHolder (itemView) {
        val itemName:TextView=itemView.findViewById(R.id.item_name)
        val itemPrice:TextView=itemView.findViewById(R.id.item_price)
        val newItem:ImageView=itemView.findViewById(R.id.NewItem)
        val bestItem:ImageView=itemView.findViewById(R.id.BestSeller)
        val cLayout: ConstraintLayout =itemView.findViewById<ConstraintLayout>(R.id.menu_item_layout)


    }
}