package com.metehanbolat.di

import com.metehanbolat.repository.HeroRepository
import com.metehanbolat.repository.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}