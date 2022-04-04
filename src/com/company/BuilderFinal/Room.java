package com.company.BuilderFinal;

public class Room implements Material{
    private int room_number;

    public Room(int room_number) {
        this.room_number = room_number;
    }

    @Override
    public void enter() {
        System.out.println("entered room number: "+ room_number);
    }

    public int getRoom_number(){
        return this.room_number;
    }
}
