package com.npee.myproject.controller.v1;

import com.npee.myproject.advice.exception.CustomUserNotExistsException;
import com.npee.myproject.config.response.CommonResult;
import com.npee.myproject.config.response.ListResult;
import com.npee.myproject.config.response.ResponseService;
import com.npee.myproject.service.UserServiceImpl;
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

    private final ResponseService responseService;
    private final UserServiceImpl userService;

    @ApiOperation(value = "회원 목록", notes = "회원 목록 불러오기")
    @GetMapping
    public CommonResult getUsers() {
        return responseService.getListResult(userService.selectAllUsers());
    }
}
