package com.umtzngn.covid_19sample.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Case(
    @SerializedName("country") @Expose var country:String,
    @SerializedName("totalcases") @Expose var totalcases:String,
    @SerializedName("newCases") @Expose var newCases:String,
    @SerializedName("totaldeaths") @Expose var totaldeaths:String,
    @SerializedName("newDeaths") @Expose var newDeaths:String,
    @SerializedName("totalRecovered") @Expose var totalRecovered:String,
    @SerializedName("activeCases") @Expose var activeCases:String)
    :Serializable
