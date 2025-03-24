public class Republican extends MazeEscaper {
@Override
public void walkDownCurrentSegment(){
        if(frontIsClear() && !rightIsClear() && !nextToABeeper()){
         move();
         } 
}
@Override
      public void turnToTheNextSegment(){
      if(rightIsClear()){
         turnRight();
         move();
         }
         else{
         turnLeft();

      
      }

}
}