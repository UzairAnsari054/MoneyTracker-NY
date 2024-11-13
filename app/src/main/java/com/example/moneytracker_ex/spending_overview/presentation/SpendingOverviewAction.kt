package com.example.moneytracker_ex.spending_overview.presentation

sealed interface SpendingOverviewAction {
    data object LoadSpendingOverviewAndBalance: SpendingOverviewAction
    data class OnDateChange(val newDate: Int): SpendingOverviewAction
    data class OnDeleteSpending(val id: Int): SpendingOverviewAction
}