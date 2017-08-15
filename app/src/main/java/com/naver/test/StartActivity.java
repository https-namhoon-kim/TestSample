package com.naver.test;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import com.naver.test.utils.SnackbarUtil;

public class StartActivity extends AppCompatActivity
    implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

  private Button mLoginButotn;
  private Button mDecommissioningButton;


  public interface Callback {
    void onSuccess();
    void onFailed();
  }


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_start);

    init();
  }


  private void init() {
    // TODO : Button
    mLoginButotn = (Button) findViewById(R.id.login_button);
    mLoginButotn.setOnClickListener(this);
    mDecommissioningButton = (Button) findViewById(R.id.decommissioning_button);
    mDecommissioningButton.setOnClickListener(this);

    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
        this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
    drawer.setDrawerListener(toggle);
    toggle.syncState();

    NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
    navigationView.setNavigationItemSelectedListener(this);
  }


  @Override
  public void onClick(View v) {
    switch (v.getId()) {
      case R.id.login_button:
        onClickLoginButton();
        break;
      case R.id.decommissioning_button:
        onClickDecommissioningButotn();
        break;
    }
  }

  private void onClickLoginButton() {
    // TODO 네이버 로그인 시도
    onStartNaverLogin(new Callback() {
      @Override
      public void onSuccess() {
        // TODO 타원곡선 키 생성
        // TODO 키소토어에 키쌍 저장
        // TODO Fingerprint 권한 인증

      }

      @Override
      public void onFailed() {

      }
    });
  }

  public void onStartNaverLogin(Callback callback) {
    boolean result = true;
    if(result) {
      callback.onSuccess();
    }
    else {
      callback.onFailed();
    }
  }


  private void onClickDecommissioningButotn() {

  }



















  @Override
  public void onBackPressed() {
    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    if (drawer.isDrawerOpen(GravityCompat.START)) {
      drawer.closeDrawer(GravityCompat.START);
    } else {
      super.onBackPressed();
    }
  }


  @SuppressWarnings("StatementWithEmptyBody")
  @Override
  public boolean onNavigationItemSelected(MenuItem item) {
    // Handle navigation view item clicks here.
    int id = item.getItemId();

    if (id == R.id.nav_camera) {
      // Handle the camera action
    } else if (id == R.id.nav_gallery) {

    } else if (id == R.id.nav_slideshow) {

    } else if (id == R.id.nav_manage) {

    } else if (id == R.id.nav_share) {

    } else if (id == R.id.nav_send) {

    }

    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    drawer.closeDrawer(GravityCompat.START);
    return true;
  }
}