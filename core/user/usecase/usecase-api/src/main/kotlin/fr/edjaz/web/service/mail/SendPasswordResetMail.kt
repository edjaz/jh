package fr.edjaz.web.service.mail

import fr.edjaz.web.service.mail.request.SendEmailUserRequest
import org.springframework.scheduling.annotation.Async

interface SendPasswordResetMail {
    @Async
    fun execute(request: SendEmailUserRequest)
}
