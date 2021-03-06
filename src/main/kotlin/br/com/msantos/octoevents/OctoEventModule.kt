package br.com.msantos.octoevents

import br.com.msantos.octoevents.business.repository.IEventRepository
import br.com.msantos.octoevents.business.repository.core.EventRepository
import br.com.msantos.octoevents.business.service.IEventService
import br.com.msantos.octoevents.business.service.core.EventService
import org.koin.dsl.module.module


/**
     * @author monique.santos
     * @since 1.0.0
     *
     * Reference https://insert-koin.io/docs/2.0/getting-started/kotlin/
     *                   Declaring dependencies
     *
     * */
    val octoEventModule = module {

        single<IEventService> { EventService(get()) }
        single<IEventRepository> { EventRepository() }
    }
