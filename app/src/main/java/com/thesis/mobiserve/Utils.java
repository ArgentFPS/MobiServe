package com.thesis.mobiserve;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;

import androidx.core.content.ContextCompat;

public class Utils
{

    public static void changerStatusbarAndNavigationBarColor(Activity activity, int statusBarColor, int navigationColor)
    {
        Window window = activity.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(activity,statusBarColor));
        window.setNavigationBarColor(ContextCompat.getColor(activity,statusBarColor));

    }
}
