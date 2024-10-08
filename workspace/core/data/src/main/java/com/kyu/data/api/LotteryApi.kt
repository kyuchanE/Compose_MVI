package com.kyu.data.api

import com.kyu.data.dto.LotteryDto
import com.kyu.data.utils.NetworkConfig
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface LotteryApi {

    @GET(NetworkConfig.lotteryGetCommon)
    suspend fun getLotteryNum(
        @Query("method") method: String,
        @Query("drwNo") drwNo: String,
    ): Response<LotteryDto>

}