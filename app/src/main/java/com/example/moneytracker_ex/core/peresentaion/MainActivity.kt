package com.example.moneytracker_ex.core.peresentaion

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ag_apps.spending_tracker.core.peresentaion.util.Background
import com.ag_apps.spending_tracker.core.peresentaion.util.Screen
import com.example.moneytracker_ex.spending_overview.presentation.SpendingOverviewScreenCore
import com.example.moneytracker_ex.balance.presentation.BalanceScreenCore
import com.example.moneytracker_ex.core.peresentaion.ui.theme.MoneyTrackerEX
import com.example.moneytracker_ex.spending_details.presentation.SpendingDetailsScreenCore

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MoneyTrackerEX {
                Navigation(modifier = Modifier.fillMaxSize())
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    @Composable
    fun Navigation(modifier: Modifier = Modifier) {
        val navController = rememberNavController()

        Background()

        NavHost(
            modifier = modifier,
            navController = navController,
            startDestination = Screen.SpendingOverview
        ) {

            composable<Screen.SpendingOverview> {
                SpendingOverviewScreenCore(
                    onBalanceClick = {
                        navController.navigate(Screen.Balance)
                    },
                    onAddSpendingClick = {
                        navController.navigate(Screen.SpendingDetails(-1))
                    }
                )
            }

            composable<Screen.SpendingDetails> {
                SpendingDetailsScreenCore(
                    onSaveSpending = {
                        navController.popBackStack()
                    }
                )
            }

            composable<Screen.Balance> {
                BalanceScreenCore(
                    onSaveClick = {
                        navController.popBackStack()
                    }
                )
            }

        }
    }

}
