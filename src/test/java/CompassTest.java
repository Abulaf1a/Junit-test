import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CompassTest {

    @Test
    @DisplayName("Tests the rotate method")
    void rotate() {

        //Arrange
        Point north = Point.NORTH;
        Direction direction = Direction.RIGHT;
        Compass compass = new Compass();

        //Act
        Point outputDirection = compass.rotate(north, direction);

        //Assert
        assertEquals(Point.EAST, outputDirection); //EXPECTED, ACTUAL

    }


    @Test
    @DisplayName("All points and rotation directions function correctly with all right inputs")
    void compassCanRotateRight(){

        //Arrange
        ArrayList<Point> points = new ArrayList<>();
        points.add(Point.NORTH);
        points.add(Point.SOUTH);
        points.add(Point.EAST);
        points.add(Point.WEST);

        Compass compass = new Compass();

        //Act

        //Assert
        assertAll(
                "Grouped Assertions of points",
                () -> assertEquals(Point.EAST, compass.rotate(points.get(0), Direction.RIGHT)),
                () -> assertEquals(Point.WEST, compass.rotate(points.get(1), Direction.RIGHT)),
                () -> assertEquals(Point.SOUTH, compass.rotate(points.get(2), Direction.RIGHT)),
                () -> assertEquals(Point.NORTH, compass.rotate(points.get(3), Direction.RIGHT)),

                () -> assertEquals(Point.WEST, compass.rotate(points.get(0), Direction.LEFT)),
                () -> assertEquals(Point.EAST, compass.rotate(points.get(1), Direction.LEFT)),
                () -> assertEquals(Point.NORTH, compass.rotate(points.get(2), Direction.LEFT)),
                () -> assertEquals(Point.SOUTH, compass.rotate(points.get(3), Direction.LEFT))


        );

    }



}