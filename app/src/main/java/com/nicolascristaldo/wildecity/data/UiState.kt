package com.nicolascristaldo.wildecity.data

data class UiState(
    val selectedCategory: Category? = null,
    val selectedPlace: Place? = null,
    val placeList: List<Place> = emptyList()
)
