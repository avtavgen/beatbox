package com.geo.beatbox;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class BeatBoxActivity extends SingleFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_beat_box);
    }

    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}
