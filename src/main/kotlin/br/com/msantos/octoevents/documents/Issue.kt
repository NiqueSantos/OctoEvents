package br.com.msantos.octoevents.documents

import br.com.msantos.octoevents.enuns.ActionEnum
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class Issue(

    val action: ActionEnum,
    val number: Int,
    val title: String,
    val createdAt: Date,
    val updatedAt: Date,
    val comments: String? = "",
    @Id val id: String? = null

)
