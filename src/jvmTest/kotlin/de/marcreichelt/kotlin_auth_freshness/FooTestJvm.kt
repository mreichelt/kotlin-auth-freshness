package de.marcreichelt.kotlin_auth_freshness

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Test
import kotlin.test.assertEquals

@ExperimentalCoroutinesApi
class FooTestJvm {

    @Test
    fun delayedAnswerMustBe42() = runBlockingTest {
        assertEquals(42, delayedAnswer())
    }

}
