package com.core.myhomes.domain

interface APTLotteryInfoRepository {
    fun getAPTLotteryInfo(
        startDate: String,
        endDate: String,
        sido: String?,
        page: Int,
        pageSize: Int,
        sort: String?
    ) : List<APTLotteryInfo>
}