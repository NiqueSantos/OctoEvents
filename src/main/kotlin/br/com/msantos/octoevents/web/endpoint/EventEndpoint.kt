package br.com.msantos.octoevents.web.endpoint

import br.com.msantos.octoevents.business.entity.Event
import br.com.msantos.octoevents.business.service.IEventService
import io.javalin.apibuilder.ApiBuilder.get
import io.javalin.apibuilder.ApiBuilder.path
import io.javalin.apibuilder.EndpointGroup
import org.eclipse.jetty.http.HttpStatus

class EventEndpoint(private val eventService: IEventService) : EndpointGroup {


    override
    fun addEndpoints() {

        try {

            path("issues") {
                get(":number/events") { ctx ->

                    val issueNumber = ctx.pathParam(":number").toInt()
                    val events: List<Event> = eventService.buscarPorNumero(issueNumber) as List<Event>

                    if (events.isEmpty()) {

                        println("Nenhum evento foi encontrado para o número informado: ${ctx.pathParam("number")}")
                        ctx.status(HttpStatus.NO_CONTENT_204)

                    } else {

                        ctx.status(HttpStatus.OK_200)
                        ctx.json(events)
                    }
                }
            }
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }
}
