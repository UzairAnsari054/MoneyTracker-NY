package com.example.moneytracker_ex.core.domain

import java.time.ZonedDateTime

/**
 * @author Ahmed Guedmioui
 */
data class Spending(
    val spendingId: Int?,
    val name: String,
    val price: Double,
    val kilograms: Double,
    val quantity: Double,
    val dateTimeUtc: ZonedDateTime,
    val color : Int = 0
)
