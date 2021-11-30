package org.freekode.cryptobot.genericplatformlibrary

import org.springframework.context.annotation.Import


@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
@Import(
    GenericPlatformLibraryConfiguration::class
)
annotation class EnableGenericPlatform
