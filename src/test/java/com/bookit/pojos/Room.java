package com.bookit.pojos;

import java.util.Objects;

public class Room implements Comparable<Room>{
     private String id;
     private String name;
     private String description;
     private int capacity;
     private String withTV;
     private String withWhiteBoard;

    public Room() {
    }

    public Room(String name, String description, int capacity, String withTV, String withWhiteBoard) {
        this.name = name;
        this.description = description;
        this.capacity = capacity;
        this.withTV = withTV;
        this.withWhiteBoard = withWhiteBoard;
    }

    public Room(String id, String name, String description, int capacity, String withTV, String withWhiteBoard) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.capacity = capacity;
        this.withTV = withTV;
        this.withWhiteBoard = withWhiteBoard;
    }

    //This checks if any two objects are equals or not... I have created it by using generate shortcut...
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(id, room.id) &&
                Objects.equals(name, room.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getWithTV() {
        return withTV;
    }

    public void setWithTV(String withTV) {
        this.withTV = withTV;
    }

    public String getWithWhiteBoard() {
        return withWhiteBoard;
    }

    public void setWithWhiteBoard(String withWhiteBoard) {
        this.withWhiteBoard = withWhiteBoard;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", capacity=" + capacity +
                ", withTV='" + withTV + '\'' +
                ", withWhiteBoard='" + withWhiteBoard + '\'' +
                '}';
    }

    @Override
    public int compareTo(Room o) {
        return this.name.compareTo(o.getName());
    }
}
