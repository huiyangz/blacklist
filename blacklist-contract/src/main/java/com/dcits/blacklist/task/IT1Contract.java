package com.dcits.blacklist.task;

import com.dcits.blacklist.task.dto.*;
import com.dcits.common.task.Request;
import com.dcits.common.task.Response;

public interface IT1Contract {
    Response<T1S1OutputDTO> executeT1S1(Request<T1S1InputDTO> input);
}