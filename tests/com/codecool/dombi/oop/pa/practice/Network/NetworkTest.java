package com.codecool.dombi.oop.pa.practice.Network;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NetworkTest {
    Network network = new Network();


    //What to test? What is TDD?:D
    @DisplayName("Single test successful")
    @Test
    void testingSingleSuccess(){
        System.out.println("Success!");
    }

    // 1. I can add a Device to the Network
    @DisplayName("Add device to the network.")
    @Test
    void testingAddNewDeviceToTheNetwork(){
        DeviceWithScreen deviceWithScreen = new Normal();
    }
    // 2. I can add only Device to the network, or it throws a well-fit Exception


}