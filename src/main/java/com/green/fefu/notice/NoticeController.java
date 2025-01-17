package com.green.fefu.notice;

import com.green.fefu.common.model.ResultDto;
import com.green.fefu.notice.model.*;
import java.util.List;

public interface NoticeController {
    ResultDto<Integer> postNotice(PostNoticeReq p);
    ResultDto<List<GetNoticeRes>> getNotice(GetNoticeReq p);

    ResultDto<Integer> putNotice(PutNoticeReq p);

    ResultDto<Integer> deleteNotice(DeleteNoticeReq p);

}
