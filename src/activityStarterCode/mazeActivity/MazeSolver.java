package mazeActivity;

import java.util.*;


/**
 * The abstract class containing the maze solver algorithm.
 *
 *
 *
 */


public abstract class MazeSolver {

    protected Maze maze;

    protected static final int space = 0;
    protected static final int wall = 1;
    protected static final int start = 2;
    protected static final int exit = 3;
    protected int stepCount = 0;

    public MazeSolver(Maze maze) {
        this.maze = maze;
    }

    public abstract void makeEmpty(); // creates an empty worklist (either a MyStack or MyQueue)

    public abstract boolean isEmpty(); // returns true if the worklist is empty

    public abstract void add(Square sq); // adds the given Square to the worklist

    public abstract Square next(); // returns the "next" item from the worklist

    // A non-abstract method that the application program can use to see if this algorithm has solved this maze.
    // That is, has it determined the path
    // to the exit or if there is no path.
    /**
     *
     * @return returns a boolean depending on whether or not the maze has been solved.
     */
    public boolean isSolved() {
        return (maze.getExit().isExplored());
    }

    /**
     *
     * @return returns either a string of the solution path as a list of coordinates [i,j] from the start to the exit or a message indicating no such path exists
     */
    public String getPath() {
        //TODO: Complete this method


        return null; //replace this line
    }

    /**
     * Runs one iteration of the algorithm
     * @return returns the current square being examined.
     */
    public Square step() {
        //TODO: Complete this method


        return null;  //replace this line
    }
}





