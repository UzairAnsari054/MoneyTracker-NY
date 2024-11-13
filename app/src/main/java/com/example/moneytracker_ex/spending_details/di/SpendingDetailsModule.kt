package com.example.moneytracker_ex.spending_details.di

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.moneytracker_ex.spending_details.domain.UpsertSpendingUseCase
import com.example.moneytracker_ex.spending_details.presentation.SpendingDetailsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

@RequiresApi(Build.VERSION_CODES.O)
val spendingDetailsModule = module {

    single { UpsertSpendingUseCase(get()) }

    viewModel { SpendingDetailsViewModel(get()) }
}