package com.example.demo.controller;

import com.example.demo.mapper.EncoderMapper;
import com.example.demo.model.Encoder;
import com.example.demo.model.EncoderExample;
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
@RequestMapping("/encoder")
@Api(description = "编码器")
public class EncoderController {

    @Autowired
    private EncoderMapper encoderMapper;

    @GetMapping(value = "/list")
    @ApiOperation(value = "列表接口")
    @ApiImplicitParams({@ApiImplicitParam(name = "currentPage", value = "当前页数"), @ApiImplicitParam(name = "pageSize", value = "每页大小")})
    public Result list(@RequestParam(defaultValue = "1") Integer currentPage, @RequestParam(defaultValue = "10") Integer pageSize) {
        EncoderExample encoderExample = new EncoderExample();
        encoderExample.setLimit(pageSize);
        encoderExample.setOffset((currentPage -1) * pageSize);
        List<Encoder> encoders = encoderMapper.selectByExample(encoderExample);
        return Result.ok(encoders);
    }
}
