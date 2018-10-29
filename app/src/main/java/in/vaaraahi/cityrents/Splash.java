package in.vaaraahi.cityrents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import static java.lang.Thread.sleep;

public class Splash extends AppCompatActivity {
 ImageView iv;



    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        iv=findViewById(R.id.iv);

        Animation myanim=AnimationUtils.loadAnimation(this,R.anim.myanimation);
        iv.startAnimation(myanim);


        Thread myThread=new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    sleep(5000);
                    Intent i=new Intent(Splash.this,Imageslider.class);
                    startActivity(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
           myThread.start();

    }
}
