package br.com.msantos.octoevents.web.dto

data class EventDto (

    val action: String = "",
    val number: String = "",
    val title: String = "",

    val createdAt: String? = null,
    val updatedAt: String? = null,
    val closedAt: String? = null,
    val repositoryUrl: String? = null,
    val comments: String? = null,
    val login: String? = null,
    val body: String? = null,
    val id: String? = null
)