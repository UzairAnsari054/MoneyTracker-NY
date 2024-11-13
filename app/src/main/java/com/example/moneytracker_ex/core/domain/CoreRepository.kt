package com.example.moneytracker_ex.core.domain

/**
 * @author Ahmed Guedmioui
 */
interface CoreRepository {
    suspend fun updateBalance(balance: Double)
    suspend fun getBalance(): Double
}