//package sd.ifpb;
//
//import sd.ifpb.repositories.MessageRepository;
//import sd.ifpb.repositories.MessageResultRepository;
//import sd.ifpb.repositories.SendedMessageRepository;
//
//import java.util.Timer;
//
//public class TaskManager {
//
//	public static void runTask(MessageRepository repository, SendedMessageRepository sendedRepository,
//							   MessageResultRepository resultRepository){
//		Timer timer = new Timer();
//		timer.schedule(new SendTask(repository, sendedRepository), 3000, 10000);
//		timer.schedule(new GetResultTask(sendedRepository, resultRepository), 2000, 2000);
//	}
//
//}
