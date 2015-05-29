package com.geek_iit.www.myapplication;

/*
 * Created By Mohamed Bouhamed
 *  Creating a Music Player
 *
 * WWW.GEEK-IIT.COM - May 2015
 */

public class Song {
	
	private long id;
	private String title;
	private String artist;
	//this our constructor
	public Song(long songID, String songTitle, String songArtist){
		id=songID;
		title=songTitle;
		artist=songArtist;
	}
	//this methode return the son id
	public long getID(){return id;}
	//this methode return the son title
	public String getTitle(){return title;}
	//this methode return the son artist name
	public String getArtist(){return artist;}

}
