import java.util.ArrayList;
public class StepTracker{
private int actDays,totalDays;
private int minSteps,totalSteps;
public StepTracker(int goal){
 minSteps = goal;
 actDays = 0;
 totalDays = 0;
 totalSteps = 0;
}
public void addDailySteps(int dailySteps){
 totalDays++;
 totalSteps = totalSteps + dailySteps;
 if(steps >= minSteps)
  actDays++;
}
public int activeDays(){
 return actDays;
}
public int averageSteps(){
 if(totalSteps == 0 || totalDays == 0)
  return 0.0;
 else
   return (double)totalSteps/totalDays;
}
}

 
