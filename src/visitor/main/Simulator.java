package visitor.main;

import visitor.client.Client;
import visitor.element.Building;
import visitor.element.Floor;
import visitor.element.Room;

import java.util.Arrays;

public class Simulator {
    public static void main(String[] args) {
        Room room1 = new Room("Room 1", 10);
        Room room2 = new Room("Room 2", 20);
        Room room3 = new Room("Room 3", 30);
        Room room4 = new Room("Room 4", 40);
        Room room5 = new Room("Room 5", 50);
        Room room6 = new Room("Room 6", 600);
        Room room7 = new Room("Room 7", 700);
        Room room8 = new Room("Room 8", 800);

        Floor floor1 = new Floor(1, Arrays.asList(room1, room2));
        Floor floor2 = new Floor(2, Arrays.asList(room3, room4));
        Floor floor3 = new Floor(3, Arrays.asList(room5, room6));
        Floor floor4 = new Floor(1, Arrays.asList(room7, room8));

        Building building1 = new Building("Building 1", Arrays.asList(floor1, floor2, floor3));
        Building building2 = new Building("Building 2", Arrays.asList(floor4));

        Client client = new Client(Arrays.asList(building1, building2));
        client.export();
    }
}
