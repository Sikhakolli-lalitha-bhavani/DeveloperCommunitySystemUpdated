package com.dcs.entity;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//@Entity
//public class Response {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "responseId")
//	private Integer responseId;
//	private String answer;
//	private LocalDateTime respDateTime;
//	
//	@ManyToOne
//	@JoinColumn(name = "postId", referencedColumnName = "postId")
//	private Post post;
//	
//	@JsonIgnore
//	@OneToOne
//	@JoinColumn(name = "userId", referencedColumnName = "userId")
//	private Developer developer;
//	
////	@OneToMany(mappedBy = "response")
////	private List<Comment> listOfComments;
////	
////	@OneToMany(mappedBy = "response", cascade = CascadeType.REFRESH)
////	private List<Vote> vote;
//
//	public Response() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Response(Integer responseId, String answer, LocalDateTime respDateTime, Post post, Developer developer) {
//		super();
//		this.responseId = responseId;
//		this.answer = answer;
//		this.respDateTime = respDateTime;
//		this.post = post;
//		this.developer = developer;
////		this.listOfComments = listOfComments;
////		this.vote = vote;
//	}
//
//	public Integer getResponseId() {
//		return responseId;
//	}
//
//	public void setResponseId(Integer responseId) {
//		this.responseId = responseId;
//	}
//
//	public String getAnswer() {
//		return answer;
//	}
//
//	public void setAnswer(String answer) {
//		this.answer = answer;
//	}
//
//	public LocalDateTime getRespDateTime() {
//		return respDateTime;
//	}
//
//	public void setRespDateTime(LocalDateTime respDateTime) {
//		this.respDateTime = respDateTime;
//	}
//
//	public Post getPost() {
//		return post;
//	}
//
//	public void setPost(Post post) {
//		this.post = post;
//	}
//
//	public Developer getDeveloper() {
//		return developer;
//	}
//
//	public void setDeveloper(Developer developer) {
//		this.developer = developer;
//	}
//
////	public List<Comment> getListOfComments() {
////		return listOfComments;
////	}
////
////	public void setListOfComments(List<Comment> listOfComments) {
////		this.listOfComments = listOfComments;
////	}
//
////	public List<Vote> getVote() {
////		return vote;
////	}
////
////	public void setVote(List<Vote> vote) {
////		this.vote = vote;
////	}
//
//	@Override
//	public String toString() {
//		return "Response [responseId=" + responseId + ", answer=" + answer + ", respDateTime=" + respDateTime
//				+ ", post=" + post + ", developer=" + developer +  "]";
//	}
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
@Table(name = "response")
 
public class Response {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
 
    private Integer respId;
    private String answer;
    private LocalDateTime respDateTime;
    @OneToOne(cascade = CascadeType.ALL)
    private Post post;
    @OneToOne(cascade = CascadeType.ALL)
    @Transient
    private Developer developer;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Comment> listOfComments;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Vote> vote;
}