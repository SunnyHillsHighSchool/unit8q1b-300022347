public class Unit8_1a
{
  public int [] [] modifyRows (int [] [] array)
  { 
    int[][] currentArray = new int[array.length][array[0].length];
      for(int arrayC=0; arrayC<array.length; arrayC++)
      {
        for(int arrayR=0; arrayR<array[0].length; arrayR++)
        {
          currentArray[arrayC][arrayR]=array[arrayC][arrayR];
        }
      }
    for(int currentC=0; currentC<array.length; currentC++)
    {
      if(currentC%2!=0)
      {
        for(int currentR=0; currentR<array[0].length; currentR++)
        {
          currentArray[currentC][currentR]=array[currentC-1][currentR];
        }
      }
    }
    return currentArray;
  }
}
 