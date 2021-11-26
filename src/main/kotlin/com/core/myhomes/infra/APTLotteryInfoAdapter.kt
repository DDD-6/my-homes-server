package com.core.myhomes.infra

import com.core.myhomes.domain.APTLotteryInfo
import com.core.myhomes.domain.APTLotteryInfoRepository
import org.springframework.stereotype.Component
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@Component
class APTLotteryInfoAdapter(
    private val aptLotteryInfoRetrofitRepository: APTLotteryInfoRetrofitRepository
) : APTLotteryInfoRepository {
    override fun getAPTLotteryInfo(startDate: String, endDate: String, sido: String?, page: Int, pageSize: Int, sort: String?): List<APTLotteryInfo> {
        var totalList = aptLotteryInfoRetrofitRepository.getAPTLotteryList(
            startMonth = startDate,
            endMonth = endDate,
            sido = sido ?: "").execute().body()?.body?.items?.item?.map {
            it.mapTo()
        } ?: listOf()
        if(sort == "asc") totalList = totalList.reversed()
        val toIndex = (pageSize * page - 1).coerceAtMost(totalList.size)
        return totalList.subList(pageSize * (page - 1), toIndex)
    }

}

fun Item.mapTo(): APTLotteryInfo {
    return APTLotteryInfo(
        constructionCompanyName = bsnsMbyNm,
        houseClassification = houseDtlSecdNm,
        houseManageNumber = houseManageNo,
        houseName = houseNm,
        noticeNumber = pblancNo,
        winnerAnnounceDate = przwnerPresnatnDe,
        lotteryStartDate = rceptBgnde,
        lotteryEndDate = rceptEndde,
        lotteryAnnounceDate = LocalDate.parse(rcritPblancDe, DateTimeFormatter.ofPattern("yyyyMMdd")),
        rentClassification = rentSecdNm,
        sido = sido
    )
}