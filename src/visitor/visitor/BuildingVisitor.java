package visitor.visitor;

import visitor.element.Building;
import visitor.element.Floor;
import visitor.element.Room;

public interface BuildingVisitor {
    void visit(Building building);
    void visit(Floor floor);
    void visit(Room room);
}
