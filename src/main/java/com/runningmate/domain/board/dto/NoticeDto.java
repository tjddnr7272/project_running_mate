package com.runningmate.domain.board.dto;

import java.util.Date;

import lombok.Data;


@Data

public class NoticeDto {
    private int noticeId;
    private String noticeTitle;
    private String noticeContent;
    private Date noticeDate;
    private int noticeHit;



    @Override
    public String toString() {
        return "NoticeDto [noticeId=" + noticeId + ", noticeTitle=" + noticeTitle + ", noticeContent=" + noticeContent
                + ", noticeDate=" + noticeDate + ", noticeHit=" + noticeHit + "]";
    }
}
