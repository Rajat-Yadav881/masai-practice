package com.music;

import java.awt.desktop.QuitEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	private static ArrayList<Album>albums = new ArrayList<>();
	public static void main(String[] args) {
		
		Album album = new Album("linkiin Park","AC/DC");
		album.addSong("TNT",4.5);
		album.addSong("highway to hell",2.8);
		album.addSong("thunderstruck",3.6);
		album.addSong("cruse",2.9);
		album.addSong("walkIn",5.5);
		
		Album album2 = new Album("album2","eminem");
		album.addSong("rapgod",3.5);
		album.addSong("godzilla",4.8);
		album.addSong("looseyourSelf",4.6);
		album.addSong("Not Afriad",3.9);
		album.addSong("Deep",2.5);
		
		albums.add(album);
		albums.add(album2);
		
		LinkedList<Song>playList_1 = new LinkedList<>();
		albums.get(0).addToPlayList("TNT", playList_1);
		albums.get(0).addToPlayList("thunderstruck", playList_1);
		albums.get(1).addToPlayList("rapgod", playList_1);
		albums.get(1).addToPlayList("godzilla", playList_1);
		
		play(playList_1);
	}
	
	private static void play(LinkedList<Song>playList) {
		Scanner sc = new Scanner(System.in);
		boolean qt = false;
		boolean forward = true;
		ListIterator<Song> listIterator = playList.listIterator();
		
		if(playList.size()==0) {
			System.out.println("the playList have no song");
		}else {
			System.out.println("now playing "+listIterator.next().toString());
			printMenu();
		}
		while(!qt) {
			int action = sc.nextInt();
			sc.nextLine();
			switch(action) {
			case 0:
				System.out.println("plalist complete");
				qt = true;
				break;
			case 1:
				if(!forward) {
					if(listIterator.hasNext()) {
						listIterator.next();
					}
					forward = true;
				}
				if(listIterator.hasNext()) {
					System.out.println("now playing "+listIterator.next().toString());
				}else {
					System.out.println("no song avilable reached to the end of the list");
					forward = false;
				}
				break;
			case 2:
				if(forward) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					forward = true;
				}
				if(listIterator.hasPrevious()) {
					System.out.println("now playing "+listIterator.previous().toString());
				}else {
					System.out.println("we are the first song");
					forward = false;
				}
				break;
			case 3:
				if(forward) {
					if(listIterator.hasPrevious()) {
						System.out.println("now playing "+listIterator.previous().toString());
						forward = false;
					}else {
						System.out.println("we are the start to the list");
					}
				}else {
					if(listIterator.hasNext()) {
						System.out.println("now playing "+listIterator.next().toString());
						forward = true;
					}else {
						System.out.println("we have the reached to the end of the list");
					}
				}
				break;
			case 4:
				printList(playList);
				break;
			case 5:
				printMenu();
				break;
			case 6:
				if(playList.size()>0) {
					listIterator.remove();
					if(listIterator.hasNext()) {
						System.out.println("now playing "+listIterator.next().toString());
						
					}else {
						if(listIterator.hasPrevious()) {
							System.out.println("now playing "+listIterator.previous().toString());
						}
					}
				}
			}		break;
		}
	}
	private static void printMenu() {
		System.out.println("Availabe options\n press");
		System.out.println("0 - to quit\n"+"1 - to play next Song\n"+"2 - to play the previous song\n"+"3 - to replay the current song\n"+"4 - List of all the songs \n"+"5 - print all avaiable options\n"+"6 - delete current Song");
	}
	private static void printList(LinkedList<Song>playList) {
		Iterator<Song>iterator = playList.iterator();
		System.out.println("-----------------");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("-----------------");
	}
}
