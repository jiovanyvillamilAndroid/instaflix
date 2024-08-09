package com.example.instaflix

data class HomeUIState(
    val principalMovie: MovieUIEntity,
    val categories: List<MoviesCategory>
)
