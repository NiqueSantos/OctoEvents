package br.com.msantos.octoevents.business.service

import br.com.msantos.octoevents.business.converter.EventConverter
import br.com.msantos.octoevents.business.entity.Event
import br.com.msantos.octoevents.business.entity.enums.ActionEnum
import br.com.msantos.octoevents.octoEventModule
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.koin.standalone.StandAloneContext
import org.koin.standalone.inject
import org.koin.test.KoinTest
import java.util.*


class EventServiceTest: KoinTest {

    private val eventService by inject<IEventService>()

    @Before
    fun before() {
        StandAloneContext.startKoin(listOf(octoEventModule))
    }

    @After
    fun after() {
        StandAloneContext.stopKoin()
    }

    @Test
     fun testPersistirEvento() {

        val eventCreate = eventService.persistir(EventConverter().toDto(mockEvent()))
        Assert.assertNotNull(eventCreate)

    }

    @Test
    fun testBuscarEventosPorNumeroIssue() {

        val events = eventService.buscarPorNumero(4)
        Assert.assertNotNull(events)
    }

    private fun mockEvent(): Event =
        Event(ActionEnum.OPENED, 40, "Teste Title", Date(), Date(), Date(), "1", "http://repositoryUrl", "NiqueSantos", "testing..", 437687493)

}