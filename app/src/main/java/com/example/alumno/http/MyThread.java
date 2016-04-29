package com.example.alumno.http;

import android.util.Log;

/**
 * Created by alumno on 28/04/2016.
 */

public class MyThread extends Thread{
    private String url="http://192.168.2.130:8080/android/clase6.xml";

    @Override
    public void run() {
        HttpManager http=new HttpManager(url);
    }
}
