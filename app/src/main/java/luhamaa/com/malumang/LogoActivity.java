package luhamaa.com.malumang;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LogoActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT= 400;

    @Override
    protected void onCreate (Bundle savedIstanceState) {
        super.onCreate(savedIstanceState) ;
        setContentView(R.layout.activity_logo);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(getApplicationContext(), StartActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }


}
