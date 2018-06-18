package me.ngima.signalview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;

public class BatteryLevelView extends android.support.v7.widget.AppCompatImageView {

    enum Signal {
        BATTERY_20,
        BATTERY_30,
        BATTERY_50,
        BATTERY_60,
        BATTERY_80,
        BATTERY_90,
        BATTERY_100,
    }

    private static final int[] SIGNAL = {R.attr.signal};

    private Signal mSignal = Signal.BATTERY_20;

    public BatteryLevelView(Context context) {
        super(context);
        init();
    }

    public BatteryLevelView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public BatteryLevelView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        refresh();
    }

    public Signal getSignal() {
        return mSignal;
    }

    public void setSignal(Signal signal) {
        this.mSignal = signal;
        refresh();
    }

    private void refresh() {

        switch (mSignal) {
            default:
            case BATTERY_20:
                setBackground(ContextCompat.getDrawable(getContext(), R.drawable.ic_battery_20));
                break;
            case BATTERY_30:
                setBackground(ContextCompat.getDrawable(getContext(), R.drawable.ic_battery_30));
                break;
            case BATTERY_50:
                setBackground(ContextCompat.getDrawable(getContext(), R.drawable.ic_battery_50));
                break;
            case BATTERY_60:
                setBackground(ContextCompat.getDrawable(getContext(), R.drawable.ic_battery_60));
                break;
            case BATTERY_80:
                setBackground(ContextCompat.getDrawable(getContext(), R.drawable.ic_battery_80));
                break;
            case BATTERY_90:
                setBackground(ContextCompat.getDrawable(getContext(), R.drawable.ic_battery_90));
                break;
            case BATTERY_100:
                setBackground(ContextCompat.getDrawable(getContext(), R.drawable.ic_battery_100));
                break;
        }
    }
}
