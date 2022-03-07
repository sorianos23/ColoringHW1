/**
 * Bryan Soriano CS301 Homework 1
 */

package cs301.Coloring;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import cs301.Coloring.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        TextView title = findViewById(R.id.textView);
        TextView redVal = findViewById(R.id.redTextV);
        TextView greenVal = findViewById(R.id.greenTextV);
        TextView blueVal = findViewById(R.id.blueTextV);

        SeekBar rSeekBar = findViewById(R.id.redSeekBar);
        SeekBar gSeekBar = findViewById(R.id.greenSeekBar);
        SeekBar bSeekBar = findViewById(R.id.blueSeekBar);

        DrawView drawView = findViewById(R.id.drawview);
        DrawController controller = new DrawController(drawView, redVal, greenVal, blueVal, rSeekBar, gSeekBar, bSeekBar, title);
        DrawModel drawModel = drawView.getDrawModel();

        rSeekBar.setOnSeekBarChangeListener(controller);

        gSeekBar.setOnSeekBarChangeListener(controller);

        bSeekBar.setOnSeekBarChangeListener(controller);

        drawView.setOnTouchListener(controller);
    }
}
