package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.videos.project.User;
import com.videos.project.Video;

public class Main {
	
	public static void main(String[] args) {
		
		int valInputValue = -1;
		List<User> users = new ArrayList<User>();
		User user;
		
		User user0 = new User("admin", " ", "9876", "11/05/2020 22:25:00");
		User user1 = new User("Josep", "Arnau", "1234", "05/05/2020 10:00:00");
		User user2 = new User("Marcel", "Alvarez", "5678", "06/05/2020 10:00:00");
		User user3 = new User("Anthony", "Bull", "9012", "07/05/2020 10:00:00");
				
		users.add(user0);
		users.add(user1);
		users.add(user2);
		users.add(user3);
		
		try (Scanner inputValue = new Scanner(System.in)) {
			//matcher = pattern.matcher(inputValue);
		
			while (valInputValue != 0) {
				System.out.println("++++++++++++++++++++++++++");
				System.out.println("--> (0) Exit Application  ");
				System.out.println("--> (1) Add New Video     ");			
				System.out.println("--> (2) Show User Videos  ");
				System.out.println("--> (3) Show User         ");
				System.out.println("--> (4) Show Users (admin)");
				System.out.println("++++++++++++++++++++++++++");
				
				valInputValue = inputValue.nextInt();
					
				switch (valInputValue) {
					case 0:
						valInputValue = 0;
						break;
					case 1:
						user = readUser(users); // read users and return null or existing user as a object
						if (user != null) { // if not return null return a object
							addNewVideo(user, users); // add new video function with the user object and users array as a parameter
						} else {
							System.out.println("User not exists or incorrect password.");
						}
						break;						
					case 2:
						user = readUser(users);
						if (user != null) {
							showUserVideos(user, users); // show user videos
						} else {
							System.out.println("User not exists or incorrect password.");
						}
						break;
					case 3:
						user = readUser(users);
						if (user != null) {
							showUser(user, users); // show user data
						} else {
							System.out.println("User not exists or incorrect password.");
						}
						break;
					case 4:
						user = readUser(users);
						if (user != null && user.getName().equals("admin")) {
							showUsers(users); // show users data, only admin role
						} else {
							System.out.println("User not exists or incorrect password or wrong role.");
						}
						break;	
					default:
						System.out.println("Invalid option, try again. ");		
				}
			}
		}
		catch (Exception e) {
			System.out.println("Error on input.");
		}		
	}
	
	// Read input data user, compare users array and return null or existing user as a object	
	public static User readUser(List<User> users)  {
		BufferedReader inputValue = new BufferedReader(new InputStreamReader(System.in));
		String name = "";
		String surname = "";
		String password = "";
		User existsUser;
		
		do {
			System.out.println("User - Name: ");
			try {
				name = inputValue.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("User - Surname: ");
			try {
				surname = inputValue.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("User - Password: ");
			try {
				password = inputValue.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while(name.isEmpty() || surname.isEmpty());
		
		for (User user : users) {
			if (user.getName().equals(name) && user.getSurname().equals(surname) && 
					user.getPassword().equals(password)) {
				// call a constructor with two parameter to compare input user with existing user
				existsUser = new User(name, surname); // return user as a object if exists
				return existsUser;
			}
		}
		
		return null; // return null if not exists user
	}
	
	// Add new video into video type list of the user object
	public static void addNewVideo(User userExists, List<User> users) throws IOException {
		BufferedReader inputValue = new BufferedReader(new InputStreamReader(System.in));
		String title = "";
		String URL = "";
		String tag = "";
		List<String> tags = new ArrayList<String>();
		Video video;
				
		System.out.println("····· Add New Video ·····");
		
		while (title.isEmpty() || URL.isEmpty()) {
			System.out.println("Video - Title: ");
				title = inputValue.readLine();
			System.out.println("Video - URL: ");
				URL = inputValue.readLine();
		}
		while (!tag.equals("0")) {
			System.out.println("Video - Tags (0) to exit: ");
				tag = inputValue.readLine();
			if(!tag.equals("0"))
				tags.add(tag);
		}
		
		video = new Video(title, URL, tags);
		
		for (User user : users) {
			if (user.getName().equals(userExists.getName()) && user.getSurname().equals(userExists.getSurname())) {
				user.addNewVideo(video);
			}
		}
		
		System.out.println("·························");
	}
	
	// Show user videos
	public static void showUserVideos(User userExists, List<User> users) {
		System.out.println("···· Show User Videos ···");
		
		for (User user : users) {
			if (user.getName().equals(userExists.getName()) && user.getSurname().equals(userExists.getSurname())) {
				for (Video video : user.getVideo()) {
					System.out.println(video.toString());
				}
				System.out.println("\n");
			}
		}
		
		System.out.println("·························");
	}
	
	// Show user data
	public static void showUser(User userExists, List<User> users) {		
		System.out.println("······· Show User ·······");
		for (User user : users) {
			if (user.getName().equals(userExists.getName()) && user.getSurname().equals(userExists.getSurname())) {
				System.out.println(user.toString());
			}
		}		
		System.out.println("·························");
	}
	
	// Show the list of registered users 
	public static void showUsers(List<User> users) {
		Iterator<User> iterator = users.iterator(); 
		System.out.println("······ Show Users ·······");
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
			
		System.out.println("·························");
	}
	
}
