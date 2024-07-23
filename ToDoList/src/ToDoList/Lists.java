package ToDoList;
import java.io.*;
import java.util.*;

public class Lists {
	private static String File_Name="Tasks.txt";
	private List<String> tasks;
	public Lists() {
		tasks=new ArrayList<>();
		loadTasks();
	}
	
	public void AddTask(String Task) 
	{
		tasks.add(Task);
		System.out.println("Added Successfuly \n");
		saveTasks();
	}
	
	public void RemoveTask(int taskNum)
	{
		if(taskNum<0 || taskNum>tasks.size()) {
			System.out.println("There Is No Task With That Number");
		}
		else {
			tasks.remove(taskNum-1);
			saveTasks();
			System.out.println("Removed Successfuly\n");
		}
	}
	
	public void MarkComplete(int taskNum) {
		if(taskNum<0 || taskNum>tasks.size()) {
			System.out.println("There Is No Task With That Number");
		}
		else {
			tasks.set(taskNum-1,tasks.get(taskNum-1)+ " Complete ");
			saveTasks();
			System.out.println("Done !");
		}
	}
	
	public void ViewTasks() {
		if(tasks.isEmpty()) {
			System.out.println("There Is No Tasks To View");
		}
		else {
			for(int i=0; i<tasks.size();i++) {
				System.out.println((i+1)+"-"+tasks.get(i));
			}
		}
	}
	
	public void RemoveAllTasks() {
		tasks.clear();
		saveTasks();
	}
	private void saveTasks() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(File_Name))) {
            for (String task : tasks) {
                writer.write(task);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while saving tasks.");
            e.printStackTrace();
        }
    }
	
	 private void loadTasks() {
	        try (BufferedReader reader = new BufferedReader(new FileReader(File_Name))) {
	            String task;
	            while ((task = reader.readLine()) != null) {
	                tasks.add(task);
	            }
	        } catch (FileNotFoundException e) {
	            // File does not exist, which is fine for the first run
	        } catch (IOException e) {
	            System.out.println("An error occurred while loading tasks.");
	            e.printStackTrace();
	        }
	    }
	}

