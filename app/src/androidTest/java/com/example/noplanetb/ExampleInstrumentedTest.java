package com.example.noplanetb;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.widget.Button;

import org.junit.Test;
import org.junit.runner.RunWith;

import android.test.ActivityInstrumentationTestCase2;
//import static android.support.test.espresso.Espresso.onView;
//import static android.support.test.espresso.action.ViewActions.typeText;
//import static android.support.test.espresso.matcher.ViewMatchers.withId;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;


/**
 * @author ernesto
 */

public class ExampleInstrumentedTest extends ActivityInstrumentationTestCase2<BLogin> {

    private Button mloginbutton;
    private EditText etext1;
    private EditText etext2;

    public ExampleInstrumentedTest() {
        super(BLogin.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        BLogin actividad = getActivity();

        mloginbutton = actividad.findViewById(R.id.button);

    }

//    protected void tearDown() throws Exception {
//        super.tearDown();
//    }



    public void testLoginSignup() {
//        onView(withId(R.id.email)).perform(typeText(USERNAME));
//        onView(withId(R.id.password)).perform(typeText(PASSWORD));

        // first tap on value1 entry

        // now on login button
        TouchUtils.tapView(this, mloginbutton);

    }
}
