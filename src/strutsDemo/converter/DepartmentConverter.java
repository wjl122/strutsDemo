package strutsDemo.converter;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import strutsDemo.model.Department;

/**
 * 要为一个类增加相应的类型转换器，首先得创建一个类继承StrutsTypeConverter
 * 
 */
public class DepartmentConverter extends StrutsTypeConverter {

	/**
	 * 完成字符串到对象的转换
	 */
	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		Department department=null;
		if(arg1.length<=1) {
			String arr=arg1[0];
			department=new Department();
			String[] code=arr.split(",");
			
			department.setId(Integer.parseInt(code[0]));
			department.setName(code[1]);
		}
		return department;
	}

	/**
	 * 完成对象到字符串的转换
	 */
	@Override
	public String convertToString(Map arg0, Object arg1) {
		// TODO 自动生成的方法存根
		return null;
	}

}
