package br.com.msantos.octoevents.business.service.core

import br.com.msantos.octoevents.business.entity.Event
import br.com.msantos.octoevents.business.repository.core.EventRepository
import br.com.msantos.octoevents.business.service.IEventService

class EventService(private val eventRepository: EventRepository) : IEventService {

    override fun buscarPorNumero(numero: Int): List<Event>? = eventRepository.buscarPorNumero(numero)

    override fun persistir(eventDto: Event) = eventRepository.persistir(eventDto)

//    override fun persistir(eventDto: EventDto) {
//
//    }
}