package com.seventhheaven.usertap.UI.Activities

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.seventhheaven.usertap.R

class GalleryAdpater(val menuList_Frag:ArrayList<GalleryDetails>): RecyclerView.Adapter<GalleryAdpater.GalleryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder {
        val galAdapter_nav_itemView:View=LayoutInflater.from(parent.context).inflate(R.layout.gallery_nav,parent,false)
        return GalleryViewHolder(galAdapter_nav_itemView)
    }

    override fun getItemCount(): Int {
        return menuList_Frag.size
    }

    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        val currentItem=menuList_Frag[position]
       // holder.galleryAdapter_ordernow.text=currentItem.orderNow
        // holder.galleryAdapter_share.text=currentItem.share
        holder.galleryAdapter_icon.setImageResource(currentItem.galleryIcon!!)
    }

    class GalleryViewHolder(menuView:View):RecyclerView.ViewHolder(menuView){
        val galleryAdapter_icon:ImageView=menuView.findViewById(R.id.gallery_nav_icon)
        val galleryAdapter_ordernow:TextView=menuView.findViewById(R.id.gallery_nav_ordernow)
        val galleryAdapter_share:TextView=menuView.findViewById(R.id.gallery_nav_Share)


    }
}