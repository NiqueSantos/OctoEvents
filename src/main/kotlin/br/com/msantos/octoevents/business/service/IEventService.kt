package br.com.msantos.octoevents.business.service

import br.com.msantos.octoevents.business.entity.Event
import br.com.msantos.octoevents.web.dto.EventDto

/***
 * @author monique.santos
 * @since 1.0.0
 *
 * */
interface IEventService {

    /**
     * @param numero identificador da issue
     * @return list de event
     * */
    fun buscarPorNumero(numero: Int): List<Event>?

    /**
     * @param eventDto payload da request a ser convertido na entity a salvar
     * */
    fun persistir(eventDto: EventDto)
}