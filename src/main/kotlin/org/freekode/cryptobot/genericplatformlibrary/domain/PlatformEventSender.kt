package org.freekode.cryptobot.genericplatformlibrary.domain

import org.freekode.cryptobot.genericplatformlibrary.domain.event.PlatformEvent


interface PlatformEventSender {
    fun send(event: PlatformEvent)
}
