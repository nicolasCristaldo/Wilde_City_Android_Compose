package com.nicolascristaldo.wildecity.data

import com.nicolascristaldo.wildecity.R

object CategoriesDataProvider {
    val restaurantCategory = getCategories()[0]
    val cafeteriaCategory = getCategories()[1]
    val heladeriaCategory = getCategories()[2]
    val sitioHistoricoCategory = getCategories()[3]
    val parqueCategory = getCategories()[4]
    val centroComercialCategory = getCategories()[5]
    val cineCategory = getCategories()[6]
    val plazaCategory = getCategories()[7]

    fun getCategories(): List<Category> {
        return listOf(
            Category(
                id = 1,
                nameRes = R.string.category_restaurant,
                iconRes = R.drawable.ic_restaurant
            ),
            Category(
                id = 2,
                nameRes = R.string.category_cafeteria,
                iconRes = R.drawable.ic_cafeteria
            ),
            Category(
                id = 3,
                nameRes = R.string.category_heladeria,
                iconRes = R.drawable.ic_heladeria
            ),
            Category(
                id = 4,
                nameRes = R.string.category_sitio_historico,
                iconRes = R.drawable.ic_sitio_historico
            ),
            Category(
                id = 5,
                nameRes = R.string.category_parque,
                iconRes = R.drawable.ic_parque
            ),
            Category(
                id = 6,
                nameRes = R.string.category_centro_comercial,
                iconRes = R.drawable.ic_centro_comercial
            ),
            Category(
                id = 7,
                nameRes = R.string.category_cine,
                iconRes = R.drawable.ic_cine
            ),
            Category(
                id = 8,
                nameRes = R.string.category_plaza,
                iconRes = R.drawable.ic_plaza
            )
        )
    }
}