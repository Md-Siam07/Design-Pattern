package com.company.BuilderFinal;

public class Door implements Material{
    private Room roomFrom, roomTo;

    public Door(int roomFrom, int roomTo) {
        this.roomFrom = new Room(roomFrom);
        this.roomTo = new Room(roomTo);
    }

    @Override
    public void enter() {
        System.out.println("There is a door between room: "+ roomFrom.getRoom_number()+ " to: "+ roomTo.getRoom_number());
    }
}
