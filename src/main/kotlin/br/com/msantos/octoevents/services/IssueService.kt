package br.com.msantos.octoevents.services

import br.com.msantos.octoevents.documents.Issue

interface IssueService {

    fun buscarPorNumero(numero: Int): Issue?

    fun persistir(issue: Issue): Issue

}