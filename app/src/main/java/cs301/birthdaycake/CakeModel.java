package cs301.birthdaycake;

public class CakeModel {

    public boolean candlesIsLit = true;
    public int numCandles = 2;
    boolean hasFrosting = true;
    boolean hasCandles = true;

    public void setCandlesIsLit(boolean initLit) {
        this.candlesIsLit = initLit;
    }

    public boolean getLit() {
        return this.candlesIsLit;
    }
}
