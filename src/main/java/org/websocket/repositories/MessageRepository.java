package org.websocket.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.websocket.models.Message;

public interface MessageRepository extends CrudRepository<Message, Long> {
	
	@Query("SELECT m FROM Message m WHERE (sender_username=(:senderUsername) AND receiver_username=(:receiverUsername)) OR  (sender_username=(:receiverUsername) AND receiver_username=(:senderUsername))ORDER BY pub_date ASC")
	List<Message> findBySenderUsernameAndReceiverUsername(@Param(value = "senderUsername")String senderUsername,@Param(value = "receiverUsername")String receiverUsername);
	
	@Query("SELECT count(m) FROM Message m WHERE ((sender_username=(:senderUsername) AND receiver_username=(:receiverUsername)) OR  (sender_username=(:receiverUsername) AND receiver_username=(:senderUsername))) AND pub_date > (:lastReadDate)")
	long countBySenderUsernameAndReceiverNameAndPubDateGreaterThan(@Param(value = "senderUsername")String senderUsername,@Param(value = "receiverUsername")String receiverUsername,@Param(value = "lastReadDate")Date lastReadDate);

	@Query("SELECT count(m) FROM Message m WHERE (sender_username=(:senderUsername) AND receiver_username=(:receiverUsername)) OR  (sender_username=(:receiverUsername) AND receiver_username=(:senderUsername))")
	long countBySenderUsernameAndReceiverName(@Param(value = "senderUsername")String senderUsername,@Param(value = "receiverUsername")String receiverUsername);
}
