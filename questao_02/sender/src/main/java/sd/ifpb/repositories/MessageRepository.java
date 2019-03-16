package sd.ifpb.repositories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MessageRepository {
	private List<sd.ifpb.share.Message> list = new ArrayList<>();
	
	public void add(sd.ifpb.share.Message msg) {
		System.out.println("Adicionando uma mensagem: " + msg.getId());
		list.add(msg);
	}
	
	public void remove(sd.ifpb.share.Message msg){
		System.out.println("Removendo uma mensagem: " + msg.getId());
		for (int i = 0; i < list.size(); i++) {
			sd.ifpb.share.Message message = list.get(i);
			if (msg.getId().equals(message.getId())) {
				list.remove(i); 
				break;
			}
		}
	}

	public List<sd.ifpb.share.Message> list() {
		return Collections.unmodifiableList(list);
	}
}
