package strutsDemo.dao;

import strutsDemo.model.Message;

public class MessageDao {
     public Message Load(Message message){
//    	 Message message=new Message();
    	 message.setId(2);
    	 message.setTitle("��ʱ�ż�");
    	 message.setContent("��ʱ�ż�,Ӧ�ÿ���");
    	 return message;
     }
}
