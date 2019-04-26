package br.com.msantos.octoevents.business.repository

import br.com.msantos.octoevents.business.entity.Event

/**
 * Reference https://litote.org/kmongo/quick-start/
 *
 * @author monique.santos
 * @since 1.0.0
 * */
interface IEventRepository {

    fun buscarPorNumero(numero: Int): List<Event>?

    fun persistir(event: Event)

}