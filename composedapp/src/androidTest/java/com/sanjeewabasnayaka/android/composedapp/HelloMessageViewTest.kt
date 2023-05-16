package com.sanjeewabasnayaka.android.composedapp

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.sanjeewabasnayaka.android.composedapp.ui.theme.Android1Theme

import org.junit.Before
import org.junit.BeforeClass
import org.junit.Rule
import org.junit.Test

class HelloMessageViewTest {
    @get:Rule
    val composeTestRule= createComposeRule()

    @Before
   fun before(){
        composeTestRule.setContent {
            Android1Theme {
                Twogreetings()
            }
        }

    }
//    @BeforeClass
//    fun beforeClass(){
//
//    }
//    @After
//    fun after(){
//
//    }
//    @AfterClass
//    fun afterClass(){
//
//    }

    @Test
    fun testUi(){

        composeTestRule.onNodeWithText("Age").performTextInput("23")
        Thread.sleep(2000L)
        composeTestRule.onNodeWithText("Click here").performClick()
        Thread.sleep(2000L)
        composeTestRule.onNodeWithText("Name cannot be empty").assertIsDisplayed()

    }
}