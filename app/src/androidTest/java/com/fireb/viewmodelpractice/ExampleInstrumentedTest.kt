package com.fireb.viewmodelpractice

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.fireb.viewmodelpractice.ui.MainActivity

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
//    @Test
//    fun useAppContext() {
//        // Context of the app under test.
////        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
////        assertEquals("com.fireb.viewmodelpractice", appContext.packageName)
//
//
//    }


    @Rule
    @JvmField
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun clickAddButton_incrementsValue() {
        val addButton = onView(withId(R.id.button))
        val valueTextView = onView(withId(R.id.text))

        // Click the add button
        addButton.perform(click())

        // Assert that the text view displays the expected value (in this case, 1)
        valueTextView.check(matches(withText("1")))
    }
}