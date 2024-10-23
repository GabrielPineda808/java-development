package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RoomTest {

    @org.junit.jupiter.api.Test
    void checkIn_isOccupied() {
        Room room = new Room();
        room.checkIn();

        assertTrue(room.isOccupied(), "The room is occupied");
    }

    @org.junit.jupiter.api.Test
    void checkIn_isDirty() {
        Room room = new Room();
        room.checkIn();

        assertTrue(room.isDirty(), "The room is dirty");
    }

    @org.junit.jupiter.api.Test
    void checkIn_canCheckIn() {
        Room room = new Room();

        assertFalse(room.isDirty(), "The room is not dirty");
        assertFalse(room.isOccupied(), "The room is not occupied");
    }

    @Test
    void checkOut_isOccupied() {
        Room room = new Room();
        room.checkOut();

        assertFalse(room.isOccupied(), "The room is not occupied");
    }
    @Test
    void cleanRoom_isNotDirty() {
        Room room = new Room();
        room.checkOut();

        assertFalse(room.isDirty(), "The room is clean");
    }

    @Test
    void cleanRoom_canClean() {
        Room room = new Room();

        assertTrue(room.isOccupied(), "The room is occupied. You cannot clean this room.");
    }





}