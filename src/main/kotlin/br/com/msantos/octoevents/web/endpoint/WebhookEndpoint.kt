package br.com.msantos.octoevents.web.endpoint

import br.com.msantos.octoevents.business.service.IEventService
import br.com.msantos.octoevents.web.dto.EventDto
import io.javalin.apibuilder.ApiBuilder.post
import io.javalin.apibuilder.EndpointGroup

class WebhookEndpoint(val eventService: IEventService) : EndpointGroup {

    override fun addEndpoints() {

        post("webhook") { ctx ->

            val eventPayload = ctx.bodyAsClass(EventDto::class.java)

        }
    }


}