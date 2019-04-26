package br.com.msantos.octoevents.business.converter

import br.com.msantos.octoevents.business.entity.Event
import br.com.msantos.octoevents.business.entity.enums.ActionEnum
import br.com.msantos.octoevents.web.dto.EventDto


class EventConverter {

    fun toModel(eventDto: EventDto) {

        val event = Event(

                ActionEnum.valueOf(eventDto.action.toUpperCase()),
                eventDto.issue.number,
                eventDto.issue.title,
                eventDto.issue.createdAt,
                eventDto.issue.updatedAt,
                eventDto.issue.closedAt,
                eventDto.issue.comments,
                eventDto.issue.repositoryUrl,
                eventDto.issue.user.login,
                eventDto.issue.body,
                eventDto.issue.id
        )
    }
}