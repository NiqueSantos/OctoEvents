package br.com.msantos.octoevents.business.repository.core

import br.com.msantos.octoevents.business.entity.Event
import br.com.msantos.octoevents.business.repository.IEventRepository
import com.mongodb.MongoClient
import com.mongodb.MongoClientURI
import com.mongodb.client.MongoDatabase
import com.natpryce.konfig.ConfigurationProperties
import com.natpryce.konfig.Key
import com.natpryce.konfig.stringType
import org.litote.kmongo.KMongo
import org.litote.kmongo.eq

class EventRepository : IEventRepository {

    private val environment = ConfigurationProperties.fromResource("application.properties")

    private val mongoUri = environment[Key("mongodb.uri", stringType)]
    private val mongoDatabase = environment[Key("mongodb.database", stringType)]
    private val mongoCollection = environment[Key("mongodb.collection", stringType)]

    private val client: MongoClient = KMongo.createClient(uri = MongoClientURI(mongoUri))
    private val database: MongoDatabase = client.getDatabase(mongoDatabase)
    private val col = database.getCollection(mongoCollection, Event::class.java)

    override fun buscarPorNumero(numero: Int): List<Event>? = col.find(Event::number eq numero).toList()

    override fun persistir(event: Event) = col.insertOne(event)
}