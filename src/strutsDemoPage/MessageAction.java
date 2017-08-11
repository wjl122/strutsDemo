package strutsDemoPage;

import com.opensymphony.xwork2.ModelDriven;

import strutsDemo.dao.MessageDao;
import strutsDemo.model.Department;
import strutsDemo.model.Message;

public class MessageAction implements ModelDriven<Message> {

	private Message message;
	private Department dep;

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public String addInput() {
		return "success";
	}

	public String updateInput() {
		MessageDao dao = new MessageDao();
		message = dao.Load(message);
		return "success";
	}

	public String add() {
		return "success";
	}

	@Override
	public Message getModel() {
		// TODO 自动生成的方法存根
		if (message == null)
			message = new Message();
		return message;
	}

}
