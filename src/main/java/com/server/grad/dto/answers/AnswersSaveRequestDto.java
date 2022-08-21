package com.server.grad.dto.answers;

import com.server.grad.domain.Answers;
import com.server.grad.domain.Question;
import com.server.grad.domain.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class AnswersSaveRequestDto {
    private int emoji;
    private String answer;
    private LocalDate date;
    private Question question_id;
    private User user_id;

    @Builder
    public AnswersSaveRequestDto(int emoji, String answer, LocalDate date, Question question_id, User user_id){
        this.emoji = emoji;
        this.answer = answer;
        this.date = date;
        this.question_id = question_id;
        this.user_id = user_id;
    }

    // Dto -> Entity
    public Answers toEntity(){
        Answers answers = Answers.builder()
                .emoji(emoji)
                .answer(answer)
                .date(date)
                .question_id(question_id)
                .user_id(user_id)
                .build();

        return answers;
    }
}