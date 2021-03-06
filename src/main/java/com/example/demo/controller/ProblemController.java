package com.example.demo.controller;

import com.example.demo.mapper.ProblemMapper;
import com.example.demo.model.Problem;
import com.example.demo.model.ProblemExample;
import com.example.demo.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lyle 2018/7/17 16:23.
 */
@RestController
@RequestMapping("/problem")
@Api(description = "告警信息")
public class ProblemController {

    @Autowired
    private ProblemMapper problemMapper;

    @GetMapping(value = "/list")
    @ApiOperation(value = "列表接口")
    @ApiImplicitParams({@ApiImplicitParam(name = "currentPage", value = "当前页数"), @ApiImplicitParam(name = "pageSize", value = "每页大小")})
    public Result list(@RequestParam(defaultValue = "1") Integer currentPage, @RequestParam(defaultValue = "10") Integer pageSize) {
        ProblemExample problemExample = new ProblemExample();
        problemExample.setLimit(pageSize);
        problemExample.setOffset((currentPage -1) * pageSize);
        List<Problem> problems = problemMapper.selectByExample(problemExample);
        return Result.ok(problems);
    }
}
