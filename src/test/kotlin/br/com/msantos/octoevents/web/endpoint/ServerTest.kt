package br.com.msantos.octoevents.web.endpoint

import br.com.msantos.octoevents.octoEventModule
import br.com.msantos.octoevents.web.controller.ServerController
import io.javalin.Javalin
import io.restassured.RestAssured
import io.restassured.response.ResponseBodyExtractionOptions
import io.restassured.specification.RequestSpecification
import org.junit.After
import org.junit.jupiter.api.BeforeAll
import org.koin.standalone.StandAloneContext
import org.koin.test.KoinTest

open class ServerTest: KoinTest {

    protected fun RequestSpecification.When(): RequestSpecification {
        return this.`when`()
    }

    protected inline fun <reified T> ResponseBodyExtractionOptions.to(): T {
        return this.`as`(T::class.java)
    }

    companion object {

        private lateinit var app: Javalin

        @BeforeAll
        @JvmStatic
        fun before() {

            StandAloneContext.startKoin(listOf(octoEventModule))
            app = ServerController().app

            RestAssured.baseURI = "http://localhost"
            RestAssured.port = 7000
        }
    }

    @After
    fun after() {
        StandAloneContext.stopKoin()
        app.stop()
    }
}