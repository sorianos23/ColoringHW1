/**
 * Bryan Soriano CS301 Homework 1
 */

package cs301.Coloring;

import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class DrawController implements SeekBar.OnSeekBarChangeListener, View.OnTouchListener{
    private DrawView dView;
    private DrawModel dModel;

    public TextView redVal;
    public TextView greenVal;
    public TextView blueVal;
    public SeekBar rSeek;
    public SeekBar gSeek;
    public SeekBar bSeek;

    public TextView title;

    public DrawController(DrawView dv, TextView red, TextView green, TextView blue,
                                SeekBar r, SeekBar g, SeekBar b, TextView t){
        dView = dv;
        dModel = dView.getDrawModel();
        this.redVal = red;
        this.greenVal = green;
        this.blueVal = blue;
        this.rSeek = r;
        this.gSeek = g;
        this.bSeek = b;
        this.title = t;

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int xx = (int) x;
        int yy = (int) y;

        if ((x < 700 && x > 100) && (y < 300 && y > 100)) {
            title.setText("Cloud");
            redVal.setText("" + dModel.redValueC);
            greenVal.setText("" + dModel.greenValueC);
            blueVal.setText("" + dModel.blueValueC);
            rSeek.setProgress(dModel.redValueC);
            gSeek.setProgress(dModel.greenValueC);
            bSeek.setProgress(dModel.blueValueC);
            dView.invalidate();
        } else if ((x > 900 && x < 1000) && (y > 500 && y < 800)) {
            title.setText("Trunk");
            redVal.setText("" + dModel.redValueT);
            greenVal.setText("" + dModel.greenValueT);
            blueVal.setText("" + dModel.blueValueT);
            rSeek.setProgress(dModel.redValueT);
            gSeek.setProgress(dModel.greenValueT);
            bSeek.setProgress(dModel.blueValueT);
            dView.invalidate();
        } else if ((x > 800 && x < 1100) && (y > 150 && y < 450)) {
            title.setText("Leaves");
            redVal.setText("" + dModel.redValueL);
            greenVal.setText("" + dModel.greenValueL);
            blueVal.setText("" + dModel.blueValueL);
            rSeek.setProgress(dModel.redValueL);
            gSeek.setProgress(dModel.greenValueL);
            bSeek.setProgress(dModel.blueValueL);
        } else if ((x > 1400 && x < 1600) && (y > 30 && y < 200)){
            title.setText("Sun");
            redVal.setText("" + dModel.redValueS);
            greenVal.setText("" + dModel.greenValueS);
            blueVal.setText("" + dModel.blueValueS);
            rSeek.setProgress(dModel.redValueS);
            gSeek.setProgress(dModel.greenValueS);
            bSeek.setProgress(dModel.blueValueS);
        } else if ((x > 1350 && x < 1650) && (y > 500 && y < 700)){
            title.setText("Boat");
            redVal.setText("" + dModel.redValueB);
            greenVal.setText("" + dModel.greenValueB);
            blueVal.setText("" + dModel.blueValueB);
            rSeek.setProgress(dModel.redValueB);
            gSeek.setProgress(dModel.greenValueB);
            bSeek.setProgress(dModel.blueValueB);
        } else if ((x > 1500 && x < 1700) && (y > 275 && y < 325)){
            title.setText("Flag");
            redVal.setText("" + dModel.redValueF);
            greenVal.setText("" + dModel.greenValueF);
            blueVal.setText("" + dModel.blueValueF);
            rSeek.setProgress(dModel.redValueF);
            gSeek.setProgress(dModel.greenValueF);
            bSeek.setProgress(dModel.blueValueF);
        }
        return false;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        if (title.getText().equals("Cloud")) {
            if (seekBar.getId() == rSeek.getId()) {
                dModel.redValueC = i;
                redVal.setText("" + dModel.redValueC);
                dView.setCloud(i, dModel.greenValueC, dModel.blueValueC);
                dView.invalidate();
            } else if (seekBar.getId() == gSeek.getId()) {
                dModel.greenValueC = i;
                greenVal.setText("" + dModel.greenValueC);
                dView.setCloud(dModel.redValueC, i, dModel.blueValueC);
                dView.invalidate();
            } else if (seekBar.getId() == bSeek.getId()) {
                dModel.blueValueC = i;
                blueVal.setText("" + dModel.blueValueC);
                dView.setCloud(dModel.redValueC, dModel.greenValueC, i);
                dView.invalidate();
            }
        } else if (title.getText().equals("Trunk")) {
            if (seekBar.getId() == rSeek.getId()) {
                dModel.redValueT = i;
                redVal.setText("" + dModel.redValueT);
                dView.setTrunk(i, dModel.greenValueT, dModel.blueValueT);
                dView.invalidate();
            } else if (seekBar.getId() == gSeek.getId()) {
                dModel.greenValueT = i;
                greenVal.setText("" + dModel.greenValueT);
                dView.setTrunk(dModel.redValueT, i, dModel.blueValueT);
                dView.invalidate();
            } else if (seekBar.getId() == bSeek.getId()) {
                dModel.blueValueT = i;
                blueVal.setText("" + dModel.blueValueT);
                dView.setTrunk(dModel.redValueT, dModel.greenValueT, i);
                dView.invalidate();
            }
        } else if (title.getText().equals("Leaves")){
            if (seekBar.getId() == rSeek.getId()) {
                dModel.redValueL = i;
                redVal.setText("" + dModel.redValueL);
                dView.setLeaves(i, dModel.greenValueL, dModel.blueValueL);
                dView.invalidate();
            } else if (seekBar.getId() == gSeek.getId()) {
                dModel.greenValueL = i;
                greenVal.setText("" + dModel.greenValueL);
                dView.setLeaves(dModel.redValueL, i, dModel.blueValueL);
                dView.invalidate();
            } else if (seekBar.getId() == bSeek.getId()) {
                dModel.blueValueL = i;
                blueVal.setText("" + dModel.blueValueL);
                dView.setLeaves(dModel.redValueL, dModel.greenValueL, i);
                dView.invalidate();
            }
        } else if (title.getText().equals("Sun")) {
            if (seekBar.getId() == rSeek.getId()) {
                dModel.redValueS = i;
                redVal.setText("" + dModel.redValueS);
                dView.setSun(i, dModel.greenValueS, dModel.blueValueS);
                dView.invalidate();
            } else if (seekBar.getId() == gSeek.getId()) {
                dModel.greenValueS = i;
                greenVal.setText("" + dModel.greenValueS);
                dView.setSun(dModel.redValueS, i, dModel.blueValueS);
                dView.invalidate();
            } else if (seekBar.getId() == bSeek.getId()) {
                dModel.blueValueS = i;
                blueVal.setText("" + dModel.blueValueS);
                dView.setSun(dModel.redValueS, dModel.greenValueS, i);
                dView.invalidate();
            }
        } else if (title.getText().equals("Flag")){
            if (seekBar.getId() == rSeek.getId()) {
                dModel.redValueF = i;
                redVal.setText("" + dModel.redValueF);
                dView.setFlag(i, dModel.greenValueF, dModel.blueValueF);
                dView.invalidate();
            } else if (seekBar.getId() == gSeek.getId()) {
                dModel.greenValueF = i;
                greenVal.setText("" + dModel.greenValueF);
                dView.setFlag(dModel.redValueF, i, dModel.blueValueF);
                dView.invalidate();
            } else if (seekBar.getId() == bSeek.getId()) {
                dModel.blueValueF = i;
                blueVal.setText("" + dModel.blueValueF);
                dView.setFlag(dModel.redValueF, dModel.greenValueF, i);
                dView.invalidate();
            }
        } else if (title.getText().equals("Boat")){
            if (seekBar.getId() == rSeek.getId()) {
                dModel.redValueB = i;
                redVal.setText("" + dModel.redValueB);
                dView.setBoat(i, dModel.greenValueB, dModel.blueValueB);
                dView.invalidate();
            } else if (seekBar.getId() == gSeek.getId()) {
                dModel.greenValueB = i;
                greenVal.setText("" + dModel.greenValueB);
                dView.setBoat(dModel.redValueB, i, dModel.blueValueB);
                dView.invalidate();
            } else if (seekBar.getId() == bSeek.getId()) {
                dModel.blueValueB = i;
                blueVal.setText("" + dModel.blueValueB);
                dView.setBoat(dModel.redValueB, dModel.greenValueB, i);
                dView.invalidate();
            }
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        //dont need
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        //dont need
    }
}
