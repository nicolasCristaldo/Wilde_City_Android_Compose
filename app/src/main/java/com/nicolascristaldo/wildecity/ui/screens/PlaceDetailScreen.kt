package com.nicolascristaldo.wildecity.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
        modifier = Modifier
            .padding(horizontal = dimensionResource(id = R.dimen.padding_small))
            .fillMaxSize()
    ) {
        PlaceImage(
            place = place,
            modifier = Modifier
        )

        Text(
            text = stringResource(id = place.nameRes),
            modifier = Modifier
                .padding(top = dimensionResource(id = R.dimen.padding_medium))
        )


        Text(
            buildAnnotatedString {
                append(stringResource(id = R.string.string_category))
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                    append(" " + stringResource(id = place.category.nameRes))
                }
            }
        )

        Text(text = stringResource(id = place.descriptionRes))
    }
}

@Composable
fun PlaceImage(
    place: Place,
    modifier: Modifier
) {
    Box(
        modifier = Modifier
            .height(270.dp)
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