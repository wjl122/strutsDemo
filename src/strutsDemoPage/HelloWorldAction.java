package strutsDemoPage;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;


import com.opensymphony.xwork2.ActionContext;

import strutsDemo.model.User;

public class HelloWorldAction {
	private  String username;
	private  String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String addInput() throws Exception {
		System.out.println(username+"---"+password);
		return "success";
	}

	public String add() {
		return "r_list";
	}
	public String addlist() {
		//第一种
		this.setUsername("张三");
		this.setPassword("123");
		
		//页面传值第二种
		ActionContext.getContext().put("wjl", "王金连");
		ActionContext.getContext().put("age", 18);
		User user=new User(2,"wjl12","www");
		ActionContext.getContext().getValueStack().push(user);;
		//第三种
		ServletActionContext.getRequest().setAttribute("sex", "男");
		return "success";
	}
	
	public String show(){
		this.setUsername("wjl");
		ActionContext.getContext().put("age", 20);
		List<User> user=new ArrayList<User>();	
		User u1=new User(1,"wjl1","密码1");
		User u2=new User(2,"wjl2","密码2");
		User u3=new User(3,"wjl3","密码3");
		User u4=new User(4,"wjl4","密码4");
		user.add(u1);
		user.add(u2);
		user.add(u3);
		user.add(u4);		
		ActionContext.getContext().put("users", user);
		return "success";
	}
}
