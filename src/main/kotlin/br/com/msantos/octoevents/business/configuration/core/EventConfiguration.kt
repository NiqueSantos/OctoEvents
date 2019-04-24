package br.com.msantos.octoevents.business.configuration.core

import br.com.msantos.octoevents.business.configuration.DataSourceConfig
import br.com.msantos.octoevents.business.configuration.IEventConfiguration
import com.natpryce.konfig.ConfigurationProperties
import com.natpryce.konfig.Key
import com.natpryce.konfig.stringType

class EventConfiguration : IEventConfiguration {

    override fun getDataSourceConfiguration(): DataSourceConfig {

        val enviroment = ConfigurationProperties.fromResource("application.properties")
        val uri = enviroment[Key("mongodb.uri", stringType)]
        val database = enviroment[Key("mongodb.database", stringType)]
        val collection = enviroment[Key("mongodb.collection", stringType)]

        return DataSourceConfig(uri, database, collection)
    }

}