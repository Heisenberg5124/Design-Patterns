package visitor.visitor;

import visitor.element.Building;
import visitor.element.Floor;
import visitor.element.Room;

public class TUVisitor implements BuildingVisitor {
    @Override
    public void visit(Building building) {
        System.out.println("Building name: " + building.getName());
    }

    @Override
    public void visit(Floor floor) {
        if (floor.getNumber() % 2 == 0) {
            System.out.println("Floor number: " + floor.getNumber());
        }
    }

    @Override
    public void visit(Room room) {
        if (room.getCapacity() > 100) {
            System.out.println("Room: " + room.getName());
        }
    }
}
