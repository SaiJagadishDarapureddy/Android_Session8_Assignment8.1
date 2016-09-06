package com.example.admin.preferenceactivity;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by admin on 9/6/2016.
 */
public class UserSettingActivity extends PreferenceActivity {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // add the xml resource
        addPreferencesFromResource(R.xml.user_settings);


    }

}
