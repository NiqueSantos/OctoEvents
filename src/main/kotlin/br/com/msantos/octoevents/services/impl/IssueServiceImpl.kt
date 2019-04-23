package br.com.msantos.octoevents.services.impl

import br.com.msantos.octoevents.documents.Issue
import br.com.msantos.octoevents.repositories.IssueRepository
import br.com.msantos.octoevents.services.IssueService
import org.springframework.stereotype.Service

@Service
class IssueServiceImpl(val issueRepository: IssueRepository) : IssueService {

    override
    fun buscarPorNumero(number: Int): Issue? = issueRepository.findByNumber(number)

    override
    fun persistir(issue: Issue): Issue = issueRepository.save(issue)
}