package org.freekode.cryptobot.genericplatformlibrary.domain

import java.math.BigDecimal

data class PlatformResponse(
    val pair: GenericMarketPair,
    val indicatorId: IndicatorId,
    val value: BigDecimal,
    val timestamp: Long
)
