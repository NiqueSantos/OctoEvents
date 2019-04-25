package br.com.msantos.octoevents.web.dto

import com.google.gson.annotations.SerializedName
import java.util.*

data class EventDto(

    @SerializedName("action") val action: String,
    @SerializedName("issue") val issue: Issue
)

data class Issue(
    @SerializedName("id") val id: Int,
    @SerializedName("number") val number: Int,
    @SerializedName("title") val title: String,
    @SerializedName("created_at") val createdAt: Date,
    @SerializedName("closedAt") val closedAt: Date?,
    @SerializedName("updated_at") val updatedAt: Date?,
    @SerializedName("comments") val comments: String?,
    @SerializedName("repositoryUrl") val repositoryUrl: String?,
    @SerializedName("body") val body: String?,
    @SerializedName("user") val user: User

)

data class User(
    @SerializedName("login") val login: String
)