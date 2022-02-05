package Homework6.View;

public class Animal {
    protected String name;
    protected int runLimit;
    protected int swimLimit;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }

    public void swim(int obstacleLength){
        if ( obstacleLength <=swimLimit && obstacleLength>0){
        System.out.println(name + " swam " + obstacleLength + " m");}
        else {
            System.out.println(name + " сan't swim that much");
        }
    }
    public void run(int pathLength){
        if (pathLength<=runLimit && pathLength>0){
        System.out.println(name + " ran " + pathLength + " m");}
        else {
            System.out.println(name + " сan't run that much");
        }
    }
}
