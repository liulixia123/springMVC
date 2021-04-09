package pojo;

import java.util.List;
import java.util.Map;

public class User {
	private int Id;
    private String username;
    private String password;
    public User() {}
    public User(int id,String name) {
    	super();
    	this.Id = id;
    	this.username = name;
    }
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", username=" + username + ", password=" + password + "]";
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
