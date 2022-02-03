package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView cakeViewRef = findViewById(R.id.cakeview);
        CakeController controller = new CakeController(cakeViewRef);

        Button boButton = findViewById(R.id.blowOutButton);
        boButton.setOnClickListener(controller);
    }
}
