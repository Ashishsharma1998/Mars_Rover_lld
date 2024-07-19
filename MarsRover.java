import java.util.List;

public class MarsRover {
    private Grid grid;
    private Position position;
    private Direction direction;
    private List<Command> commands;

    public MarsRover(Grid grid, Position position, Direction direction) {
        this.grid = grid;
        this.position = position;
        this.direction = direction;
    }

    public void setCommands(List<Command> commands) {
        this.commands = commands;
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute(this);
        }
    }

    public void move() {
        Position newPosition = position.move(direction);
        if (!grid.hasObstacle(newPosition)) {
            position = newPosition;
        }
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public String getStatusReport() {
        return String.format("Rover is at (%d, %d) facing %s.", position.getX(), position.getY(), direction);
    }

    public Position getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }
}
