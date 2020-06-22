package com.seventhheaven.usertap.UI.Activities

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.seventhheaven.usertap.R
import kotlinx.android.synthetic.main.offers_nav_items.view.*

class OffersAdapter (val offersList:ArrayList<OffersDetails>):RecyclerView.Adapter<OffersAdapter.OffersViewholder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OffersViewholder {
        val itemView:View= LayoutInflater.from(parent.context).inflate(R.layout.offers_nav_items,parent,false)
        return OffersViewholder(itemView)
    }

    override fun getItemCount(): Int {
        return offersList.size
    }

    override fun onBindViewHolder(holder: OffersViewholder, position: Int) {
        val currentItem=offersList[position]
        holder.itemView.offers_nav_items_image.setImageResource(currentItem.offers_image!!)
        holder.itemView.offers_nav_items_offername.text=currentItem.offerName
        holder.itemView.offers_nav_items_offerValidity.text=currentItem.offerValidation
        holder.itemView.offers_nav_items_coupnValidation.text=currentItem.offerValidation
        holder.itemView.nav_offerslayout_offerDetails.text=currentItem.offerDetails
        holder.itemView.offers_nav_items_coponCode.text=currentItem.offerCode

    }
    class OffersViewholder(itemView: View): RecyclerView.ViewHolder(itemView)

}