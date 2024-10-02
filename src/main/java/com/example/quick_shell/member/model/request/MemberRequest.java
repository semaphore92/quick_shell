package com.example.quick_shell.member.model.request;

import com.example.quick_shell.member.repository.MemberRepository;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public class MemberRequest {

    @ApiModelProperty(notes = "사용자 ID")
    private String memId;

    @Builder
    public MemberRequest(String memId){
        this.memId = memId;
    }

}
