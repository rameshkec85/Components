package com.andhradroid.common.components.preferences;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Ramesh on 9/3/16.
 */
public class PreferenceEndPointImpl implements PreferenceEndPoint {
    /**
     * The m name.
     */
    private final String mName;

    /**
     * The m context.
     */
    private final Context mContext;

    /**
     * Instantiates a new preferences end point impl.
     *
     * @param context the context
     * @param name    the name
     */
    public PreferenceEndPointImpl(final Context context, final String name) {
        mContext = context;
        mName = name;
    }

    /**
     * Save boolean preference.
     *
     * @param key   the key
     * @param value the value
     * @see PreferenceEndPoint#saveBooleanPreference(java.lang.String, boolean)
     */
    @SuppressLint("CommitPrefEdits")
    @Override
    public void saveBooleanPreference(final String key, final boolean value) {
        final SharedPreferences settings = getSharedPreferences();
        final SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean(key, value);
        closeEditor(editor);
    }

    /**
     * Save int preference.
     *
     * @param key   the key
     * @param value the value
     * @see PreferenceEndPoint#saveIntPreference(java.lang.String, int)
     */
    @SuppressLint("CommitPrefEdits")
    @Override
    public void saveIntPreference(final String key, final int value) {
        final SharedPreferences settings = getSharedPreferences();
        final SharedPreferences.Editor editor = settings.edit();
        editor.putInt(key, value);
        closeEditor(editor);
    }

    /**
     * Save long preference.
     *
     * @param key   the key
     * @param value the value
     * @see PreferenceEndPoint#saveLongPreference(java.lang.String, long)
     */
    @SuppressLint("CommitPrefEdits")
    @Override
    public void saveLongPreference(final String key, final long value) {
        final SharedPreferences settings = getSharedPreferences();
        final SharedPreferences.Editor editor = settings.edit();
        editor.putLong(key, value);
        closeEditor(editor);
    }

    /**
     * Save string preference.
     *
     * @param key   the key
     * @param value the value
     * @see PreferenceEndPoint#saveStringPreference(java.lang.String, java.lang.String)
     */
    @SuppressLint("CommitPrefEdits")
    @Override
    public void saveStringPreference(final String key, final String value) {
        final SharedPreferences settings = getSharedPreferences();
        final SharedPreferences.Editor editor = settings.edit();
        editor.putString(key, value);
        closeEditor(editor);
    }

    /**
     * Gets the shared preferences.
     *
     * @return the shared preferences
     * @see PreferenceEndPoint#getSharedPreferences()
     */
    @Override
    public SharedPreferences getSharedPreferences() {
        return mContext.getSharedPreferences(mName, 0);
    }

    /**
     * Gets the boolean preference.
     *
     * @param key the key
     * @return the boolean preference
     * @see PreferenceEndPoint#getBooleanPreference(java.lang.String)
     */
    @Override
    public boolean getBooleanPreference(final String key) {
        // Restore preferences
        return getSharedPreferences().getBoolean(key, false);
    }

    /**
     * Gets the boolean preference.
     *
     * @param key      the key
     * @param defValue the def value
     * @return the boolean preference
     * @see PreferenceEndPoint#getBooleanPreference(java.lang.String, boolean)
     */
    @Override
    public boolean getBooleanPreference(final String key, final boolean defValue) {
        return getSharedPreferences().getBoolean(key, defValue);
    }

    /**
     * Gets the int preference.
     *
     * @param key the key
     * @return the int preference
     * @see PreferenceEndPoint#getIntPreference(java.lang.String)
     */
    @Override
    public int getIntPreference(final String key) {
        return getSharedPreferences().getInt(key, 0);
    }

    /**
     * Gets the int preference.
     *
     * @param key      the key
     * @param defValue the def value
     * @return the int preference
     * @see PreferenceEndPoint#getIntPreference(java.lang.String, int)
     */
    @Override
    public int getIntPreference(final String key, final int defValue) {
        return getSharedPreferences().getInt(key, defValue);
    }

    /**
     * Gets the long preference.
     *
     * @param key      the key
     * @param defValue the def value
     * @return the long preference
     * @see PreferenceEndPoint#getLongPreference(java.lang.String, long)
     */
    @Override
    public long getLongPreference(final String key, final long defValue) {
        return getSharedPreferences().getLong(key, defValue);
    }

    /**
     * Gets the string preference.
     *
     * @param key the key
     * @return the string preference
     * @see PreferenceEndPoint#getStringPreference(java.lang.String)
     */
    @Override
    public String getStringPreference(final String key) {
        return getSharedPreferences().getString(key, "");
    }

    /**
     * Gets the string preference.
     *
     * @param key      the key
     * @param defValue the def value
     * @return the string preference
     * @see PreferenceEndPoint#getStringPreference(java.lang.String, java.lang.String)
     */
    @Override
    public String getStringPreference(final String key, final String defValue) {
        return getSharedPreferences().getString(key, defValue);
    }

    /**
     * Removes the preference.
     *
     * @param key the key
     * @see PreferenceEndPoint#removePreference(java.lang.String)
     */
    @Override
    public void removePreference(final String key) {
        final SharedPreferences settings = getSharedPreferences();
        final SharedPreferences.Editor editor = settings.edit();
        editor.remove(key);
        closeEditor(editor);
    }

    /**
     * Clear all.
     *
     * @see PreferenceEndPoint#clearAll()
     */
    @Override
    public void clearAll() {
        final SharedPreferences settings = getSharedPreferences();
        final SharedPreferences.Editor editor = settings.edit();
        editor.clear();
        editor.commit();
    }

    /**
     * Close editor.
     *
     * @param editor the editor
     */
    private void closeEditor(final SharedPreferences.Editor editor) {
        editor.commit();
    }
}
