package cs301.birthdaycake;

import android.util.Log;
import android.view.View;

public class CakeController implements View.OnClickListener {
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
    }
}
