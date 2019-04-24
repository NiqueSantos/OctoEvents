package br.com.msantos.octoevents.business.configuration

/**
 * @author monique.santos
 * @since 1.0.0
 * */
interface IEventConfiguration {

    /**
     * Retorna instancia com as informações para estabelecer conexão
     * com o MongoDB
     * */
    fun getDataSourceConfiguration(): DataSourceConfig
}