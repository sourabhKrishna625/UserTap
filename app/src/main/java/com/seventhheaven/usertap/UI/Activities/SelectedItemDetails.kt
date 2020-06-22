package com.seventhheaven.usertap.UI.Activities

import android.widget.ImageView
import android.widget.TextView

class SelectedItemDetails {
     var ItemName:String?=null
     var Price:String?=null
     var NewStamp:Int?=null
     var BestBuyStamp:Int?=null
     var newStampFlag:Boolean?=null
     var bestStampFLag:Boolean?=null

    constructor(
        ItemName: String?,
        Price: String?,
        NewStamp: Int?,
        BestBuyStamp: Int?,
        newStampFlag: Boolean?,
        bestStampFLag: Boolean?
    ) {
        this.ItemName = ItemName
        this.Price = Price
        this.NewStamp = NewStamp
        this.BestBuyStamp = BestBuyStamp
        this.newStampFlag = newStampFlag
        this.bestStampFLag = bestStampFLag
    }
}