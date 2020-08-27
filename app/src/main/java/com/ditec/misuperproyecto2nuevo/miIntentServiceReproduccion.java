package com.ditec.misuperproyecto2nuevo;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

import androidx.annotation.NonNull;
import androidx.core.app.JobIntentService;

import java.io.IOException;

public class miIntentServiceReproduccion extends JobIntentService {
    static final int JOB_ID = 1000;
    static void enqueueWork(Context context, Intent work) {
        enqueueWork(context, miIntentServiceReproduccion.class, JOB_ID, work);
    }
    @Override
    protected void onHandleWork(@NonNull Intent intent) {
        try {
            Multimedia3.mediaPlayer.setDataSource("https://migrandiosaappwilson.000webhostapp.com/dancing.mp3");
            Multimedia3.mediaPlayer.prepare();
        } catch (IOException e) {
        }
    }
}