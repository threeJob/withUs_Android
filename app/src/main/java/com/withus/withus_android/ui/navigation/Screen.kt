package com.withus.withus_android.ui.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Search
import androidx.compose.ui.graphics.vector.ImageVector
import com.withus.withus_android.R

sealed class Screen(
    val route: String,
    @StringRes val resourceId: Int,
    val iconImageVector: ImageVector,
    val iconSelectedImageVector: ImageVector
) {
    object Home : Screen("home", R.string.main_screen, Icons.Outlined.Home, Icons.Filled.Home)
    object Search : Screen("search", R.string.search_screen, Icons.Outlined.Search, Icons.Outlined.Search)
    object Calendar : Screen("calendar", R.string.calendar_screen, Icons.Filled.DateRange, Icons.Filled.DateRange)
//    object FriendsList : Screen("friendslist", R.string.friends_list)
}