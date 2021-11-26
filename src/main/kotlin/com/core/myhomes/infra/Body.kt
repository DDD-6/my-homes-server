package com.core.myhomes.infra

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@XmlRootElement(name = "body")
@XmlAccessorType(XmlAccessType.FIELD)
data class Body(
    val items: Items? = null,
    val numOfRows: String? = null,
    val pageNo: String? = null,
    val totalCount: String? = null
)