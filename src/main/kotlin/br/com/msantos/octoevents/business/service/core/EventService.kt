package br.com.msantos.octoevents.business.service.core

import br.com.msantos.octoevents.business.converter.EventConverter
import br.com.msantos.octoevents.business.entity.Event
import br.com.msantos.octoevents.business.repository.IEventRepository
import br.com.msantos.octoevents.business.service.IEventService
import br.com.msantos.octoevents.web.dto.EventDto

class EventService(private val eventRepository: IEventRepository) : IEventService {

    override fun buscarPorNumero(numero: Int): List<Event>? = eventRepository.buscarPorNumero(numero)

    override fun persistir(eventDto: EventDto): Event = eventRepository.persistir(EventConverter().toModel(eventDto))
}