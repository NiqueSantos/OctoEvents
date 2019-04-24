package br.com.msantos.octoevents.business.service

import br.com.msantos.octoevents.business.entity.Event

interface IEventService {

    fun buscarPorNumero(numero: Int): List<Event>

    fun persistir(event: Event)
}