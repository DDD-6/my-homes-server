package com.core.myhomes.infra

import java.time.LocalDate
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@XmlRootElement(name = "item")
@XmlAccessorType(XmlAccessType.FIELD)
data class Item(
    val bsnsMbyNm: String? = null ,         // 건설업체
    val houseDtlSecdNm: String? = null ,    // 주택구분 (민영/국민)
    val houseManageNo: String? = null ,     // 주택관리번호
    val houseNm: String? = null ,           // 주택명
    val pblancNo: String? = null ,          // 공고번호
    val przwnerPresnatnDe: String? = null , // 당첨자발표일(yyyy-MM-dd)
    val rceptBgnde: String? = null ,        // 청약접수시작일(yyyy-MM-dd)
    val rceptEndde: String? = null ,        // 청약접수종료일(yyyy-MM-dd)
    val rcritPblancDe: String? = null ,     // 모집공고일(yyyyMMdd)
    val rentSecdNm: String? = null ,        // 분양/임대 구분값
    val sido: String? = null                // 공급지역
)