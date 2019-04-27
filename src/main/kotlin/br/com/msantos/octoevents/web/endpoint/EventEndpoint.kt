package br.com.msantos.octoevents.web.endpoint

import br.com.msantos.octoevents.business.entity.Event
import br.com.msantos.octoevents.business.service.IEventService
import io.javalin.apibuilder.ApiBuilder.get
import io.javalin.apibuilder.ApiBuilder.path
import io.javalin.apibuilder.EndpointGroup
import org.eclipse.jetty.http.HttpStatus

/**
 *
 * @author monique.santos
 * @since 1.0.0
 *
 * */
class EventEndpoint(private val eventService: IEventService) : EndpointGroup {

    override
    fun addEndpoints() {

        path("issues") {
            get(":number/events") { ctx ->

                val issueNumber = ctx.pathParam(":number").toInt()
                val events: List<Event> = eventService.buscarPorNumero(issueNumber) as List<Event>

                if (events.isEmpty()) {

                    ctx.status(HttpStatus.NOT_FOUND_404)
                    ctx.json("Nenhum evento foi encontrado para o número informado: ${ctx.pathParam("number")}")

                } else {

                    try {

                        ctx.status(HttpStatus.OK_200)
                        ctx.json(events)

                    } catch (ex: Exception) {

                        ctx.status(HttpStatus.INTERNAL_SERVER_ERROR_500)
                        ctx.json("Ocorreu um erro inesperado e não foi possível retornar resultado.")
                    }
                }
            }
        }
    }
}
