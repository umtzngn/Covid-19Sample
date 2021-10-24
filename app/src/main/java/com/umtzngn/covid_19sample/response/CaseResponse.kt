package com.umtzngn.covid_19sample.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.umtzngn.covid_19sample.model.Case

data class CaseResponse(
    @SerializedName("result")
    @Expose var cases : List<Case>,
    @SerializedName("success")
    @Expose var success : Boolean

)
