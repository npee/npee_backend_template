package com.npee.myproject.controller.v1;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"1. User"})
@RestController
// @CrossOrigin(origins = {"http://127.0.0.1:3000"}) // TODO: 다른 포트와 통신해야 할 경우 CORS 이슈 체크
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/v1/users")
public class UserController {

    @ApiOperation(value = "회원 목록", notes = "회원 목록 불러오기")
    @GetMapping
    public String getUsers() {
        return "조회된 유저 목록";
    }
}
