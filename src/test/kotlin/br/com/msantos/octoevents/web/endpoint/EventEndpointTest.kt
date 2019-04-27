package br.com.msantos.octoevents.web.endpoint

import br.com.msantos.octoevents.octoEventModule
import br.com.msantos.octoevents.web.controller.ServerController
import io.javalin.Javalin
import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.koin.standalone.StandAloneContext
import org.koin.standalone.StandAloneContext.startKoin
import org.koin.standalone.StandAloneContext.stopKoin
import org.koin.test.KoinTest
import org.litote.kmongo.json

class EventEndpointTest: KoinTest {

    var urlBase = "http://localhost:7000/"
    private lateinit var app: Javalin

    @Before
    fun before() {
        startKoin(listOf(octoEventModule))
        app = ServerController().app
    }

    @After
    fun after() {
        stopKoin()
        app.stop()
    }

    @Test
    fun testNotFoundEvents() {
        val response = khttp.get("${urlBase}issues/90/events")
        assertEquals(404, response.statusCode)
    }

    @Test
    fun testFoundEvents() {
        val response = khttp.get("${urlBase}issues/2/events")
        assertEquals(200, response.statusCode)
    }

}