package com.example.new_sample;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TestSemuaButton {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);


    //Test Case Scenario semua tombol diklik satu per satu untuk mengetes keluar apa tidak
    //Hasil yang diinginkan Angka Keluar sesuai yang diinginkan
    @Test
    public void tombol1() {
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("1")));
    }

    @Test
    public void tombol2() {
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("2")));
    }

    @Test
    public void tombol3() {
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("3")));
    }

    @Test
    public void tombol4() {
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("4")));
    }

    @Test
    public void tombol5() {
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("5")));
    }

    @Test
    public void tombol6() {
        onView(withId(R.id.button6)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("6")));
    }

    @Test
    public void tombol7() {
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("7")));
    }

    @Test
    public void tombol8() {
        onView(withId(R.id.button8)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("8")));
    }

    @Test
    public void tombol9() {
        onView(withId(R.id.button9)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("9")));
    }

    @Test
    public void tombol0() {
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("0")));
    }

    @Test
    public void tomboltitik(){
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.input)).check(matches(withText(".")));
    }

    @Test
    public void tomboltambah(){
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("Error")));
    }

    @Test
    public void tombolkurang(){
        onView(withId(R.id.button_sub)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("Error")));
    }

    @Test
    public void tombolkali(){
        onView(withId(R.id.button_multi)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("Error")));
    }

    @Test
    public void tombolbagi(){
        onView(withId(R.id.button_divide)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("Error")));
    }

    @Test
    public void tombolsamadengan(){
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("Error")));
    }

    @Test
    public void tombolpara1(){
        onView(withId(R.id.button_para1)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("Error")));
    }

    @Test
    public void tombolpara2(){
        onView(withId(R.id.button_para2)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("Error")));
    }

    @Test
    public void tombolclear(){
        onView(withId(R.id.button_clear)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("")));
    }

}
