package ToDoList;

import java.util.Scanner;

public class ToDoList {

	public static void Choices() {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("=======================================================");
		System.out.println("To Do List Application :");
		System.out.println("-------------------------");
		System.out.println("Press (1) Add Task");
		System.out.println("Press (2) Remove Task");
		System.out.println("Press (3) Mark Task As Complete");
		System.out.println("Press (4) View All Tasks");
		System.out.println("Press (5) Remove All Tasks");
		System.out.println("Press (6) Exit");
		System.out.println("=======================================================");
		System.out.println("Choose An Option");
		int option = sc.nextInt();
		sc.nextLine();
		Lists list=new Lists();
		switch(option) {
		case 1 :
			System.out.println("Enter The Task");
			String Task = sc.nextLine();
			list.AddTask(Task);
			break;
		case 2 :
			System.out.println("Enter The Task Number To Delete");
			int TaskNum = sc.nextInt();
			list.RemoveTask(TaskNum);
				break;
		case 3 :
			System.out.println("Enter The Task Number Is Completed");
			int taskNum =sc.nextInt();
			list.MarkComplete(taskNum);
				break;
		case 4 :
			System.out.println("All Tasks Are :");
			System.out.println("---------------");
			list.ViewTasks();
			break;
		case 5 :
			list.RemoveAllTasks();
			System.out.println("All Tasks Are Removed");
			break;
		case 6 :
			System.out.println("Exiting");
			sc.close();
			return;
		}
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Choices();
	}

}
