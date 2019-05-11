package com.example.smartflix;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.smartflix.ui.login.LoginActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        Handler delay = new Handler (  );
        delay.postDelayed ( new Runnable () {
            @Override
            public void run() {
                showLogin ();
            }
        }, 2000 );
    }

    public void showLogin() {
        Intent login = new Intent ( MainActivity.this, LoginActivity.class );
        startActivity ( login );
        finish ();
    }
}
