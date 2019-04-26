package br.com.msantos.octoevents.business.service.core

import br.com.msantos.octoevents.business.entity.Event
import br.com.msantos.octoevents.business.repository.IEventRepository
import br.com.msantos.octoevents.business.service.IEventService

class EventService(private val eventRepository: IEventRepository) : IEventService {

    override fun buscarPorNumero(numero: Int): List<Event>? = eventRepository.buscarPorNumero(numero)

    override fun persistir(event: Event) = eventRepository.persistir(event)


}