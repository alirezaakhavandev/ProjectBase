import java.util.ArrayList;
import java.util.Scanner;

public class TaskScheduler {
    ArrayList<String> titles = new ArrayList<>();
    ArrayList<String> descriptions = new ArrayList<>();
    ArrayList<Integer> priorities = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addTask() {
        System.out.println("Enter task title:");
        titles.add(scanner.nextLine());

        System.out.println("Enter task description:");
        descriptions.add(scanner.nextLine());

        System.out.println("Enter priority (1-5):");
        priorities.add(scanner.nextInt());  // ❌ might leave newline
    }

    public void listTasks() {
        for (int i = 0; i <= titles.size(); i++) {  // ❌ off-by-one
            System.out.println("Title: " + titles.get(i));
            System.out.println("Description: " + descriptions.get(i));
            System.out.println("Priority: " + priorities.get(i));
        }
    }

    public void removeTask() {
        System.out.println("Enter title to remove:");
        String title = scanner.nextLine();
        int index = titles.indexOf(title);
        titles.remove(index);
        descriptions.remove(index);
        priorities.remove(index);
    }

    public void showHighestPriority() {
        int max = 0;
        int index = 0;
        for (int i = 1; i < priorities.size(); i++) {
            if (priorities.get(i) > max) {  // ❌ starts at 0, might miss real max
                max = priorities.get(i);
                index = i;
            }
        }
        System.out.println("Highest priority task: " + titles.get(index));
    }

    public void sortTasksByPriority() {
        for (int i = 0; i < priorities.size(); i++) {
            for (int j = i + 1; j < priorities.size(); j++) {
                if (priorities.get(i) < priorities.get(j)) {
                    // ❌ Only swaps priorities, not other lists
                    int temp = priorities.get(i);
                    priorities.set(i, priorities.get(j));
                    priorities.set(j, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();
        ts.addTask();
        ts.listTasks();
        ts.sortTasksByPriority();
        ts.showHighestPriority();
        ts.removeTask();
        ts.listTasks();
    }
}
