package org.websocket.lastread.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.websocket.dtos.LastReadLogDTO;
import org.websocket.dtos.UnreadDTO;
import org.websocket.models.LastReadLog;
import org.websocket.models.User;
import org.websocket.repositories.LastReadLogRepository;
import org.websocket.repositories.MessageRepository;
import org.websocket.repositories.UserRepository;

@Service
public class LastReadService {
	
	@Autowired
	private LastReadLogRepository	lastReadRepository;
	
	@Autowired
	private UserRepository	userRepository;
	
	@Autowired
	private MessageRepository	messageRepository;
	
	public void updateLastReadLog(LastReadLogDTO lastReadLogDTO) {
		LastReadLog checkLog = lastReadRepository.findBySenderUsernameAndReceiverUsername(lastReadLogDTO.getSenderUsername(), lastReadLogDTO.getReceiverUsername());
		if(checkLog!=null)
		{
			checkLog.setLastReadDate(new Date());
			lastReadRepository.save(checkLog);
		}
		else
		{
			LastReadLog lastReadLog = new LastReadLog();
			lastReadLog.setSenderUsername(lastReadLogDTO.getSenderUsername());
			lastReadLog.setReceiverUsername(lastReadLogDTO.getReceiverUsername());
			lastReadLog.setLastReadDate(new Date());
			lastReadRepository.save(lastReadLog);
		}
	}

	public List<UnreadDTO> getUnreadNotifications(String username) {
		List<UnreadDTO> unreadDTOs = new ArrayList<UnreadDTO>();
		List<User> users = userRepository.findByNotUsername(username);
		for(User u:users)
		{
			LastReadLog lastRead = lastReadRepository.findBySenderUsernameAndReceiverUsername(username, u.getUsername());
			if(lastRead!=null)
			{
				Date lastReadDate = lastRead.getLastReadDate();
				long count = messageRepository.countBySenderUsernameAndReceiverNameAndPubDateGreaterThan(username, u.getUsername(), lastReadDate);
				UnreadDTO unreadDTO = new UnreadDTO();
				unreadDTO.setReceiverUsername(u.getUsername());
				unreadDTO.setNoOfNotifications(count);
				unreadDTOs.add(unreadDTO);
			}
			else
			{
				long count = messageRepository.countBySenderUsernameAndReceiverName(username, u.getUsername());
				UnreadDTO unreadDTO = new UnreadDTO();
				unreadDTO.setReceiverUsername(u.getUsername());
				unreadDTO.setNoOfNotifications(count);
				unreadDTOs.add(unreadDTO);
			}
		}
		
		return unreadDTOs;
	}
	
}
