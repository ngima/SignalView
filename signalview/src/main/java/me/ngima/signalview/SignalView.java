package me.ngima.signalview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;

public class SignalView extends android.support.v7.widget.AppCompatImageView {

    enum Signal {
        STATE_SIGNAL_0,
        STATE_SIGNAL_1,
        STATE_SIGNAL_2,
        STATE_SIGNAL_3,
        STATE_SIGNAL_4
    }

    private static final int[] SIGNAL = {R.attr.signal};

    private Signal mSignal = Signal.STATE_SIGNAL_0;

    public SignalView(Context context) {
        super(context);
        init();
    }

    public SignalView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SignalView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        refresh();
    }

    public Signal getSignal() {
        return mSignal;
    }

    public void mapAndSetSignal(int signal) {
        if (signal >= -40) mSignal = Signal.STATE_SIGNAL_4;
        else if (signal >= -60) mSignal = Signal.STATE_SIGNAL_3;
        else if (signal >= -80) mSignal = Signal.STATE_SIGNAL_2;
        else if (signal >= -90) mSignal = Signal.STATE_SIGNAL_1;
        else mSignal = Signal.STATE_SIGNAL_0;
    }

    public void setSignal(Signal signal) {
        this.mSignal = signal;
        refresh();
    }

    private void refresh() {

        switch (mSignal) {
            default:
            case STATE_SIGNAL_0:
                setBackground(ContextCompat.getDrawable(getContext(), R.drawable.ic_signal_wifi_0));
                break;
            case STATE_SIGNAL_1:
                setBackground(ContextCompat.getDrawable(getContext(), R.drawable.ic_signal_wifi_1));
                break;
            case STATE_SIGNAL_2:
                setBackground(ContextCompat.getDrawable(getContext(), R.drawable.ic_signal_wifi_2));
                break;
            case STATE_SIGNAL_3:
                setBackground(ContextCompat.getDrawable(getContext(), R.drawable.ic_signal_wifi_3));
                break;
            case STATE_SIGNAL_4:
                setBackground(ContextCompat.getDrawable(getContext(), R.drawable.ic_signal_wifi_4));
                break;
        }
    }
}
