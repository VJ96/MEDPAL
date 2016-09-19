package com.example.vijay.medpal;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;
import org.json.JSONException;
import org.json.JSONObject;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.net.UnknownHostException;

/**
 * Created by vijai on 28-Aug-16.
 */
public class db extends AsyncTask<String,Void,String> {
    Context ctx;
    db(Context ctx){
        this.ctx=ctx;
    }


    @Override
    protected String doInBackground(String... args){



        String n=args[0];String e=args[0];String u=args[0];String p=args[0];
        String url="http:/192.168.43.64/reg.php";




        JSONObject jsonobject;
        final JSONParser jParser2 = new JSONParser();
        List<NameValuePair> params2 = new ArrayList<NameValuePair>();
        params2.add(new BasicNameValuePair("name", n));
        params2.add(new BasicNameValuePair("email", e));
        params2.add(new BasicNameValuePair("username", u));
        params2.add(new BasicNameValuePair("password", p));

        jsonobject = jParser2.makeHttpRequest(url, "POST", params2);


        try{
            if(jsonobject!=null) {


                String result = jsonobject.getString(" success");
                //return result;


            }






        } catch (JSONException e1) {
            e1.printStackTrace();
        }
        return "";


    }




    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(String result){
        Toast.makeText(ctx, result, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onProgressUpdate(Void...values ){
        super.onProgressUpdate(values);
    }


}