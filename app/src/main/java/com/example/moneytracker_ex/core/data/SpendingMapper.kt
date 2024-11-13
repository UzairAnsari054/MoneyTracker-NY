package com.example.moneytracker_ex.core.data

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.moneytracker_ex.core.data.local.SpendingEntity
import com.example.moneytracker_ex.core.domain.Spending
import java.time.Instant
import java.time.ZoneId

/**
 * @author Ahmed Guedmioui
 */

@RequiresApi(Build.VERSION_CODES.O)
fun SpendingEntity.toSpending(): Spending = Spending(
    spendingId = spendingId ?: 0,
    name = name,
    price = price,
    kilograms = kilograms,
    quantity = quantity,
    dateTimeUtc = Instant.parse(dateTimeUtc).atZone(ZoneId.of("UTC"))
)

@RequiresApi(Build.VERSION_CODES.O)
fun Spending.toNewSpendingEntity(): SpendingEntity = SpendingEntity(
    name = name,
    price = price,
    kilograms = kilograms,
    quantity = quantity,
    dateTimeUtc = dateTimeUtc.toInstant().toString()
)

@RequiresApi(Build.VERSION_CODES.O)
fun Spending.toEditedSpendingEntity(): SpendingEntity = SpendingEntity(
    spendingId = spendingId,
    name = name,
    price = price,
    kilograms = kilograms,
    quantity = quantity,
    dateTimeUtc = dateTimeUtc.toInstant().toString()
)
