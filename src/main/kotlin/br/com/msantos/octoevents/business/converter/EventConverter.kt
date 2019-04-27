package br.com.msantos.octoevents.business.converter

import br.com.msantos.octoevents.business.entity.Event
import br.com.msantos.octoevents.business.entity.enums.ActionEnum
import br.com.msantos.octoevents.web.dto.EventDto
import br.com.msantos.octoevents.web.dto.Issue
import br.com.msantos.octoevents.web.dto.User

/**
 *
 * @author monique.santos
 * @since 1.0.0
 *
 * */
class EventConverter {

    fun toModel(eventDto: EventDto): Event {

        return Event(

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

    fun toDto(eventModel: Event): EventDto {

        return EventDto(

                eventModel.action.name,
                Issue(eventModel.id, eventModel.number, eventModel.title, eventModel.createdAt,
                      eventModel.closedAt,
                      eventModel.updatedAt,
                      eventModel.comments,
                      eventModel.repositoryUrl,
                      eventModel.body,
                      User(eventModel.login))
        )
    }
}