package com.kings.savionwharton.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.io.EOFException;

/**
 * Created by SavionWharton on 14/10/2017.
 */

public class audio_fragment extends Fragment {

    private static final String TAG = "MainActivity";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_audio, null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final MediaPlayer mediaPlayer = MediaPlayer.create(getActivity().getApplicationContext(),R.raw.sample2);



        view.findViewById(R.id.s_tone).setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
    }
});
view.findViewById(R.id.volume).setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        mediaPlayer.stop();
        try
        {
            mediaPlayer.prepare();
        }
        catch(java.io.IOException e){
            Log.e(TAG, "FAILLLLLL");
        };



    }
});
        view.findViewById(R.id.reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
}}