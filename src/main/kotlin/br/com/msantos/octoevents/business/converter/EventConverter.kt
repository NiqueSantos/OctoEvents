package br.com.msantos.octoevents.business.converter



class EventConverter {

    fun toModel(eventDto: EventDto) {

        val event = Event(

                ActionEnum.valueOf(eventDto.action.toUpperCase()),
                eventDto.issue.title,
                eventDto.issue.createdAt,
                eventDto.issue.updatedAt,
                eventDto.issue.closedAt,
                eventDto.issue.comments,
                eventDto.issue.repositoryUrl,
                eventDto.issue.user.login,
                eventDto.issue.id
        )

    }
}