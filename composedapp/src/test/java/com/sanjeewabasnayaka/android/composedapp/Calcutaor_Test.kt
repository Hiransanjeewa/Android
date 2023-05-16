package com.sanjeewabasnayaka.android.composedapp

import com.sanjeewabasnayaka.android.composedapp.services.Calculate
import org.junit.Assert
import org.junit.Test


class Calcutaor_Test {

    @Test
    fun it_should_add_2_and_2_and_return_4() {
        val calculate = Calculate()
        var result = calculate.add(2, 2)
        Assert.assertEquals(4, result)
    }
}