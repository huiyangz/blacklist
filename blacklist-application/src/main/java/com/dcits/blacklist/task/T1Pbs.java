package com.dcits.blacklist.task;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.dcits.blacklist.task.scenario.T1S1;
import com.dcits.blacklist.task.dto.*;
import com.dcits.common.task.Request;
import com.dcits.common.task.RespHeader;
import com.dcits.common.task.Response;

@RestController
@RequestMapping("/tasks")
@Tag(name = "任务场景接口")
public class T1Pbs implements IT1Contract {
    @Autowired
    private T1S1 t1s1;

    @PostMapping("/T1S1")
    @Operation(summary="检查黑名单")
    public Response<T1S1OutputDTO> executeT1S1(@RequestBody @Valid Request<T1S1InputDTO> req) {
        RespHeader respHeader = new RespHeader(req.getHeader());
        return new Response<>(respHeader, t1s1.execute(respHeader, req.getBody()));
    }
}