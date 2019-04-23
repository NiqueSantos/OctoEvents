package br.com.msantos.octoevents.repositories

import br.com.msantos.octoevents.documents.Issue
import org.springframework.data.mongodb.repository.MongoRepository

interface IssueRepository : MongoRepository<Issue, String> {

    fun findByNumber(number: Int): Issue

}