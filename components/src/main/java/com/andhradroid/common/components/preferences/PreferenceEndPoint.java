package com.andhradroid.common.components.preferences;

import android.content.SharedPreferences;

/**
 * Created by ramesh on 9/3/16.
 */
public interface PreferenceEndPoint {

    /**
     * Gets the shared preferences.
     *
     * @return the shared preferences
     */
    public SharedPreferences getSharedPreferences();

    /**
     * Save preferences.
     *
     * @param key   the key
     * @param value the value
     */
    public void saveStringPreference(String key, String value);

    /**
     * Save boolean preference.
     *
     * @param key   the key
     * @param value the value
     */
    public void saveBooleanPreference(String key, boolean value);

    /**
     * Save int preference.
     *
     * @param key   the key
     * @param value the value
     */
    public void saveIntPreference(String key, int value);

    /**
     * Save long preference.
     *
     * @param key   the key
     * @param value the value
     */
    public void saveLongPreference(String key, long value);

    /**
     * Read preferences.
     *
     * @param key the key
     * @return String the preference
     */
    public String getStringPreference(String key);

    /**
     * Read preferences.
     *
     * @param key      the key
     * @param defValue the def value
     * @return String the preference
     */
    public String getStringPreference(String key, String defValue);

    /**
     * Gets the boolean preference.
     *
     * @param key the key
     * @return boolean the preference
     */
    public boolean getBooleanPreference(String key);

    /**
     * Gets the boolean preference.
     *
     * @param key      the key
     * @param defValue the def value
     * @return boolean the preference
     */
    public boolean getBooleanPreference(String key, boolean defValue);

    /**
     * Gets the int preference.
     *
     * @param key the key
     * @return integer the preference
     */
    public int getIntPreference(String key);

    /**
     * Gets the int preference.
     *
     * @param key      the key
     * @param defValue the def value
     * @return integer the preference
     */
    public int getIntPreference(String key, int defValue);

    /**
     * Gets the long preference.
     *
     * @param key      the key
     * @param defValue the def value
     * @return long the preference
     */

    public long getLongPreference(String key, long defValue);

    /**
     * Remove preferences.
     *
     * @param key the key
     */
    public void removePreference(String key);

    /**
     * Clear all.
     */
    public void clearAll();
}
