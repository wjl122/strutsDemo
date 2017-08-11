package strutsDemo.converter;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import strutsDemo.model.Department;

/**
 * ҪΪһ����������Ӧ������ת���������ȵô���һ����̳�StrutsTypeConverter
 * 
 */
public class DepartmentConverter extends StrutsTypeConverter {

	/**
	 * ����ַ����������ת��
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
	 * ��ɶ����ַ�����ת��
	 */
	@Override
	public String convertToString(Map arg0, Object arg1) {
		// TODO �Զ����ɵķ������
		return null;
	}

}
