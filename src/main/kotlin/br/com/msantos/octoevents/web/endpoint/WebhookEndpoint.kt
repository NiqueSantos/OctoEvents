package br.com.msantos.octoevents.web.endpoint

import br.com.msantos.octoevents.business.service.IEventService
import br.com.msantos.octoevents.web.dto.EventDto
import io.javalin.apibuilder.ApiBuilder.post
import io.javalin.apibuilder.EndpointGroup
import org.eclipse.jetty.http.HttpStatus

/**
 *
 * @author monique.santos
 * @since 1.0.0
 *
 * */
class WebhookEndpoint(private val eventService: IEventService) : EndpointGroup {

    override fun addEndpoints() {

        post("webhook") { ctx ->

            val eventPayload = ctx.bodyAsClass(EventDto::class.java)
            if (eventPayload == null) {

                ctx.status(HttpStatus.BAD_REQUEST_400)
                ctx.json("Ocorreu um erro inesperado e não foi possível salvar o evento.")

            } else {

                try {

                    eventService.persistir(eventPayload)
                    ctx.status(HttpStatus.CREATED_201)
                    ctx.json("Evento ${eventPayload.issue.number} salvo com sucesso!")

                } catch (ex: Exception) {

                    ctx.status(HttpStatus.INTERNAL_SERVER_ERROR_500)
                    ctx.json("Ocorreu um erro inesperado e não foi possível salvar o evento.")
                }
            }
        }
    }
}