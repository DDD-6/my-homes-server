package com.core.myhomes.presentation

import com.fasterxml.jackson.annotation.JsonInclude

data class ResultDTO(
    var result: Boolean? = null,
    var message: String? = null,
    @JsonInclude(JsonInclude.Include.NON_NULL) var data: Any? = null
)
