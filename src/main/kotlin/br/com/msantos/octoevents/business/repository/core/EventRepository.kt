package br.com.msantos.octoevents.business.repository.core

import br.com.msantos.octoevents.business.entity.Event
import br.com.msantos.octoevents.business.repository.IEventRepository
import org.litote.kmongo.KMongo
import org.litote.kmongo.eq
import org.litote.kmongo.getCollection

class EventRepository : IEventRepository {


    private val client = KMongo.createClient()
    private val database = client.getDatabase("octo-event")
    private val col = database.getCollection<Event>()

    override fun buscarPorNumero(numero: Int): List<Event>? = col.find(Event::number eq numero).toList()

    override fun persistir(event: Event) = col.insertOne(event)
}