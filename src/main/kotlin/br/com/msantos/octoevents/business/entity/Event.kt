package br.com.msantos.octoevents.business.entity

import br.com.msantos.octoevents.business.entity.enums.ActionEnum
import java.util.*

data class Event(

        val action: ActionEnum,
        val number: Int,
        val title: String,
        val createdAt: Date? = null,
        val updatedAt: Date? = null,
        val closedAt: Date? = null,
        val comments: String? = "",
        val repositoryUrl: String,
        val login: String,
        val body: String? = "",
        val id: Int
)