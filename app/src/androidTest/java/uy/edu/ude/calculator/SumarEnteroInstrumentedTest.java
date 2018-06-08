package uy.edu.ude.calculator;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import uy.edu.ude.calculator.ui.MainActivity;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class SumarEnteroInstrumentedTest {

  @Rule
  public ActivityTestRule<MainActivity> mActivityRule =
      new ActivityTestRule(MainActivity.class);

  @Test
  public void givenDosNumeros_whenSumar_thenGetResultado() {
    int n1 = 5;
    int n2 = 10;
    int esperado = 15;
    onView(withId(R.id.ed_n1)).perform(typeText(String.valueOf(n1)));
    onView(withId(R.id.ed_n2)).perform(typeText(String.valueOf(n2)));

    onView(withId(R.id.btn_sum)).perform(click());

    onView(withId(R.id.tv_result)).check(matches(withText(String.valueOf(esperado))));
  }
}
