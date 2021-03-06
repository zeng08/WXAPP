package com.gutongxue.wxapp.service;

import com.gutongxue.wxapp.domain.ImageDO;
import com.gutongxue.wxapp.domain.QueryParam;
import com.gutongxue.wxapp.domain.VideoDO;
import com.gutongxue.wxapp.domain.VideoVO;

import java.util.List;

public interface VideoService {
    void insertVideo(VideoDO videoDO);
    int deleteRepeatVideo();
    List<VideoVO> listVideo(QueryParam queryParam);
    int countVideo(QueryParam queryParam);
    int countVideoByDescription(String description);
}
