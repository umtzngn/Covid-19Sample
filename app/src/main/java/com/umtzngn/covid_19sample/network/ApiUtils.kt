package com.umtzngn.covid_19sample.network

import retrofit2.create

class ApiUtils {
    companion object{
        private  const val BASE_URL = "https://api.collectapi.com/corona/"

        fun caseDAOInterfaceGetir() : CaseDAOInterface {
            return RetrofitClient.getClient(BASE_URL).create(CaseDAOInterface :: class.java)
        }

    }
}