package br.com.msantos.octoevents.web.controller

import br.com.msantos.octoevents.business.service.IEventService
import br.com.msantos.octoevents.web.endpoint.EventEndpoint
import br.com.msantos.octoevents.web.endpoint.WebhookEndpoint
import br.com.msantos.octoevents.web.util.JsonUtil
import io.javalin.Javalin
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

/**
 *
 * @author monique.santos
 * @since 1.0.0
 *
 * */
class ServerController : KoinComponent {

    val app: Javalin
    private val eventService by inject<IEventService>()


    /**
     *
     * Blocos de inicialização do servidor, executados sequencialmente
     *
     * @see <a href="https://www.journaldev.com/18491/kotlin-class-constructor">Kotlin init</a>
     *
     * */
    init {

        this.app = Javalin.create().apply {
            port(7000)
            exception(Exception::class.java) { e, _ -> e.printStackTrace() }
        }
    }

    init {

        this.app.start()
        JsonUtil().javalinJsonMapper()

        this.app.routes {
            EventEndpoint(eventService).addEndpoints()
            WebhookEndpoint(eventService).addEndpoints()
        }

        build()
    }

    private fun build(): Javalin = this.app

}