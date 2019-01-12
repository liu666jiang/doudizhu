package com;


import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JApplet;
 
public class MusicPlay extends Thread{
	
	public static AudioClip loadSound(String filename) {
		URL url = null;
		try {
			url = new URL("file:" + filename);
		} 
		catch (MalformedURLException e) {;}
		return JApplet.newAudioClip(url);
	}
	public void play() {
		AudioClip christmas = loadSound("music/Dreamers Never Sleep - ÈÎ¼ÎÂ×.wav");
		christmas.loop();
	}
	
}
