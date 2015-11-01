package org.websocket.repositories;

import org.springframework.data.repository.CrudRepository;
import org.websocket.models.LastReadLog;

public interface LastReadLogRepository extends CrudRepository<LastReadLog, Long>{
	
	LastReadLog findBySenderUsernameAndReceiverUsername(String senderUsername,String receiverUsername);
	
}
