package sd.ifpb.repositories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MessageResultRepository {
	private List<sd.ifpb.share.MessageResult> list = new ArrayList<>();
	
	public void add(sd.ifpb.share.MessageResult msg) {
		System.out.println("Adicionando uma mensagem de resultado: " + msg.getHash());
		list.add(msg);
	}
	
	public void remove(sd.ifpb.share.MessageResult msg){
		System.out.println("Removendo uma mensagem de resultado: " + msg.getHash());
		for (int i = 0; i < list.size(); i++) {
			sd.ifpb.share.MessageResult message = list.get(i);
			if (msg.getHash().equals(message.getHash())) {
				list.remove(i); 
				break;
			}
		}
	}

	public List<sd.ifpb.share.MessageResult> list() {
		return Collections.unmodifiableList(list);
	}

	public sd.ifpb.share.MessageResult get(sd.ifpb.share.Id id) {
		for (int i = 0; i < list().size(); i++) {
			sd.ifpb.share.MessageResult message = list.get(i);
			if (id.getId().equals(message.getId())) {
				return message;
			}
		}
		return null;
	}
}
