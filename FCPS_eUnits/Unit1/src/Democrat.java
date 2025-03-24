public class Democrat extends MazeEscaper {
@Override
public void walkDownCurrentSegment(){
        if(frontIsClear() && !leftIsClear() && !nextToABeeper()){
         move();
         } 
}
@Override
      public void turnToTheNextSegment(){
      if(leftIsClear()){
         turnLeft();
         move();
         }
         else{
         turnRight();

      
      }

}
}