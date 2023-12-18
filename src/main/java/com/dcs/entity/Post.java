package com.dcs.entity;
//import java.time.LocalDateTime;
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//@Entity
//@Table
//public class Post {
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="postId")
//	private Integer postId;
//	private String query;
//	private LocalDateTime postDateTime;
//	private String topic;
//	
//	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//	@JoinColumn(name="userId")
//	private Developer developer;
//	
//	//Bidirectional Mapping
////	@OneToMany(mappedBy="post") // Many posts are associated with one developer
////	private List<Response> listOfResponse;
//	
////	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE},fetch = FetchType.EAGER) // Many posts are associated with one developer
////    @JoinColumn(name = "comment")
////	private List<Comment> listOfComment;
//	private Integer noOfViews;
////	@OneToMany(mappedBy="post",cascade=CascadeType.ALL)// Many posts are associated with one developer
////	private List<Vote> vote;
//	public Post() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//public Post(Integer postId, String query, LocalDateTime postDateTime, String topic, Developer developer,
//	 Integer noOfViews) {
//	super();
//	this.postId = postId;
//	this.query = query;
//	this.postDateTime = postDateTime;
//	this.topic = topic;
//	this.developer = developer;
////	this.listOfResponse = listOfResponse;
//	this.noOfViews = noOfViews;
//}
//
//public Integer getPostId() {
//	return postId;
//}
//public void setPostId(Integer postId) {
//	this.postId = postId;
//}
//public String getQuery() {
//	return query;
//}
//public void setQuery(String query) {
//	this.query = query;
//}
//public LocalDateTime getPostDateTime() {
//	return postDateTime;
//}
//public void setPostDateTime(LocalDateTime postDateTime) {
//	this.postDateTime = postDateTime;
//}
//public String getTopic() {
//	return topic;
//}
//public void setTopic(String topic) {
//	this.topic = topic;
//}
//public Developer getDeveloper() {
//	return developer;
//}
//public void setDeveloper(Developer developer) {
//	this.developer = developer;
//}
////public List<Response> getListOfResponse() {
////	return listOfResponse;
////}
////public void setListOfResponse(List<Response> listOfResponse) {
////	this.listOfResponse = listOfResponse;
////}
//public Integer getNoOfViews() {
//	return noOfViews;
//}
//public void setNoOfViews(Integer noOfViews) {
//	this.noOfViews = noOfViews;
//}
//@Override
//public String toString() {
//	return "Post [postId=" + postId + ", query=" + query + ", postDateTime=" + postDateTime + ", topic=" + topic
//			+ ", developer=" + developer + " noOfViews=" + noOfViews + "]";
//}
//
//	
//}





//package com.devcommunity.entity;
 
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
 
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "post")
public class Post {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
 
    private Integer postId;
    private String query;
   // private LocalDateTime postDateTime;
    private LocalDate postDate;
    private String topic;
    @OneToOne(cascade = CascadeType.ALL)
    private Developer developer;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Response> listOfResponse;
    //@OneToMany(cascade = CascadeType.ALL)
    @Transient
    private List<Comment> listOfComment;
    private Integer noOfViews;
    //@OneToMany(cascade = CascadeType.ALL)
    @Transient
    private List<Vote> vote;
}