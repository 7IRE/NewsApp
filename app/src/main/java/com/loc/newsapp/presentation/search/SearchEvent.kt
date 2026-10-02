package com.loc.newsapp.presentation.search

sealed class SearchEvent {

    data class UpdateSearchQuery(val SearchQuery: String ): SearchEvent()
    object SearchNews : SearchEvent()
}