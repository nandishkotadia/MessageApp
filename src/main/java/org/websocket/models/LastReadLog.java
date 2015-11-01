package org.websocket.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lastreadlog")
public class LastReadLog {
	
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id")
   private long id;
   
   @Column(name = "sender_username")
   private String senderUsername;
   
   @Column(name = "receiver_username")
   private String receiverUsername;
   
   @Column(name = "last_read_date")
   private Date lastReadDate;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getSenderUsername() {
	return senderUsername;
}

public void setSenderUsername(String senderUsername) {
	this.senderUsername = senderUsername;
}

public String getReceiverUsername() {
	return receiverUsername;
}

public void setReceiverUsername(String receiverUsername) {
	this.receiverUsername = receiverUsername;
}

public Date getLastReadDate() {
	return lastReadDate;
}

public void setLastReadDate(Date lastReadDate) {
	this.lastReadDate = lastReadDate;
}
   
   
}
