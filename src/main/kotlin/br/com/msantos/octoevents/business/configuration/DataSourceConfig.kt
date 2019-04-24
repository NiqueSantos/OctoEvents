package br.com.msantos.octoevents.business.configuration

data class DataSourceConfig(
    val mongoUri: String,
    val mongoDatabase: String,
    val mongoCollection: String
)