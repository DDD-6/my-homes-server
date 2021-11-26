package com.core.myhomes.infra

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@XmlRootElement(name = "header")
@XmlAccessorType(XmlAccessType.FIELD)
data class Header(
    val resultCode: String? = null,
    val resultMsg: String? = null
)