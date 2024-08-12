package com.nicolascristaldo.wildecity.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nicolascristaldo.wildecity.R
import com.nicolascristaldo.wildecity.data.CategoriesDataProvider
import com.nicolascristaldo.wildecity.data.ListItem
import com.nicolascristaldo.wildecity.data.PlaceDataProvider
import com.nicolascristaldo.wildecity.ui.theme.WildeCityTheme

@Composable
fun StartScreen() {

}

@Composable
fun ItemList(
    listItems: List<ListItem>,
    onClick: (ListItem) -> Unit,
    contentPadding: PaddingValues = PaddingValues(0.dp),
    modifier: Modifier = Modifier
) {
    LazyColumn(
        contentPadding = contentPadding,
        verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_medium)),
        modifier = modifier.padding(top = dimensionResource(R.dimen.padding_medium))
    ) {
        items(listItems) { item ->
            ListItemCard(
                item = item,
                onItemClick = onClick
            )
        }
    }
}

@Composable
fun ListItemCard(
    item: ListItem,
    onItemClick: (ListItem) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        elevation = CardDefaults.cardElevation(),
        onClick = { onItemClick }
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(id = R.dimen.padding_small))
        ) {
            ItemImage(item = item)

            Text(
                text = stringResource(id = item.nameRes),
                modifier = Modifier
                    .padding(start = dimensionResource(id = R.dimen.padding_large))
            )
        }
    }
}

@Composable
fun ItemImage(
    item: ListItem,
    modifier: Modifier = Modifier
) {
    Box(modifier = Modifier) {
        Image(
            painter = painterResource(id = item.iconRes),
            contentDescription = stringResource(id = item.nameRes),
            modifier = Modifier
                .size(dimensionResource(id = R.dimen.image_size))
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ListCardPreview() {
    WildeCityTheme {
        ListItemCard(item = CategoriesDataProvider.restaurantCategory, onItemClick = {})
    }
}

@Preview(showBackground = true)
@Composable
fun ListPreview() {
    WildeCityTheme {
        ItemList(listItems = CategoriesDataProvider.getCategories(), onClick = {})
    }
}

@Preview(showBackground = true)
@Composable
fun ListPlacePreview() {
    val restos = PlaceDataProvider.getPlaces().filter { it.category.id == 1 }
    WildeCityTheme {
        ItemList(listItems = restos, onClick = {})
    }
}