package de.marcreichelt.kotlin_auth_freshness

import kotlinx.coroutines.delay

fun answer(): Int = 42

suspend fun delayedAnswer(): Int {
    delay(100)
    return answer()
}
