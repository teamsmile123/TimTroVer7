package example.com.timtro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 11/09/2017.
 */

public class MainActivity0 extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);
        Thread bamgio=new Thread(){
            public void run()
            {
                try {
                    sleep(5000);
                } catch (Exception e) {

                }
                finally
                {
                    Intent activitymoi=new Intent("example.com.timtro.MainActivity");
                    startActivity(activitymoi);
                }
            }
        };
        bamgio.start();
    }
    protected void onPause(){
        super.onPause();
        finish();
    }

}
