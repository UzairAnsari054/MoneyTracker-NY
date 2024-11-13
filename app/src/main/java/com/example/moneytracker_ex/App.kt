package com.example.moneytracker_ex

import android.app.Application
import android.os.Build
import androidx.annotation.RequiresApi
import com.example.moneytracker_ex.balance.di.balanceModule
import com.example.moneytracker_ex.core.di.coreModule
import com.example.moneytracker_ex.spending_details.di.spendingDetailsModule
import com.example.moneytracker_ex.spending_overview.di.spendingOverviewModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(
                coreModule,
                balanceModule,
                spendingOverviewModule,
                spendingDetailsModule
            )
        }
    }
}