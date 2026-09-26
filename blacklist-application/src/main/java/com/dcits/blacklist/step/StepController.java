package com.dcits.blacklist.step;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcits.blacklist.facade.bo.ST001InputBO;
import com.dcits.blacklist.facade.bo.ST001OutputBO;

/**
 * 步骤控制器
 */
@RestController
@RequestMapping("steps")
public class StepController {
    
    @Autowired
    private IST001 st001;

    /**
     * 执行ST001-检查黑名单步骤
     * @param input 输入参数
     * @return 输出结果
     */
    @PostMapping("/ST001")
    public ST001OutputBO executeST001(@RequestBody ST001InputBO input) {
        return st001.execute(input);
    }

}