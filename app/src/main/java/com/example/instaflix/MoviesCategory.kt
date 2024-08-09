package com.example.instaflix

data class MoviesCategory(
    val categoryId:String,
    val categoryTitle:String,
    val moviesList: List<MovieUIEntity>
)
