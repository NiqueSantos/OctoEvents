package br.com.msantos.octoevents

import br.com.msantos.octoevents.web.controller.ServerController
import org.koin.standalone.StandAloneContext.startKoin

/**
 * @author monique.santos
 * @since 1.0.0
 * @see <a href="https://kotlinlang.org/docs/reference/java-to-kotlin-interop.html">Static Methods</a>
 * */
class OctoEventsApplication {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            startKoin(listOf(octoEventModule))
            ServerController()
        }
    }

}



