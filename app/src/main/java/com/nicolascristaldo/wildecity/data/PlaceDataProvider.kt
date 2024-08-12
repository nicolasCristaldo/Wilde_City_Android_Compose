package com.nicolascristaldo.wildecity.data

import com.nicolascristaldo.wildecity.R

object PlaceDataProvider {
    val defaultPlace = getPlaces()[0]

    fun getPlaces(): List<Place> {
        return listOf(
            Place(
                nameRes = R.string.cine_1_name,
                imageRes = R.drawable.cine_1,
                descriptionRes = R.string.cine_1_description,
                category = CategoriesDataProvider.cineCategory
            ),
            Place(
                nameRes = R.string.cine_2_name,
                imageRes = R.drawable.cine_2,
                descriptionRes = R.string.cine_2_description,
                category = CategoriesDataProvider.cineCategory
            ),
            Place(
                nameRes = R.string.cine_3_name,
                imageRes = R.drawable.cine_3,
                descriptionRes = R.string.cine_3_description,
                category = CategoriesDataProvider.cineCategory
            ),
            Place(
                nameRes = R.string.centro_comercial_1_name,
                imageRes = R.drawable.centro_comercial_1,
                descriptionRes = R.string.centro_comercial_1_description,
                category = CategoriesDataProvider.centroComercialCategory
            ),
            Place(
                nameRes = R.string.centro_comercial_2_name,
                imageRes = R.drawable.centro_comercial_2,
                descriptionRes = R.string.centro_comercial_2_description,
                category = CategoriesDataProvider.centroComercialCategory
            ),
            Place(
                nameRes = R.string.cafeteria_1_name,
                imageRes = R.drawable.cafeteria_1,
                descriptionRes = R.string.cafeteria_1_description,
                category = CategoriesDataProvider.cafeteriaCategory
            ),
            Place(
                nameRes = R.string.cafeteria_2_name,
                imageRes = R.drawable.cafeteria_2,
                descriptionRes = R.string.cafeteria_2_description,
                category = CategoriesDataProvider.cafeteriaCategory
            ),
            Place(
                nameRes = R.string.cafeteria_3_name,
                imageRes = R.drawable.cafeteria_3,
                descriptionRes = R.string.cafeteria_3_description,
                category = CategoriesDataProvider.cafeteriaCategory
            ),Place(
                nameRes = R.string.heladeria_1_name,
                imageRes = R.drawable.heladeria_1,
                descriptionRes = R.string.heladeria_1_description,
                category = CategoriesDataProvider.heladeriaCategory
            ),
            Place(
                nameRes = R.string.heladeria_2_name,
                imageRes = R.drawable.heladeria_2,
                descriptionRes = R.string.heladeria_2_description,
                category = CategoriesDataProvider.heladeriaCategory
            ),
            Place(
                nameRes = R.string.heladeria_3_name,
                imageRes = R.drawable.heladeria_3,
                descriptionRes = R.string.heladeria_3_description,
                category = CategoriesDataProvider.heladeriaCategory
            ),
            Place(
                nameRes = R.string.plaza_1_name,
                imageRes = R.drawable.plaza_1,
                descriptionRes = R.string.plaza_1_description,
                category = CategoriesDataProvider.plazaCategory
            ),
            Place(
                nameRes = R.string.plaza_2_name,
                imageRes = R.drawable.plaza_2,
                descriptionRes = R.string.plaza_2_description,
                category = CategoriesDataProvider.plazaCategory
            ),
            Place(
                nameRes = R.string.plaza_3_name,
                imageRes = R.drawable.plaza_3,
                descriptionRes = R.string.plaza_3_description,
                category = CategoriesDataProvider.plazaCategory
            ),
            Place(
                nameRes = R.string.plaza_4_name,
                imageRes = R.drawable.plaza_4,
                descriptionRes = R.string.plaza_4_description,
                category = CategoriesDataProvider.plazaCategory
            ),
            Place(
                nameRes = R.string.parque_1_name,
                imageRes = R.drawable.parque_1,
                descriptionRes = R.string.parque_1_description,
                category = CategoriesDataProvider.parqueCategory
            ),
            Place(
                nameRes = R.string.parque_2_name,
                imageRes = R.drawable.parque_2,
                descriptionRes = R.string.parque_2_description,
                category = CategoriesDataProvider.parqueCategory
            ),
            Place(
                nameRes = R.string.parque_3_name,
                imageRes = R.drawable.parque_3,
                descriptionRes = R.string.parque_3_description,
                category = CategoriesDataProvider.parqueCategory
            ),
            Place(
                nameRes = R.string.restaurant_1_name,
                imageRes = R.drawable.restaurant_1,
                descriptionRes = R.string.restaurant_1_description,
                category = CategoriesDataProvider.restaurantCategory
            ),
            Place(
                nameRes = R.string.restaurant_2_name,
                imageRes = R.drawable.restaurant_2,
                descriptionRes = R.string.restaurant_2_description,
                category = CategoriesDataProvider.restaurantCategory
            ),
            Place(
                nameRes = R.string.restaurant_3_name,
                imageRes = R.drawable.restaurant_3,
                descriptionRes = R.string.restaurant_3_description,
                category = CategoriesDataProvider.restaurantCategory
            ),
            Place(
                nameRes = R.string.restaurant_4_name,
                imageRes = R.drawable.restaurant_4,
                descriptionRes = R.string.restaurant_4_description,
                category = CategoriesDataProvider.restaurantCategory
            ),
            Place(
                nameRes = R.string.restaurant_5_name,
                imageRes = R.drawable.restaurant_5,
                descriptionRes = R.string.restaurant_5_description,
                category = CategoriesDataProvider.restaurantCategory
            ),
            Place(
                nameRes = R.string.sitio_historico_1_name,
                imageRes = R.drawable.sitio_historico_1,
                descriptionRes = R.string.sitio_historico_1_description,
                category = CategoriesDataProvider.sitioHistoricoCategory
            ),
            Place(
                nameRes = R.string.sitio_historico_2_name,
                imageRes = R.drawable.sitio_historico_2,
                descriptionRes = R.string.sitio_historico_2_description,
                category = CategoriesDataProvider.sitioHistoricoCategory
            ),
            Place(
                nameRes = R.string.sitio_historico_3_name,
                imageRes = R.drawable.sitio_historico_3,
                descriptionRes = R.string.sitio_historico_3_description,
                category = CategoriesDataProvider.sitioHistoricoCategory
            ),
            Place(
                nameRes = R.string.sitio_historico_4_name,
                imageRes = R.drawable.sitio_historico_4,
                descriptionRes = R.string.sitio_historico_4_description,
                category = CategoriesDataProvider.sitioHistoricoCategory
            ),
        )
    }
}