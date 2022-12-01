package com.gjh.learn.kt.mock

import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.impl.annotations.SpyK
import io.mockk.junit5.MockKExtension
import io.mockk.just
import io.mockk.runs
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

/**
 *
 * created on 2022/11/1
 *
 * @author kevinlights
 */
@ExtendWith(MockKExtension::class)
class MockkTest {
    @MockK
    lateinit var car1: Car

    @RelaxedMockK
    lateinit var car2: Car

    @MockK(relaxUnitFun = true)
    lateinit var car3: Car

    @SpyK
    var car4 = Car()

    @InjectMockKs
    var trafficSystem = TrafficSystem()

    @Test
    fun `test 1`() {
        every {
            car1.drive()
        } just runs
        every {
            car2.changeGear(any())
        } returns true
    }

}

class Car {
    private var gear: String = ""

    fun drive() {
        println("driver")
    }

    fun changeGear(gear: String): Boolean {
        println("changeGear $gear")
        this.gear = gear
        return gear.equals("test")
    }
}

class TrafficSystem {
    lateinit var car1: Car
    lateinit var car2: Car
    lateinit var car3: Car
}