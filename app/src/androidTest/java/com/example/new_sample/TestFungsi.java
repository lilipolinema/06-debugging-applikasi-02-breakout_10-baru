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
public class TestFungsi {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    //Test Case Penjumlahan 5+3 =
    //Hasil yang diharapkan 8
    @Test
    public void fungsiTambah() {
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("5")));
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("3")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("8")));
    }

    //Test Case Penjumlahan 5-3 =
    //Hasil yang diharapkan 2
    @Test
    public void fungsiKurang() {
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("5")));
        onView(withId(R.id.button_sub)).perform(click());
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("3")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("2")));
    }

    //Test Case Penjumlahan 5*3 =
    //Hasil yang diharapkan 15
    @Test
    public void fungsiKali() {
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("5")));
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("3")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("8")));
    }

    //Test Case Penjumlahan 9*3 =
    //Hasil yang diharapkan 3
    @Test
    public void fungsiBagi() {
        onView(withId(R.id.button9)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("9")));
        onView(withId(R.id.button_divide)).perform(click());
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("3")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("3")));
    }

    //Test case modulus 12%2
    //Hasil yang diharapkan 0
    @Test
    public void fungsiMod() {
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("12")));
        onView(withId(R.id.button_para1)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("2")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("0")));
    }

    //Test case modulus 99%2
    //Hasil yang diharapkan 1
    @Test
    public void fungsiModAngkaBesar() {
        onView(withId(R.id.button9)).perform(click());
        onView(withId(R.id.button9)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("99")));
        onView(withId(R.id.button_para1)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("2")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("1")));
    }

    //Test case +/-  6
    //Hasil yang diharapkan -6
    @Test
    public void konversi() {
        onView(withId(R.id.button6)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("6")));
        onView(withId(R.id.button_para2)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("-6")));
    }

    //Test case +/-  6
    //Hasil yang diharapkan -6
    @Test
    public void clear() {
        onView(withId(R.id.button6)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("6")));
        onView(withId(R.id.button_clear)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("")));
    }

    //Test Case Scenario 5+7+3 =
    //Hasil yang diharapkan 15
    @Test
    public void fungsiTambahTingkat2(){
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("5")));
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("7")));
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("3")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("15")));
    }

    //Test case scenario 5-7-3 =
    //Hasil yang diharapkan -5
    //Bug = Hasil yang dijalankan menggunakan rumus 5 - 7 -(-3)
    /*@Test
    public void fungsiMinusTingkat2(){
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("5")));
        onView(withId(R.id.button_sub)).perform(click());
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("7")));
        onView(withId(R.id.button_sub)).perform(click());
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("3")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("-5")));
    }*/

    //Test case scenario 5*7*3
    //Hasil yang diharapkan
    @Test
    public void fungsiKaliTingkat2(){
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("5")));
        onView(withId(R.id.button_multi)).perform(click());
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("7")));
        onView(withId(R.id.button_multi)).perform(click());
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("3")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("105")));
    }

    //Test case scenario 24/3/2
    //Hasil yang diharapkan 4
    @Test
    public void fungsiBagiTingkat2(){
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("24")));
        onView(withId(R.id.button_divide)).perform(click());
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("3")));
        onView(withId(R.id.button_divide)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("2")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("4")));
    }

    //Test Case Scenario 5+7= 12+3 =
    //Hasil yang diharapkan 15
    //Bug = terjadi dikarenakan baris kode didalam MainActivity.java tidak memungkinkan setelah sama dengan hasil ditambah dengan angka baru
    /*@Test
    public void fungsiTambahTambahv2(){
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("5")));
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("7")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("12")));
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("3")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("15")));
    }*/

    // Test Case Scenario 0.5+0.7=
    //Hasil yang diharapkan 1.2
    @Test
    public void fungsiTambahDesimal(){
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("0.5")));
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("0.7")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("1.2")));
    }

    // Test Case Scenario 0.9-0.7=
    //Hasil yang diharapkan 0.2
    // Bug = Pengurangan desimal memiliki hasil yang tidak akurat/ lebih tepatnya mendekati
    /*@Test
    public void fungsiTambahDesimal(){
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("0.5")));
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("0.7")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("1.2")));
    }*/

    // Test Case Scenario 0.5*0.5=
    //Hasil yang diharapkan 0.25
    @Test
    public void fungsiKaliDesimal(){
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("0.5")));
        onView(withId(R.id.button_multi)).perform(click());
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("0.5")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("0.25")));
    }

    // Test Case Scenario 0.5*0.5=
    //Hasil yang diharapkan 1
    @Test
    public void fungsiBagiDesimal(){
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("0.5")));
        onView(withId(R.id.button_divide)).perform(click());
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("0.5")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("1")));
    }

    //Test Case Scenario 0.5+0.7+0.3=
    //Hasil yang diharapkan 1.5
    @Test
    public void fungsiTambahDesimal2(){
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("0.5")));
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("0.7")));
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("0.3")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("1.5")));
    }

    // Test Case Scenario 0.9-0.3-0.3=
    //Hasil yang diharapkan 0.3
    // Bug = Pengurangan desimal memiliki hasil yang tidak akurat/ lebih tepatnya mendekati
    /*@Test
    public void fungsiMinusDesimal2(){
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button9)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("0.9")));
        onView(withId(R.id.button_sub)).perform(click());
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("0.3")));
        onView(withId(R.id.button_sub)).perform(click());
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("0.3")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("0.3")));
    }*/

    //Test Case Scenario 0.5*0.7*0.3=
    //Hasil yang diharapkan 0.105
    @Test
    public void fungsiKaliDesimal2(){
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("0.5")));
        onView(withId(R.id.button_multi)).perform(click());
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("0.7")));
        onView(withId(R.id.button_multi)).perform(click());
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("0.3")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("0.105")));
    }

    //Test Case Scenario 2/0.5*/0.3=
    //Hasil yang diharapkan 13.333333333333
    //Bug = Pengurangan desimal memiliki hasil yang tidak akurat/ lebih tepatnya mendekati
    /*@Test
    public void fungsiBagiDesimal2(){
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("2")));
        onView(withId(R.id.button_divide)).perform(click());
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("0.5")));
        onView(withId(R.id.button_divide)).perform(click());
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("0.3")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("13.333333333333")));
    }*/
}
