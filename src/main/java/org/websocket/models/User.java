package org.websocket.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id")
   private long id;
   
   @Column(name = "username")
   private String username;

   @Column(name = "password")
   private String password;

   @Column(name = "display_name")
   private String displayName;

   @Column(name = "status")
   private String status;
   
   @Column(name = "create_date")
   private Date createDate;
   
   @Column(name = "update_date")
   private Date updateDate;

public Date getCreateDate() {
	return createDate;
   }

public void setCreateDate(Date createDate) {
	this.createDate = createDate;
}

public Date getUpdateDate() {
	return updateDate;
}

public void setUpdateDate(Date updateDate) {
	this.updateDate = updateDate;
}

public String getStatus() {
      return status;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   public long getId() {
	return id;
   }

public void setId(long id) {
	this.id = id;
}

public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getDisplayName() {
      return displayName;
   }

   public void setDisplayName(String displayName) {
      this.displayName = displayName;
   }

}

/*@Entity
@Table(name = "stream")
public class Stream {

   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   @Column(name = "id")
   private long id;

   @Column(name = "stream_id")
   private String streamId;

   @Column(name = "name")
   private String name;

   @Enumerated(EnumType.STRING)
   @Column(name = "rule_type")
   private RuleType ruleType;

   @Column(name = "channel_def")
   private String channelDef;

   @Enumerated(EnumType.STRING)
   @Column(name = "source_def")
   private Domain sourceDef;

   @Column(name = "rules")
   private String rules;

    @Column(name = "account_id")
   private String accountId;

   @Column(name = "agents_assigned")
   private String agentsAssigned;

   @Column(name = "create_date")
   private Date createDate;

   @Column(name = "update_date")
   private Date updateDate;
 */