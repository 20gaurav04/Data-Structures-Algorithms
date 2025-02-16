package BackTracking;

public class MazeAllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {

                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        allPaths("" ,maze , 0 , 0 );

    }
    static void allPaths(String p , boolean[][] maze , int rows  , int cols)

    {
        if(rows==maze.length-1 && cols==maze[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(!maze[rows][cols])
        {
            return;
        }
//        can't move further if the path is blocked
        maze[rows][cols]=false;
        if(rows<maze.length-1)
        {
            allPaths(p+'D',maze,rows+1 , cols);
        }
        if(cols<maze[0].length-1)
        {
            allPaths(p+'R',maze , rows , cols+1);
        }
        if(rows>0)
        {
            allPaths(p+'U' , maze , rows-1 , cols);
        }
        if(cols>0)
        {
            allPaths(p+'L' , maze , rows , cols-1);
        }
        maze[rows][cols]=true;
    }


}
