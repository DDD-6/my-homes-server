package com.core.myhomes.application

import com.core.myhomes.domain.APTLotteryInfo
import com.core.myhomes.domain.APTLotteryInfoRepository
import org.springframework.stereotype.Service

@Service
class APTLotteryService(
    private val aptLotteryInfoRepository: APTLotteryInfoRepository
) {
    fun getAPTLotteryInfoList(
        startMonth: String,
        endMonth: String,
        sido: String?,
        page: Int?,
        size: Int?,
        sort: String?
    ): List<APTLotteryInfo> {
        return aptLotteryInfoRepository.getAPTLotteryInfo(
            startDate = startMonth,
            endDate = endMonth,
            sido = sido,
            page = if(page == null || page < 1) 1 else page,
            pageSize = if(size == null ||size < 1) 10 else size,
            sort = sort ?: "asc"
        )
    }
}