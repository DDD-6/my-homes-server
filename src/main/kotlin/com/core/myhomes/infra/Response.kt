package com.core.myhomes.infra

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@XmlRootElement(name = "response")
@XmlAccessorType(XmlAccessType.FIELD)
data class Response(
    val body: Body? = null,
    val header: Header? = null
)