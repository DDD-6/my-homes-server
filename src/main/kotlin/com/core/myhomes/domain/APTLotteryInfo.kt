package com.core.myhomes.domain

import java.time.LocalDate

data class APTLotteryInfo(
    val constructionCompanyName: String?, // 건설업체
    val houseClassification: String?,     // 주택구분 (민영/국민)
    val houseManageNumber: String?,       // 주택관리번호
    val houseName: String?,               // 주택명
    val noticeNumber: String?,            // 공고번호
    val winnerAnnounceDate: String?,      // 당첨자발표일(yyyy-MM-dd)
    val lotteryStartDate: String?,        // 청약접수시작일(yyyy-MM-dd)
    val lotteryEndDate: String?,          // 청약접수종료일(yyyy-MM-dd)
    val lotteryAnnounceDate: LocalDate?,  // 모집공고일(yyyyMMdd)
    val rentClassification: String?,      // 분양/임대 구분값
    val sido: String?                     // 공급지역
)
