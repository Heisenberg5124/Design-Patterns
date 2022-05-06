package visitor.element;

import visitor.visitor.BuildingVisitor;

import java.util.List;

public class Building implements Element {
    private String name;

    private List<Floor> floors;

    public Building() {
    }

    public Building(String name, List<Floor> floors) {
        this.name = name;
        this.floors = floors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    @Override
    public void accept(BuildingVisitor visitor) {
        visitor.visit(this);
        floors.forEach(floor -> floor.accept(visitor));
    }
}
