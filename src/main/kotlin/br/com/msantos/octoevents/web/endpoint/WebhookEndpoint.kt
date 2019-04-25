package br.com.msantos.octoevents.web.endpoint

import br.com.msantos.octoevents.business.service.IEventService
import io.javalin.apibuilder.ApiBuilder.post
import io.javalin.apibuilder.EndpointGroup

class WebhookEndpoint(val eventService: IEventService) : EndpointGroup {

    override fun addEndpoints() {

        post("webhook") { ctx ->

//            val eventRequest = ctx.bodyAsClass(EventDto::class.java)

        }
    }


}