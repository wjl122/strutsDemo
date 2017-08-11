package strutsDemo.test;

import java.util.HashMap;
import java.util.Map;

import ognl.Ognl;
import ognl.OgnlException;
import strutsDemo.model.Department;
import strutsDemo.model.User;


public class Test {


	@org.junit.Test
   public void Test01() throws OgnlException{
	   User user=new User(1,"wjl","王金连");
	   Department department=new Department("财务处1");
	   user.setDep(department);
       System.out.println(Ognl.getValue("username",user));
       System.out.println(Ognl.getValue("dep.name",user));
       
       Department dep2=new Department("财务处2");
       Map<String, Object> ctx=new HashMap<String,Object>();
       ctx.put("user", user);
       ctx.put("dep1", dep2);
       
       System.out.println(Ognl.getValue("#user.username", ctx,user));
       System.out.println(Ognl.getValue("#user.dep.name", ctx,user));
       System.out.println(Ognl.getValue("name", ctx,dep2));
       System.out.println(Ognl.getValue("#root.name", ctx,dep2));
   }
   
}
