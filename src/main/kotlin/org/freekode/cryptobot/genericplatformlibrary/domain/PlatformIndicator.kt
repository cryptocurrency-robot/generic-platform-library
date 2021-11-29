package org.freekode.cryptobot.genericplatformlibrary.domain

interface PlatformIndicator {
    fun getIndicatorId(): IndicatorId

    fun openStream(pair: GenericMarketPair, callback: (PlatformResponse) -> Unit)

    fun closeStream(pair: GenericMarketPair)
}
