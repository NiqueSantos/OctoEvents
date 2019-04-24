package br.com.msantos.octoevents.web.endpoint

import br.com.msantos.octoevents.business.service.core.EventService
import io.javalin.apibuilder.EndpointGroup

class EventEndpoint(val eventService: EventService) : EndpointGroup {

    override
    fun addEndpoints() {

    }
}