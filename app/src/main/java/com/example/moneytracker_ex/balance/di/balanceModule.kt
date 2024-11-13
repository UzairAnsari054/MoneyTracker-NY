package com.example.moneytracker_ex.balance.di

import com.example.moneytracker_ex.balance.presentation.BalanceViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val balanceModule = module {
    viewModel { BalanceViewModel(get()) }
}