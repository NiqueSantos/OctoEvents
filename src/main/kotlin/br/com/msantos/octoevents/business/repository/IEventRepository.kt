package br.com.msantos.octoevents.business.repository

import br.com.msantos.octoevents.business.entity.Event

/**
 * Reference https://litote.org/kmongo/quick-start/
 *
 * @author monique.santos
 * @since 1.0.0
 * */
interface IEventRepository {

    /**
     * @param numero identificador da issue
     * @return list event
     * */
    fun buscarPorNumero(numero: Int): List<Event>?

    /**
     * @param event entidade a ser persistida
     * */
    fun persistir(event: Event)

}