package com.seventhheaven.usertap.UI.Activities


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.seventhheaven.usertap.R
import kotlinx.android.synthetic.main.fragment_offers_blank.*

/**
 * A simple [Fragment] subclass.
 */
class OffersBlankFragment : Fragment() {
    private var offersList:ArrayList<OffersDetails>?=null
    private var offerAdapter:RecyclerView.Adapter<OffersAdapter.OffersViewholder>?=null
    private var offersView:View?=null

    private lateinit var layoutManager:RecyclerView.LayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         offersView=inflater.inflate(R.layout.fragment_offers_blank, container, false)
        return offersView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        offersList=ArrayList<OffersDetails>()
        offersList?.add(OffersDetails(R.drawable.baseline_local_phone_black_36dp,"blah1","blah2","blah3","blah4"))
        offersList?.add(OffersDetails(R.drawable.baseline_collections_black_36dp,"blah1","blah2","blah3","blah4"))
        offersList?.add(OffersDetails(R.drawable.baseline_home_black_36dp,"blah1","blah2","blah3","blah4"))
        offersList?.add(OffersDetails(R.drawable.baseline_notifications_black_36dp,"blah1","blah2","blah3","blah4"))
        offersList?.add(OffersDetails(R.drawable.baseline_perm_identity_black_36dp,"blah1","blah2","blah3","blah4"))
        offersList?.add(OffersDetails(R.drawable.baseline_card_giftcard_black_36dp,"blah1","blah2","blah3","blah4"))
        offersList?.add(OffersDetails(R.drawable.ic_launcher_background,"blah1","blah2","blah3","blah4"))

        layoutManager=LinearLayoutManager(requireActivity())
        nav_fragLayout_rv.layoutManager=layoutManager

        offerAdapter= OffersAdapter(offersList!!)
        nav_fragLayout_rv.adapter=offerAdapter


    }
}
