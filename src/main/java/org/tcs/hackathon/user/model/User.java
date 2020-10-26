package org.tcs.hackathon.user.model;

import java.util.List;

import org.bson.codecs.pojo.annotations.BsonId;

import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntityBase;

@MongoEntity(collection = "User")
public class User extends PanacheMongoEntityBase  {
	
	private String userFullName;
	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	public String getUserEmailId() {
		return userEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserContactNo() {
		return userContactNo;
	}

	public void setUserContactNo(String userContactNo) {
		this.userContactNo = userContactNo;
	}

	private String userEmailId;
	private String userPassword;
	private String userContactNo;
	
	
	
	public static List<User> findByUserFullName(String userFullName) {
        //return find("title", title).firstResult();
        //return find(" {'title':{$in: [?1]}}",title).list();
		return find("userFullName",userFullName).list();
    }
	
	public static User findByUserEmailId(String userEmailId) {
        //return find("title", title).firstResult();
        //return find(" {'title':{$in: [?1]}}",title).list();
		return find("userEmailId",userEmailId).firstResult();
    }
	
	
}
