package com.seventhheaven.usertap.UI.Activities


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.seventhheaven.usertap.R
import kotlinx.android.synthetic.main.fragment_gallery_blank.*

/**
 * A simple [Fragment] subclass.
 */
class GalleryBlankFragment : Fragment() {
    private var galFragment_list:ArrayList<GalleryDetails>?=null
    private var galleryAdapter:GalleryAdpater?=null
    private var gallery_view:View?=null

   // private lateinit var galleryAdpater:RecyclerView.Adapter<GalleryAdpater.GalleryViewHolder>
    private lateinit var viewManager: RecyclerView.LayoutManager
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        gallery_view=inflater.inflate(R.layout.fragment_gallery_blank, container, false)
        return gallery_view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        galFragment_list= ArrayList()

        galFragment_list?.add(GalleryDetails(R.drawable.baseline_home_black_36dp))
        galFragment_list?.add(GalleryDetails(R.drawable.baseline_card_giftcard_black_36dp))
        galFragment_list?.add(GalleryDetails(R.drawable.baseline_collections_black_36dp))
        galFragment_list?.add(GalleryDetails(R.drawable.baseline_local_phone_black_36dp))
        galFragment_list?.add(GalleryDetails(R.drawable.baseline_perm_identity_black_18dp))

        viewManager=GridLayoutManager(requireActivity(),2)
        nav_galleryView.layoutManager=viewManager
        galleryAdapter= GalleryAdpater(galFragment_list!!)
        nav_galleryView.adapter=galleryAdapter


    }
}
