package com.nicolascristaldo.wildecity.ui

import androidx.lifecycle.ViewModel
import com.nicolascristaldo.wildecity.data.Category
import com.nicolascristaldo.wildecity.data.Place
import com.nicolascristaldo.wildecity.data.PlaceDataProvider
import com.nicolascristaldo.wildecity.data.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class AppViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(UiState())
    val uiState: StateFlow<UiState> = _uiState

    fun updateCategory(category: Category) {
        _uiState.update {
            it.copy(
                selectedCategory = category,
                placeList = PlaceDataProvider.getPlaces().filter { place ->
                    place.category.id == category.id
                }
            )
        }
    }

    fun updatePlace(place: Place) {
        _uiState.update {
            it.copy(
                selectedPlace = place
            )
        }
    }
}