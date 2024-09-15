import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ActivitySelection {

  static void activitySelection(ArrayList<Activity> activityList) {
    Comparator<Activity> finishTimeComparator = new Comparator<Activity>() {
      @Override
      public int compare(Activity o1, Activity o2) {
        return o1.getFinishTime() - o2.getFinishTime();
      }
    };
    Collections.sort(activityList, finishTimeComparator); //*=>Recursive Call:O(NlogN) */
    Activity previousActivity = activityList.get(0);

    System.out.println("\n\nRecommended Schedule:\n" + activityList.get(0));

    for (int i = 1; i < activityList.size(); i++) {
      Activity activity = activityList.get(i);
      if (activity.getStartTime() >= previousActivity.getFinishTime()) {
        System.out.println(activity);
        previousActivity = activity;
      }
    }
  }
  //*=> Time Complexity is: O(NlogN) and Space Complexity is: O(1)
}
