package com.mezan.pccontrol;

import android.os.AsyncTask;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client extends AsyncTask<Void,Void,Void> {
    private String type = "";
    private String IP = "192.168.0.106";
    Client(String type){
        this.type = type;
    }
    @Override
    protected Void doInBackground(Void... arg0) {

            try {
                Socket client = new Socket(IP, 9999);
                OutputStream toServer = client.getOutputStream();
                DataOutputStream outputStream = new DataOutputStream(toServer);
                if (type.equals("shutdown"))
                    outputStream.writeBytes("shutdown");
                if (type.equals("restart"))
                    outputStream.writeBytes("restart");
                if (type.equals("music"))
                    outputStream.writeBytes("music");
            } catch (IOException e) {
                e.printStackTrace();
            }

        return null;
    }
}
