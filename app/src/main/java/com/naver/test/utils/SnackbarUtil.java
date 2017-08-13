package com.naver.test.utils;

import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Created by namhoonkim on 13/08/2017.
 */

public class SnackbarUtil {


  public static void makeShortWithoutAction(View view, String message) {
    Snackbar.make(view, message, Snackbar.LENGTH_SHORT).show();
  }

  public static void makeLongWithoutAction(View view, String message) {
    Snackbar.make(view, message, Snackbar.LENGTH_LONG).show();
  }

}
