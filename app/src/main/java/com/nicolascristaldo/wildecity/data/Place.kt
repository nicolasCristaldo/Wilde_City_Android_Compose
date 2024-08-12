package com.nicolascristaldo.wildecity.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Place(
    val category: Category,
    @StringRes override val nameRes: Int,
    @DrawableRes override val iconRes: Int = category.iconRes,
    @DrawableRes val imageRes: Int,
    @StringRes val descriptionRes: Int
): ListItem
