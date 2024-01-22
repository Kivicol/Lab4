package se.ifmo.ru.places;

import java.util.Objects;

public class Place extends AbsPlace {
    private Places type;

    public Place(String name){
        this.place_name = name;
        System.out.println("Место " + this.place_name + " создано");
    }
    public void placeCondition(String condition) {
        this.condition = condition;
        System.out.println("Состояние места (" + this.type.getName() + "): " + this.condition);
    }
    public void whatsgoing() {
        System.out.println("\033[36mВ месте (" + this.type.getName() + ") проиcходит:\033[0m \n");
    }
    public void whatstheplace() {
        System.out.println("(" + this.getType().getName() + ")");
    }

    public void setType(Places type){
        this.type = type;
        type_name = "";
        switch (type){
            case ROOM:
                type_name = "комната";
                break;
            case LADDER:
                type_name = "лестница";
                break;
            case CEILING:
                type_name = "потолок";
                break;
            case SHELVES:
                type_name = "полки";
                break;
            case DOOR:
                type_name = "дверь";
                break;
        }
        System.out.println(place_name +" инициализирована как " + "(" + type_name + ")");
    }

    @Override
    public Places getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o != null || this.getClass() != o.getClass()) return false;
        Place pl = (Place) o;
        return Objects.equals(this.type, pl.type) && Objects.equals(this.place_name, pl.place_name);

    }

}
