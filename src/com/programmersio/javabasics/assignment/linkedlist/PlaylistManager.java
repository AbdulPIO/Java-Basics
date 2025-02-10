package com.programmersio.javabasics.assignment.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

class Song {
    private String title;
    private String artist;
    private double duration;

    public Song(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Song{Title='" + title + "', Artist='" + artist + "', Duration=" + duration + " min}";
    }
}

public class PlaylistManager {
    private static LinkedList<Song> playlist = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nPlaylist Manager");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Play Songs");
            System.out.println("4. Display Playlist");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addSong();
                    break;
                case 2:
                    removeSong();
                    break;
                case 3:
                    playSongs();
                    break;
                case 4:
                    displayPlaylist();
                    break;
                case 5:
                    System.out.println("Exiting Playlist Manager...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void addSong() {
        System.out.print("Enter song title: ");
        String title = scanner.nextLine();
        System.out.print("Enter artist name: ");
        String artist = scanner.nextLine();
        System.out.print("Enter song duration (minutes): ");
        double duration = scanner.nextDouble();

        playlist.add(new Song(title, artist, duration));
        System.out.println("Song added to the playlist!");
    }

    private static void removeSong() {
        System.out.print("Enter song title to remove: ");
        String title = scanner.nextLine();

        ListIterator<Song> iterator = playlist.listIterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Song song = iterator.next();
            if (song.getTitle().equalsIgnoreCase(title)) {
                iterator.remove();
                found = true;
                System.out.println("Song removed from the playlist.");
                break;
            }
        }

        if (!found) {
            System.out.println("Song not found.");
        }
    }

    private static void playSongs() {
        if (playlist.isEmpty()) {
            System.out.println("The playlist is empty!");
            return;
        }

        ListIterator<Song> iterator = playlist.listIterator();
        System.out.println("\nPlaying Songs...");

        while (iterator.hasNext()) {
            System.out.println("Now Playing: " + iterator.next());
            System.out.println("Press Enter to play next...");
            scanner.nextLine();
        }
        System.out.println("End of Playlist.");
    }

    private static void displayPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("The playlist is empty!");
            return;
        }

        System.out.println("\nCurrent Playlist:");
        for (Song song : playlist) {
            System.out.println(song);
        }
    }
}
