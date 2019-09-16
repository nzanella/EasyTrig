package com.ritmoblaster.easytrig;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.text.method.DigitsKeyListener;
import android.widget.EditText;

public class PrefsActivity extends PreferenceActivity implements OnSharedPreferenceChangeListener {
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    
    super.onCreate(savedInstanceState);
    
    addPreferencesFromResource(R.xml.prefs);
    
    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
    
    prefs.registerOnSharedPreferenceChangeListener(this);
    
    EditTextPreference timeIntervalEditTextPreference = (EditTextPreference) findPreference("timeInterval");
    
    EditText timeIntervalEditText = (EditText) timeIntervalEditTextPreference.getEditText();
    
    timeIntervalEditText.setKeyListener(DigitsKeyListener.getInstance(false, false));
    
    setResult(RESULT_OK);
    
  }

  @Override
  public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
    
    
    
  }
  
}
