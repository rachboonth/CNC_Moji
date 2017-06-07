package com.example.android.cnc_moji;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;


public class myAsyncUpdate extends AsyncTask<Void, Integer, String> {
    Context context;


    String TAG = getClass().getSimpleName();
    @Override
    protected void onPreExecute (){
        super.onPreExecute();
        Log.e(TAG + " PreExceute","On pre Exceute......");
    }

    @Override
    protected String doInBackground(Void... arg0) {
        for(int i = 0; i < 5; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return "Executed";
    }
    @Override
    protected void onProgressUpdate(Integer...a){
        super.onProgressUpdate(a);
        Log.e(TAG + " onProgressUpdate", "You are in progress update ... " + a[0]);
    }
    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        Log.e(TAG + " onPostExecute", "" + result);
    }
}


// new myAsyncUpdate().execute("http://devahoy.com");
// new myAsyncUpdate().execute();
