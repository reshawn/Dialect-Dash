package aeos.dailect_dash;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Round extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_round);

        //timer code, to be moved once the firebase code is added so that the timer would begin
        // only when the phrases have loaded from the database
        final TextView timerTxt = (TextView) findViewById(R.id.Time_left);
        timerTxt.setTextSize(30);
        new CountDownTimer(8000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timerTxt.setText(String.valueOf((millisUntilFinished/1000)-1));

                if (millisUntilFinished<=6000) {
                    Animation shake = AnimationUtils.loadAnimation(Round.this, R.anim.shake);
                    Button y = (Button) findViewById(R.id.Yes_Button);
                    Button n = (Button) findViewById(R.id.No_Button);
                    timerTxt.startAnimation(shake);
                    y.startAnimation(shake);
                    n.startAnimation(shake);
                }

            }

            @Override
            public void onFinish() {
                //session update comes here as well for time out
            }
        }.start();
    }
}
