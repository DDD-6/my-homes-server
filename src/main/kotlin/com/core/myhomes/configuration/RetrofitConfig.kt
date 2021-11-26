package com.core.myhomes.configuration

import com.core.myhomes.infra.APTLotteryInfoRetrofitRepository
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import retrofit2.converter.jaxb.JaxbConverterFactory

@Configuration
class RetrofitConfig {

    @Bean
    fun getOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder().addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)).build()
    }

    @Bean
    fun getAPTLotteryInfoRepository(okHttpClient: OkHttpClient): APTLotteryInfoRetrofitRepository {
        return Retrofit.Builder().baseUrl("https://openapi.reb.or.kr")
            .addConverterFactory(JaxbConverterFactory.create())
            .client(okHttpClient)
            .build()
            .create(APTLotteryInfoRetrofitRepository::class.java)
    }
}