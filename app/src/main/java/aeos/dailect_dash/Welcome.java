package aeos.dailect_dash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Button Playbutton=(Button) findViewById(R.id.Play_Button);
        Playbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Welcome.this,Round.class));
            }
        });
    }

      /*Method one- Did not work
      public void onClick(View view) {
        if(view.getId()==(R.id.Play_Button)) {
            startActivity(new Intent(Welcome.this,Round.class));
        }
      }*/


}
