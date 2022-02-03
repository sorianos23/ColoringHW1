package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView cakeRef = findViewById(R.id.cakeview);
        CakeController controller = new CakeController(cakeRef);

        Button boButton = findViewById(R.id.blowOutButton);
        boButton.setOnClickListener(controller);

        Switch candles = findViewById(R.id.candlesSwitch);
        candles.setOnCheckedChangeListener(controller);

        SeekBar numCandles = findViewById(R.id.numCandlesSB);
        numCandles.setOnSeekBarChangeListener(controller);
    }
}
