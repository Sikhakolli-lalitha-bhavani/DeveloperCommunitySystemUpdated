package com.dcs.dto;

import java.time.LocalDateTime;

//import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {
//@NotNull
	private Integer responseId;
	private String answer;
	private LocalDateTime respDateTime;
	private PostDTO post;
	private DeveloperDTO developer;
	//private List<CommentDTO> listOfComments;
//	private List<VoteDTO> vote;

}