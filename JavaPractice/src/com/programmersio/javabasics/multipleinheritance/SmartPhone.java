package com.programmersio.javabasics.multipleinheritance;

public class SmartPhone implements Camera, MusicPlayer, Phone {

    @Override
    public void takePhoto() {
        System.out.println("Taking photo with smartphone");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video with smartphone");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music on smartphone");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Calling "+number+" on smartphone");
    }

    @Override
    public void endCall() {
        System.out.println("Ending call on smartphone");
    }
}
