package com.example.singleton;
public class Main {
    public static void main(String[] args) {
        System.out.println("Attempting to access Singleton.");
        Singleton instanceOne = Singleton.getInstance();
        instanceOne.logStatus();
        Singleton instanceTwo = Singleton.getInstance();
        if (instanceOne == instanceTwo) {
            System.out.println("Verified: Both references point to the SAME Singleton instance.");
        } else {
            System.out.println("Error: Different instances found!");
        }
    }
}
