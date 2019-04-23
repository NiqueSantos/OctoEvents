package br.com.msantos.octoevents

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Configuration

@SpringBootApplication
@Configuration
class OctoeventsApplication: CommandLineRunner {

	override fun run(vararg args: String?) {

		/** TODO:
		*  - inicializar o octo module para fazer a injeção com koin
		 *
		*  - startar a aplicação na porta especifica com o javalin
		 *
		* */

	}
}


fun main(args: Array<String>) {
	SpringApplication.run(OctoeventsApplication::class.java, *args)
}
