package com.example.moneytracker_ex.spending_overview.di

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.moneytracker_ex.spending_overview.presentation.SpendingOverviewViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

@RequiresApi(Build.VERSION_CODES.O)
val spendingOverviewModule = module {
    viewModel { SpendingOverviewViewModel(get(), get()) }
}