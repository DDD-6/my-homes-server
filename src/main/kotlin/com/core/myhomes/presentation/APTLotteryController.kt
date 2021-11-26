package com.core.myhomes.presentation

import com.core.myhomes.application.APTLotteryService
import com.core.myhomes.domain.APTLotteryInfo
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin(origins = ["*"])
class APTLotteryController(
    private val aptLotteryService: APTLotteryService
) {
    @GetMapping("/lottery/apt")
    fun getAptLotteryInfo(
        @RequestParam startMonth: String,
        @RequestParam endMonth: String,
        @RequestParam(required = false) sido: String?,
        @RequestParam(required = false) page: Int?,
        @RequestParam(required = false) size: Int?,
        @RequestParam(required = false) sort: String?
    ): ResultDTO {
        try {
            return ResultDTO(
                result = true,
                message = "",
                data = aptLotteryService.getAPTLotteryInfoList(startMonth, endMonth, sido, page, size, sort)
            )
        }
        catch(e: IllegalArgumentException) {
            e.printStackTrace()
            return ResultDTO(
                result = true,
                message = "",
                data = emptyList<APTLotteryInfo>()
            )
        }
        catch (e: RuntimeException) {
            e.printStackTrace()
            return ResultDTO(
                result = false,
                message = e.message,
                data = null
            )
        }
    }

}