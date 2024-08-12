package com.nicolascristaldo.wildecity.data

import androidx.annotation.StringRes
import com.nicolascristaldo.wildecity.R

enum class WildeCityScreen(@StringRes val title: Int) {
    Start(title = R.string.app_name),
    PlaceList(title = R.string.place_list),
    PlaceDetails(title = R.string.place_details)
}