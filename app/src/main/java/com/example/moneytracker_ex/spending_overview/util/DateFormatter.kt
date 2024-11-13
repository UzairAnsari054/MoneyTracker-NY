package com.example.moneytracker_ex.spending_overview.util

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.ZonedDateTime

@RequiresApi(Build.VERSION_CODES.O)
fun ZonedDateTime.formatDate(): String {
    return "$dayOfMonth-$monthValue-$year"
}