package com.example.java8Features.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class User {
	private int id;
	private String name;
	private String password;
	private String email;

	public User(int id, String name, String password, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + "]";
	}

}

class UserDTO {

	private int id;
	private String name;
	private String password;
	private String email;

	public UserDTO(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ",  email=" + email + "]";
	}

}

public class StreamMapCollectExample {
	public static void main(String[] args) {
		List<User> userlist = new ArrayList<>();
		userlist.add(new User(1, "Rabi", "abcd", "rabi@123gmail.com"));
		userlist.add(new User(2, "Raja", "efdss", "raja@1234gmail.com"));
		userlist.add(new User(3, "Ramesh", "ydydtu", "ramesh@4346gmail.com"));
		userlist.add(new User(4, "prakash", "fydfy", "prakash@gmail.com"));
		
		List<UserDTO> userDto = new ArrayList<>();
		
		for(User user : userlist) {
			userDto.add(new UserDTO(user.getId(),user.getName(),user.getEmail()));
		}
		for(UserDTO user: userDto) {
			//System.out.println(user);
		}
		
		// using stream map 
		Stream<UserDTO> usingMap=userlist.stream().map(new Function<User, UserDTO>() {

			@Override
			public UserDTO apply(User t) {
				// TODO Auto-generated method stub
				return new UserDTO(t.getId(), t.getName(), t.getEmail());
			}
		});
		
		//usingMap.forEach(System.out::println);
		
		//using lambda express
		
		Stream<UserDTO> usingLambda=userlist.stream().map((User u)-> new UserDTO(u.getId(), u.getName(),u.getEmail()));
		usingLambda.forEach(System.out::println);
		
	}
}
