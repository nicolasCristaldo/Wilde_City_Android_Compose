package com.nicolascristaldo.wildecity.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Category(
    val id: Int,
    @StringRes override val nameRes: Int,
    @DrawableRes override val iconRes: Int
): ListItem
