package visitor.client;

import visitor.element.Building;
import visitor.visitor.TUVisitor;

import java.util.List;

public class Client {
    private List<Building> buildings;

    public Client() {
    }

    public Client(List<Building> buildings) {
        this.buildings = buildings;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

    public void export() {
        buildings.forEach(building -> building.accept(new TUVisitor()));
    }
}
