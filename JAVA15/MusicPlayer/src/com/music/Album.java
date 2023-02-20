package com.music;

import java.util.*;

public class Album {
	
	private String name;
	private String artist;
	private ArrayList<Song> songs;
	public Album(String name, String artist) {
		super();
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<Song>();
	}
	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Song findSong(String title) {
		for(Song checkedSong:songs) {
			if(checkedSong.getTitle().equals(title)) {
				return checkedSong;
			}
		}
		return null;
	}
	public boolean addSong(String title,double duration) {
		if(findSong(title)==null) {
			songs.add(new Song(title,duration));
			System.out.println(title+" successfully added");
			return true;
		}else {
			System.out.println("Song with name "+title+" already exist in the list");
			return false;
		}
	}
	
	public boolean addToPlayList(int trackNumber,LinkedList<Song>playList) {
		int index = trackNumber-1;
		if(index>0 && index<=this.songs.size()) {
			playList.add(this.songs.get(index));
			return true;
		}
		System.out.println("this album does not have song with tracknumber "+trackNumber);
		return false;
	}
	
	public boolean addToPlayList(String title,LinkedList<Song>playList) {
		for(Song checkedSong:this.songs) {
			if(checkedSong.getTitle().equals(title));
			{
				playList.add(checkedSong);
				return true;
			}
		}
		System.out.println("their is no suck song in album");
		return false;
	}
	
}
