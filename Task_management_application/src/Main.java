public class Main {
    public static void main(String[] args) throws Exception {
        Task_Management tasks = new Task_Management();
        tasks.Add_Task("Task 1");
        tasks.Add_Task("Task 2");
        tasks.Add_Task("Task 3");
        
        tasks.Reorder_tasks(1, 2);
        tasks.displayTasks();

       
    }
}