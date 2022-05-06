package visitor.element;

import visitor.visitor.BuildingVisitor;

import java.util.List;

public class Floor implements Element {
    private int number;

    private List<Room> rooms;

    public Floor() {
    }

    public Floor(int number, List<Room> rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public void accept(BuildingVisitor visitor) {
        visitor.visit(this);
        rooms.forEach(visitor::visit);
    }
}
