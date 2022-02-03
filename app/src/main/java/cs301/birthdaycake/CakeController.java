package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
    private CakeView cakeViewRef;
    private CakeModel cakeModelRef;

    public CakeController (CakeView initCakeView) {
        this.cakeViewRef = initCakeView;
        this.cakeModelRef = this.cakeViewRef.getCakeModel();
    }

    @Override
    public void onClick(View button) {
        cakeModelRef.setCandlesIsLit(false);
        cakeViewRef.invalidate();
        Log.d("successTag", "Success");
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        cakeModelRef.initCandles(isChecked);
        cakeViewRef.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        cakeModelRef.setNumCandles(progress);
        cakeViewRef.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        //don't care
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        //not used
    }
}
