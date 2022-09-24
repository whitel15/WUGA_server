package com.server.grad.dto.answers;

import com.server.grad.domain.answers.Answers;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class AnswersResponseDto {
    private Long id;
    private String emoji;
    private String answer;
    private LocalDate date;
    private String user_name;
    private String user_profile;

    public AnswersResponseDto(Answers entity){
        this.id = entity.getId();
        this.emoji = entity.getEmoji();
        this.answer = entity.getAnswer();
        this.date = entity.getDate();
        this.user_name = entity.getUser_id().getName();
        this.user_profile = entity.getUser_id().getProfile_img();
    }
}
