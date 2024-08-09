package com.example.instaflix

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
fun HomeScreen(modifier: Modifier, homeUIState: HomeUIState) {
    LazyColumn(
        modifier = modifier.background(Color.Black)
    ) {
        item {
            Header(
                modifier = Modifier
                    .fillMaxHeight(0.3f)
                    .fillMaxWidth(),
                principalMovie = homeUIState.principalMovie
            )
        }
        item {
            Spacer(modifier = Modifier.height(16.dp))
        }
        items(homeUIState.categories) { category ->
            CategoryItem(modifier = Modifier.padding(8.dp), category = category)
        }
    }
}


@Composable
fun Header(modifier: Modifier, principalMovie: MovieUIEntity) {
    Box(
        modifier = modifier
            .fillMaxHeight(0.9f)
    ) {
        AsyncImage(
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop,
            model = principalMovie.imageUrl,
            contentDescription = principalMovie.title
        )
        Box(
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .background(
                    Brush.verticalGradient(
                        0F to Color.Transparent,
                        .5F to Color.Black.copy(alpha = 0.5F),
                        1F to Color.Black
                    )
                )
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                modifier = Modifier.size(46.dp),
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = null
            )
            Text(color = Color.White, text = "TV Shows")
            Text(color = Color.White, text = "Movies")
            Text(color = Color.White, text = "Info")
        }
        Column(
            modifier = Modifier
                .fillMaxHeight(0.3f)
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            //.background(Color.Green),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                fontSize = 35.sp,
                color = Color.White,
                text = principalMovie.title,
                fontWeight = FontWeight.Bold
            )
            Text(
                modifier = Modifier.padding(16.dp),
                color = Color.White,
                text = "TV Shows · US",
                fontWeight = FontWeight.Bold
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.Check,
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                    Text(color = Color.White, text = "My List")
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .clip(RoundedCornerShape(12.dp))
                        .background(Color.White)
                        .padding(12.dp)

                ) {
                    Icon(
                        imageVector = Icons.Default.PlayArrow,
                        contentDescription = null,
                        tint = Color.Black
                    )
                    Text(text = "Play", color = Color.Black)
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        imageVector = Icons.Default.Info,
                        contentDescription = null,
                        tint = Color.White
                    )
                    Text(color = Color.White, text = "My List")
                }
            }
        }
    }
}

@Composable
fun CategoryItem(modifier: Modifier = Modifier, category: MoviesCategory) {
    Column(modifier = modifier) {
        Text(color = Color.White, text = category.categoryTitle)
        LazyRow {
            items(category.moviesList) {
                AsyncImage(
                    modifier = Modifier
                        .height(180.dp)
                        .width(120.dp)
                        .padding(start = 8.dp),
                    model = it.imageUrl,
                    contentDescription = it.title
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewHomeScreen() {
    HomeScreen(
        modifier = Modifier.fillMaxSize(), HomeUIState(
            MovieUIEntity(
                "12312",
                "Stranger Things",
                "Que buena peli",
                "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
            ),
            arrayListOf()
        )
    )
}