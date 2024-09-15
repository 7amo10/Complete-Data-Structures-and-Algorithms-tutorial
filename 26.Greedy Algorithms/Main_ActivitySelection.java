import java.util.ArrayList;

public class Main_ActivitySelection {
    public static void main(String[] args) {
        ArrayList<Activity> activityList = new ArrayList<Activity>();
        activityList.add(new Activity("Activity1", 0, 6));
        activityList.add(new Activity("Activity2", 3, 4));
        activityList.add(new Activity("Activity3", 1, 2));
        activityList.add(new Activity("Activity4", 5, 8));
        activityList.add(new Activity("Activity5", 5, 7));
        activityList.add(new Activity("Activity6", 8, 9));

        ActivitySelection.activitySelection(activityList);
    }   
}
