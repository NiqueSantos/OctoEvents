package br.com.msantos.octoevents.web.util

import com.google.gson.GsonBuilder
import io.javalin.json.FromJsonMapper
import io.javalin.json.JavalinJson
import io.javalin.json.ToJsonMapper

/**
 * @author monique.santos
 * @since 1.0.0
 *
 * */
class JsonUtil {

    /**
     * Json mapper
     * Usados ao chamar ctx.json()ou ctx.body<MyClass>()
     *
     * @see <a href="https://github.com/tipsy/javalin/issues/471"></a>
     *
     * */
    fun javalinJsonMapper() {

        val gson = GsonBuilder().create()
        JavalinJson.fromJsonMapper = object : FromJsonMapper {
            override fun <T> map(json: String, targetClass: Class<T>): T = gson.fromJson(json, targetClass)
        }

        JavalinJson.toJsonMapper = object : ToJsonMapper {
            override fun map(obj: Any): String = gson.toJson(obj)
        }

    }

}