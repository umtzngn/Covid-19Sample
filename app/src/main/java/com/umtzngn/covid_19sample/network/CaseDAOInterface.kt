package com.umtzngn.covid_19sample.network

import com.umtzngn.covid_19sample.response.CaseResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface CaseDAOInterface {

    @GET("countriesData")
    @Headers("authorization: apikey 722dofkTMzKimMo6YjoMGK:0pRU0MoX0HITEcEa3s0Q3L","content-type: application/json")
    fun  getCase() : Call<CaseResponse>
}