package br.com.msantos.octoevents.business.repository

import br.com.msantos.octoevents.business.entity.Event

/**
 *
 * @author monique.santos
 * @since 1.0.0
 *
 * */
interface IEventRepository {

    /**
     * @param numero identificador da issue
     * @return list de event
     * */
    fun buscarPorNumero(numero: Int): List<Event>?

    /**
     * @param event entidade a ser persistida
     * */
    fun persistir(event: Event)

}