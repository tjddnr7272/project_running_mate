package com.runningmate.domain.board.dto;

import java.util.Date;

import lombok.Data;

 
@Data

public class ReplyDto {
	private int replyId;
	private String replyContent;
	private String replyName;
    private Date replyDate;
    private int replyNoticeId;
    private String email; // 이메일 필드 추가


	
	
}