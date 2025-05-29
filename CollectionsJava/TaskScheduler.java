import java.util.ArrayList;
import java.util.Scanner;

public class TaskScheduler {
    //A Task class for getting the data of a task
    record Task(String title, String description, int priority) {}
    ArrayList<Task> tasks = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addTask() {
        System.out.println("Enter task title:");
        String taskName = scanner.nextLine();
        System.out.println("Enter task description:");
        String taskDescription = scanner.nextLine();
        System.out.println("Enter task priority:(1-5)");
        int taskPriority = scanner.nextInt();
        scanner.nextLine(); //Fixed newLine Bug here
        tasks.add(new Task(taskName, taskDescription, taskPriority));
    }
    public void removeTask() {
        System.out.println("Enter task title:");
        String taskTitle = scanner.nextLine();
        boolean removed = tasks.removeIf(task -> taskTitle.equals(task.title));
        if (removed)
            System.out.println("The task \"" + taskTitle + "\" has been removed.");
        else
            System.out.println("Task not found.");
    }
    public void showHighestPriority() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        Task highest = tasks.getFirst();
        for (Task task : tasks) {
            if (task.priority > highest.priority) {
                highest = task;
            }
        }

        System.out.println("Highest priority Task: " + highest.title + " (Priority: " + highest.priority + ")");
    }
    public void sortTasksByPriority() {
        tasks.sort((a, b) -> Integer.compare(b.priority, a.priority));
        System.out.println("Tasks sorted by priority (high to low):");
        for (Task task : tasks) {
            System.out.println(task.title + " - Priority: " + task.priority);
        }
    }
    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        for (Task task : tasks) {
            System.out.println("Title: " + task.title);
            System.out.println("Description: " + task.description);
            System.out.println("Priority: " + task.priority);
            System.out.println("-----");
        }
    }
    public void run() {
        while (true) {
            System.out.println(
                    """
                    1. Add Task
                    2. List Tasks
                    3. Remove Task
                    4. Show Highest Priority
                    5. Sort Tasks by Priority
                    0. Exit
                    """
            );

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addTask();
                case 2 -> listTasks();
                case 3 -> removeTask();
                case 4 -> showHighestPriority();
                case 5 -> sortTasksByPriority();
                case 0 -> {
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    public static void main(String[] args) {
        new TaskScheduler().run();
    }


}

