package org.isoron.uhabits;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;

public class LogOut extends Activity {

    private Intent mMainIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        mMainIntent = new Intent(this, SplashActivity.class);
        FacebookSdk.sdkInitialize(getApplicationContext());
        LoginManager.getInstance().logOut();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_out);

        startActivity(mMainIntent);
    }
}
