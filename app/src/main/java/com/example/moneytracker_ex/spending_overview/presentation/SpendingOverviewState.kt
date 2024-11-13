package com.example.moneytracker_ex.spending_overview.presentation

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.moneytracker_ex.core.domain.Spending
import java.time.ZonedDateTime

@RequiresApi(Build.VERSION_CODES.O)
data class SpendingOverviewState(
    val spendingList: List<Spending> = emptyList(),
    val dateList: List<ZonedDateTime> = emptyList(),
    val balance: Double = 0.0,
    val pickedDate: ZonedDateTime = ZonedDateTime.now(),
    val isDropDownMenuVisible: Boolean = false
)
