package com.nicolascristaldo.wildecity.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

interface ListItem {
    @get:StringRes
    val nameRes: Int

    @get:DrawableRes
    val iconRes: Int
}