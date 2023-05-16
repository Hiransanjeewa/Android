package com.sanjeewabasnayaka.android.composedapp

import com.sanjeewabasnayaka.android.composedapp.services.HellomessageService
import org.junit.Assert
import org.junit.Test

class HelloMessageServiceTests {

    @Test
    fun it_should_return_an_error_if_name_is_empty(){
        val hellomessageService= HellomessageService()
        var result=hellomessageService.showMessage(" ","23")
        Assert.assertEquals("Name cannot be empty",result)
    }

    @Test
    fun it_should_return_an_error_if_age_is_empty(){
        val hellomessageService= HellomessageService()
        var result=hellomessageService.showMessage("Hiran"," ")
        Assert.assertEquals("Age cannot be empty",result)
    }

    @Test
    fun it_should_return_welcome_message_if_name_and_age_provided(){
        val hellomessageService= HellomessageService()
        var result=hellomessageService.showMessage("Hiran","23")
        Assert.assertEquals("Hello Hiran , You are 23 years old.",result)
    }
}