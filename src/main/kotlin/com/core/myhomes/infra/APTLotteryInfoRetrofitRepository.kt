package com.core.myhomes.infra

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface APTLotteryInfoRetrofitRepository {
    @GET("/OpenAPI_ToolInstallPackage/service/rest/ApplyhomeInfoSvc/getLttotPblancList")
    fun getAPTLotteryList(
        @Query("serviceKey", encoded = true) serviceKey: String
        = "%2BwvPpNobnpO%2BxNDsB3NdwZqjZYg4C8JqEy7NhZxXof%2F2Owy9Vu2eYP1pZVtIw%2FcPEVTx8nKQ1ph%2F4ppRNxKBLA%3D%3D",
        @Query("startmonth") startMonth: String,
        @Query("endmonth") endMonth: String,
        @Query("sido") sido: String,
        @Query("pageNo") page: Int = 1,
        @Query("numOfRows") pageSize: Int = 100
    ): Call<Response>
}