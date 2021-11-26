package com.core.myhomes.infra

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@XmlRootElement(name = "items")
@XmlAccessorType(XmlAccessType.FIELD)
data class Items(
    val item: List<Item> = arrayListOf()
)