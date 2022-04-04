package com.company.BuilderFinal;

public class Wall implements Material{
    private Room room1, room2;
    private String direction;

    public Wall(int room1, int room2, String direction) {
        this.room1 = new Room(room1);
        this.room2 = new Room(room2);
        this.direction = direction;
    }

    @Override
    public void enter() {
        System.out.println("there is a wall between room: " + room1.getRoom_number() + " and room " + room2.getRoom_number()
        + " on direction: " + this.direction);
    }
}
