package com.example.qu

import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.POST

interface Quoteapi {
    @GET("random")
    suspend fun getRandomQuote() : retrofit2.Response<List<QuoteModel>>


}