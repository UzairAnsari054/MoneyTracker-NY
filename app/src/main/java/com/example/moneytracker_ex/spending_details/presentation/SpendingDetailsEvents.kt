package com.example.moneytracker_ex.spending_details.presentation

sealed interface SpendingDetailsEvents {
    data object SaveSuccess: SpendingDetailsEvents
    data object SaveFailed: SpendingDetailsEvents
}