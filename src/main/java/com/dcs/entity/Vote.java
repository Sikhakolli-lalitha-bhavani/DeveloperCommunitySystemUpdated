package com.dcs.entity;
//
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
//
//import com.dcs.util.VoteType;
//@Entity
//public class Vote {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="voteId")
//	private Integer voteId;
//	
//	@Enumerated(EnumType.STRING)
//	private VoteType voteType;
//	@OneToOne
//    @JoinColumn(name = "userId", referencedColumnName = "userId")
//	private Developer developerWhoVoted;
//	
//	@ManyToOne
//@JoinColumn(name="responseId")
//	private Response response;
//
//
//
//	public Integer getVoteId() {
//		return voteId;
//	}
//
//
//
//	public void setVoteId(Integer voteId) {
//		this.voteId = voteId;
//	}
//
//
//
//	public VoteType getVoteType() {
//		return voteType;
//	}
//
//
//
//	public void setVoteType(VoteType voteType) {
//		this.voteType = voteType;
//	}
//
//
//
//	public Developer getDeveloperWhoVoted() {
//		return developerWhoVoted;
//	}
//
//
//
//	public void setDeveloperWhoVoted(Developer developerWhoVoted) {
//		this.developerWhoVoted = developerWhoVoted;
//	}
//
//
//
//	public Response getResponse() {
//		return response;
//	}
//
//
//
//	public void setResponse(Response response) {
//		this.response = response;
//	}
//
//
//
//	public Vote(Integer voteId, VoteType voteType, Developer developerWhoVoted, Response response) {
//		super();
//		this.voteId = voteId;
//		this.voteType = voteType;
//		this.developerWhoVoted = developerWhoVoted;
//		this.response = response;
//	}
//
//
//
//	public Vote() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//
//
//	@Override
//	public String toString() {
//		return "Vote [voteId=" + voteId + ", voteType=" + voteType + ", developerWhoVoted=" + developerWhoVoted
//				+ ", response=" + response + "]";
//	}
//	
//	
//	
//}


//package com.devcommunity.entity;
 
import java.time.LocalDate;
 
import com.dcs.util.VoteType;
 
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vote")
public class Vote {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
 
    private Integer voteId;
	@Enumerated(EnumType.STRING)
    private VoteType voteType;
    @OneToOne(cascade = CascadeType.ALL)
    private Developer developerWhoVoted;
}
