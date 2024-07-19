import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(10, 10, Arrays.asList(
            new Obstacle(new Position(2, 2)),
            new Obstacle(new Position(3, 5))
        ));

        MarsRover rover = new MarsRover(grid, new Position(0, 0), Direction.NORTH);
        rover.setCommands(Arrays.asList(
            new MoveCommand(),
            new MoveCommand(),
            new TurnRightCommand(),
            new MoveCommand(),
            new TurnLeftCommand(),
            new MoveCommand()
        ));

        rover.executeCommands();
        System.out.println(rover.getStatusReport());
    }
}
