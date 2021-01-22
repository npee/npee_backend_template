package com.npee.myproject.api;

import com.npee.myproject.config.response.ListResult;
import com.npee.myproject.config.response.ResponseService;
import com.npee.myproject.config.response.SingleResult;
import com.npee.myproject.domain.entity.dto.RequestUserDto;
import com.npee.myproject.domain.entity.dto.ResponseUserDto;
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
@RequestMapping("/api")
public class UserApiController {

    private final ResponseService responseService;
    private final UserServiceImpl userService;

    @ApiOperation(value = "회원 목록", notes = "회원 목록 불러오기")
    @GetMapping("/v1/all-users")
    // TODO: Entity가 준비되면 CommonResult에서 상황에 맞게 SingleResult나 ListResult로 변경
    // TODO: Entity에 직접 접근하지 않기 위해 DTO 이용
    public ListResult<ResponseUserDto> getUsers() {
        return responseService.getListResult(userService.findAllUsers());
    }

    @ApiOperation(value = "회원 검색", notes = "특정 회원 검색")
    @GetMapping("/v1/users")
    public SingleResult<ResponseUserDto> getUser(@RequestParam String id,
                                                 @RequestParam String pw) {
        return null;
    }

    @ApiOperation(value = "회원 추가", notes = "회원 추가")
    @PostMapping("/v1/users")
    public SingleResult<Long> setUser(@RequestBody RequestUserDto.CreateUser user) {
        Long savedUserId = userService.save(user.toEntity());
        return responseService.getSingleResult(savedUserId);
    }

    @ApiOperation(value = "회원 삭제", notes = "회원 삭제")
    @DeleteMapping("/v1/users/{userNo}")
    public SingleResult<ResponseUserDto> deleteUser(@PathVariable Long userNo) {
        return null;
    }

}
