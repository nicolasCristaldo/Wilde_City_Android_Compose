package com.nicolascristaldo.wildecity.data

data class UiState(
    val selectedCategory: Category = CategoriesDataProvider.heladeriaCategory,
    val selectedPlace: Place = PlaceDataProvider.getPlaces()[0],
    val placeList: List<Place> = emptyList()
)
