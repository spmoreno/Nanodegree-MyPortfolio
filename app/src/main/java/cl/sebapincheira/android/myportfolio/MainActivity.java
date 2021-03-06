package cl.sebapincheira.android.myportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openApp(View iView) {

        Toast vMsg;
        String vText = null;
        Integer vApp = iView.getId();


        switch (vApp){
            case R.id.button_spotify:
                vText = "Spotify Streamer";
                break;

            case R.id.button_scores:
                vText = "Scores";
                break;

            case R.id.button_library:
                vText = "Library";
                break;

            case R.id.button_built:
                vText = "Built";
                break;

            case R.id.button_xyz:
                vText = "XYZ";
                break;

            case R.id.button_capstone:
                vText = "Capstone";
                break;

        }

        vMsg = Toast.makeText(getApplicationContext(), vText, Toast.LENGTH_SHORT);

        vMsg.show();

    }
}
