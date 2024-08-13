package com.nicolascristaldo.wildecity.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.nicolascristaldo.wildecity.R
import com.nicolascristaldo.wildecity.data.Place
import com.nicolascristaldo.wildecity.data.PlaceDataProvider
import com.nicolascristaldo.wildecity.ui.theme.WildeCityTheme

@Composable
fun PlaceDetailScreen(
    place: Place,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(horizontal = dimensionResource(id = R.dimen.padding_small))
            .fillMaxSize()
    ) {
        PlaceImage(
            place = place,
            modifier = Modifier
        )

        Text(
            color = MaterialTheme.colorScheme.primary,
            text = stringResource(id = place.nameRes),
            style = MaterialTheme.typography.displayMedium,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = dimensionResource(id = R.dimen.padding_medium))
        )

        Text(
            text = stringResource(id = R.string.string_category) +
                    " " + stringResource(id = place.category.nameRes),
            style = MaterialTheme.typography.bodyMedium
        )

        Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.padding_medium)))

        Text(
            text = stringResource(id = place.descriptionRes),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Composable
fun PlaceImage(
    place: Place,
    modifier: Modifier
) {
    Box(
        modifier = Modifier
            .height(dimensionResource(id = R.dimen.image_size))
    ) {
        Image(
            painter = painterResource(id = place.imageRes),
            contentScale = ContentScale.Crop,
            contentDescription = null
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PlaceScreenPreview() {
    WildeCityTheme {
        PlaceDetailScreen(place = PlaceDataProvider.getPlaces().get(0))
    }
}

@Preview(showBackground = true)
@Composable
fun PlaceScreenPreview2() {
    WildeCityTheme {
        PlaceDetailScreen(place = PlaceDataProvider.getPlaces().get(16))
    }
}