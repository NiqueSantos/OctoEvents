package br.com.msantos.octoevents.web.endpoint

import br.com.msantos.octoevents.business.entity.Event
import org.junit.jupiter.api.Test
import io.restassured.RestAssured.*
import org.assertj.core.api.Assertions.assertThat

/**
 * @author monique.santos
 * @since 1.0.0
 *
 * */
class EventEndpointTest : ServerTest() {

    @Test
    fun testNotFoundEvents() {
        get("/issues/{number}/events", "98")
                .then()
                .statusCode(404)
    }

    @Test
    fun testFoundEvents() {

        val events = get("/issues/{number}/events", "5")
                .then()
                .extract().to<Collection<Event>>()
        assertThat(events).isNotEmpty
        assertThat(events).extracting("action").contains("OPENED", "CREATED", "CLOSED", "REOPENED")
    }

}