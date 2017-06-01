package com.geo.beatbox;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.databinding.adapters.SeekBarBindingAdapter;
import android.view.View;
import android.widget.SeekBar;

public class SoundViewModel extends BaseObservable{

    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox beatBox) {
        mBeatBox = beatBox;
    }

    public Sound getSound() {
        return mSound;
    }

    public void setSound(Sound sound) {
        mSound = sound;
        notifyChange();
    }

    @Bindable
    public String getTitle() {
        return mSound.getName();
    }

    public void onButtonClicked() {
        mBeatBox.play(mSound);
    }

    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        BeatBox.setSoundRate((float)progress);
    }
}
