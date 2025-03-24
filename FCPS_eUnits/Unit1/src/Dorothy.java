import edu.fcps.karel2.Display;
public class Dorothy extends Athlete {

public Dorothy(){
   super(2,2,Display.EAST,0);
}
public boolean findPath(){
if(!nextToABeeper()){
if(!rightIsClear()){
turnAround();
move();
turnRight();
move();
return true;
}
turnAround();
move();
turnLeft();
move();
if(!nextToABeeper()){
turnAround();
move();

move();
if(!nextToABeeper()){
turnAround();
move();
return false;
}
}
}
return true;
}
public void followPath(){
if(!frontIsClear()){
turnLeft();
}
if(nextToABeeper()){
move();
}
}
}