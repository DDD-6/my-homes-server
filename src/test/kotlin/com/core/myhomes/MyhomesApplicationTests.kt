package com.core.myhomes

import com.core.myhomes.infra.APTLotteryInfoRetrofitRepository
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest
class MyhomesApplicationTests {

	@Autowired
	lateinit var aptLotteryInfoRepository: APTLotteryInfoRetrofitRepository

	@Test
	fun contextLoads() {
		println("!@#!#!$%!#$%^!#$^!#$%!#$%!#$%!#$%!#$%!#$%!#$%")
		println(
			aptLotteryInfoRepository.getAPTLotteryList(
				startMonth = "202110",
				endMonth = "202110"
			).execute().body()
		)
	}

}
