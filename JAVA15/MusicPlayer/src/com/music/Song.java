package com.music;

public class Song {
	String title;
	double duration;
	public Song(String name, double duration) {
		super();
		this.title = name;
		this.duration = duration;
	}
	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", duration=" + duration + "]";
	}
	
	
	
}
