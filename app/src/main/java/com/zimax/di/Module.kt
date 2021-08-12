package com.zimax

import com.zimax.data.api.CurrencyRepository
import com.zimax.presentation.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val appModule = module {

    // single instance of HelloRepository
    single<CurrencyRepository> { CurrencyRepository() }

    viewModel { MainViewModel(currencyRepository = get()) }

    // Simple Presenter Factory
    //factory { MySimplePresenter(get()) }
}