package Recursion;

public class Simple_Maze {
    public static void main(String[] args) {
        int [][]maze=new int [3][3];
        System.out.println(fun(maze,0,0,""));

    }
    public static int fun(int [][]maze,int i,int j,String ans){
        if(i==maze.length && j==maze[0].length-1){
            System.out.println(ans);
            return 1;
        }
        if(i==-1||i==maze.length||j==-1||j==maze[0].length||maze[i][j]==-1){
            return 0;
        }
        maze[i][j]=-1;
        int x=fun(maze,i+1,j,ans+"d");
        int y=fun(maze,i-1,j,ans+"u");
        int z=fun(maze,i,j+1,ans+"r");
        int w=fun(maze,i,j-1,ans+"l");
        maze[i][j]=0;
        return x+y+z+w;

    }
}
