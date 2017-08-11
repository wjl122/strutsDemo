package strutsDemo.dao;

import strutsDemo.model.Message;

public class MessageDao {
     public Message Load(Message message){
//    	 Message message=new Message();
    	 message.setId(2);
    	 message.setTitle("何时放假");
    	 message.setContent("何时放假,应该快了");
    	 return message;
     }
}
