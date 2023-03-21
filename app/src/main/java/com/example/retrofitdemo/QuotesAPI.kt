package com.example.retrofitdemo

import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface QuotesAPI {

    @GET("/quotes")
    suspend fun getQuotes(@Query("page") page: Int) : Response<QuoteList>

    // BASE_URL + "/quotes?page=1"
}