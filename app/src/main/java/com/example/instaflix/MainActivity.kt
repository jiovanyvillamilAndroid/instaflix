package com.example.instaflix

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.instaflix.ui.theme.InstaflixTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InstaflixTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomeScreen(
                        modifier = Modifier.padding(innerPadding), HomeUIState(
                            MovieUIEntity(
                                "12312",
                                "Stranger Things",
                                "Que buena peli",
                                "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                            ),
                            arrayListOf(
                                MoviesCategory(
                                    categoryId = "123123",
                                    categoryTitle = "Category Title",
                                    moviesList = arrayListOf(
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                    )
                                ),
                                MoviesCategory(
                                    categoryId = "123123",
                                    categoryTitle = "Category Title",
                                    moviesList = arrayListOf(
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                    )
                                ),
                                MoviesCategory(
                                    categoryId = "123123",
                                    categoryTitle = "Category Title",
                                    moviesList = arrayListOf(
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                    )
                                ),
                                MoviesCategory(
                                    categoryId = "123123",
                                    categoryTitle = "Category Title",
                                    moviesList = arrayListOf(
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                    )
                                ),
                                MoviesCategory(
                                    categoryId = "123123",
                                    categoryTitle = "Category Title",
                                    moviesList = arrayListOf(
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                    )
                                ),
                                MoviesCategory(
                                    categoryId = "123123",
                                    categoryTitle = "Category Title",
                                    moviesList = arrayListOf(
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                    )
                                ),
                                MoviesCategory(
                                    categoryId = "123123",
                                    categoryTitle = "Category Title",
                                    moviesList = arrayListOf(
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                    )
                                ),
                                MoviesCategory(
                                    categoryId = "123123",
                                    categoryTitle = "Category Title",
                                    moviesList = arrayListOf(
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                    )
                                ),
                                MoviesCategory(
                                    categoryId = "123123",
                                    categoryTitle = "Category Title",
                                    moviesList = arrayListOf(
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                    )
                                ),
                                MoviesCategory(
                                    categoryId = "123123",
                                    categoryTitle = "Category Title",
                                    moviesList = arrayListOf(
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                        MovieUIEntity(
                                            "12312",
                                            "Stranger Things",
                                            "Que buena peli",
                                            "https://images.ctfassets.net/4cd45et68cgf/22eaxyrfqLTOmD0ZgFJDX0/6d7b8a0f4c3130fd87c9921cbd11d180/image5.jpg?w=1200"
                                        ),
                                    )
                                ),
                            )
                        )
                    )
                }
            }
        }
    }
}