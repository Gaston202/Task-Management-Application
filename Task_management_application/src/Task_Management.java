import java.util.Queue;
import java.util.Stack;
import java.util.PriorityQueue;
import java.util.LinkedList;
public class Task_Management {
	private Queue<String> to_do_list;
	private Stack<String> Completed_task;
	public Task_Management() {
		this.to_do_list=new LinkedList<String>();
		this.Completed_task=new Stack<String>();
	}
	public void Add_Task(String task){
		to_do_list.add(task);
	}
	public String Task_Completion() {
		String task = to_do_list.poll();
		if (task!=null) {
			Completed_task.push(task);
		}
		return task;
	}
	
	 public void Reorder_tasks(int curr_index, int newindex) throws Exception {
	        if (newindex < 0 || newindex >= this.to_do_list.size() || curr_index < 0 || curr_index >= this.to_do_list.size()) {
	            throw new Exception("Index out of range!");
	        }

	        LinkedList<String> tempList = new LinkedList<>(to_do_list);
	        String task = tempList.remove(curr_index);
	        tempList.add(newindex, task);
	        this.to_do_list = new LinkedList<>(tempList);
	    }
	
	 public void displayTasks() {
	        System.out.println("To-Do List:");
	        Queue<String> Back_Q= new LinkedList<>(to_do_list);
	        while (!Back_Q.isEmpty()) {
	            String task = Back_Q.poll();
	            System.out.println(task);
	        }
	 }
}
