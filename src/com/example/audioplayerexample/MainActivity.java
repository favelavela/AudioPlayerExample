package com.example.audioplayerexample;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
  
public class MainActivity extends Activity {  
  
    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_main);  
          
        MediaPlayer mp=new MediaPlayer();  
        try{  
            mp.setDataSource("/sdcard/mujer_divina.mp3");//Write your location here  
            mp.prepare();  
            mp.start();  
              
        }catch(Exception e){e.printStackTrace();}  
          
    }  
  
}  
