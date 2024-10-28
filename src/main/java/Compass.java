public class Compass {

    Point point;
    Direction direction;

    public Compass(Point point, Direction direction) {
        this.point = point;
        this.direction = direction;
    }

    public Compass(){

    }

    public Point rotate(Point point, Direction direction){

        switch(point){

            case Point.EAST:

                return(direction == Direction.LEFT ? Point.NORTH : Point.SOUTH);

            case Point.WEST:

                return(direction == Direction.LEFT ? Point.SOUTH : Point.NORTH);

            case Point.NORTH:

                return(direction == Direction.LEFT ? Point.WEST : Point.EAST);

            case Point.SOUTH:

                return(direction == Direction.LEFT ? Point.EAST : Point.WEST);

        }


        return null;
    }

}
