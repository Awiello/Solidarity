package com.furiouskitten.amiel.solidarity.Util;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.widget.Toast;

import com.furiouskitten.amiel.solidarity.R;


public class Util {

    private static final String SHARED_PREFERENCES_NAME = "DictionaryPreferences";
    private static final int N_USES_BEFORE_RATE = 3;

    public static String getApiEndpoint(Context c) {
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(c);
        return sharedPref.getString("apiEndpoint", c.getString(R.string.api_endpoint));
    }

    public static void launchGooglePlay(Context c) {
        Uri uri = Uri.parse("market://details?id=" + c.getPackageName());
        Intent myAppLinkToMarket = new Intent(Intent.ACTION_VIEW, uri);
        try {
            c.startActivity(myAppLinkToMarket);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(c, R.string.something_went_wrong, Toast.LENGTH_LONG).show();
        }
    }

    public static String getLastWord(Context c) {
        return c.getSharedPreferences(SHARED_PREFERENCES_NAME, c.MODE_PRIVATE)
                .getString("lastWord", null);
    }

    public static void setLastWord(Context c, String word) {
        c.getSharedPreferences(SHARED_PREFERENCES_NAME, c.MODE_PRIVATE).edit()
                .putString("lastWord", word).commit();
    }

    public static boolean showRatePopUp(Context c) {
        SharedPreferences sharedPreferences = c.getSharedPreferences(SHARED_PREFERENCES_NAME,
                c.MODE_PRIVATE);
        int usage = sharedPreferences.getInt("usage", 0);

        if(usage == N_USES_BEFORE_RATE)
            return true;

        sharedPreferences.edit().putInt("usage", usage++);

        return false;
    }

    private static void generateDialog(Context c, int title, int message,
                                       DialogInterface.OnClickListener okButton) {
        AlertDialog.Builder adBuilder = new AlertDialog.Builder(c);
        adBuilder.setMessage(message);
        adBuilder.setTitle(title);
        adBuilder.setCancelable(true);
        adBuilder.setPositiveButton(android.R.string.ok, okButton);
        AlertDialog adFinal = adBuilder.create();
        adFinal.show();
    }
}
