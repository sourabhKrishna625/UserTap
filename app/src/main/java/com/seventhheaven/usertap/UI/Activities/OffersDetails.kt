package com.seventhheaven.usertap.UI.Activities

class OffersDetails {
    var offers_image:Int?=null
    var offerName:String?=null
    var offerValidation:String?=null
    var offerDetails:String?=null
    var offerCode:String?=null

    constructor(
        offers_image: Int?,
        offerName: String?,
        offerValidation: String?,
        offerDetails: String?,
        offerCode: String?
    ) {
        this.offers_image = offers_image
        this.offerName = offerName
        this.offerValidation = offerValidation
        this.offerDetails = offerDetails
        this.offerCode = offerCode
    }
}