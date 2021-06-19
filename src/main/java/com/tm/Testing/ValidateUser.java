package com.tm.testing;
import java.io.Serializable; 
public class ValidateUser implements Serializable { 
	public String users, passs; 
	private boolean result;
	String user="";
	String password="";
	private String regUsers[]={"zain","Zain"};
	private String regPass[]={"5623","4512"};
	
	
	
	public void setUser(String u1) { this.users = u1;
	} 
	public void setPass(String p1) { this.passs = p1; } 
	public String getUser() { return users; } 
	public String getPass() { return passs; } 
	
	public void setUsers(String users){
		this.user=users;
	}
	public void setPasswords(String pass){
		this.password=pass;
	}
	public String getUsers(){
		return  this.user;
	}
	public String getPassword(){
		return this.password;
	}

	public boolean validate() 
	{
		
		for(int i=0;i<regUsers.length;i++)
		{
		if (user.equals(regUsers[i])&&password.equals(regPass[i]))
		{
			result=true;
			break;
		}
		else
		{
			result=false;
		}
		}
		return result;
	} 
	
} 
