package com.example.macbook.myapplication;

import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.CheckBox;
import android.widget.Toast;

public class SettingsActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);

        Preference version_name = findPreference("version_name");
        version_name.setTitle("version" + BuildConfig.VERSION_NAME);
        Preference wifi = findPreference("wifi");
    }


    @Override
    public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        switch (preference.getKey()){
            case "wifi":
                Toast.makeText(
                        this,
                        preference.getTitle() + " clicked "+ ((CheckBoxPreference) preference).isChecked(),
                        Toast.LENGTH_SHORT
                ).show();
                break;
            case "how_to_link":

                break;

            default:
                break;

        }
        return super.onPreferenceTreeClick(preferenceScreen, preference);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
