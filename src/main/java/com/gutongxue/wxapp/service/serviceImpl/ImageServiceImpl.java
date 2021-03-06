package com.gutongxue.wxapp.service.serviceImpl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.gutongxue.wxapp.dao.ImageMapper;
import com.gutongxue.wxapp.domain.ImageDO;
import com.gutongxue.wxapp.domain.ImageVO;
import com.gutongxue.wxapp.domain.QueryParam;
import com.gutongxue.wxapp.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    ImageMapper imageMapper;

    @Override
    public int countImageByDescription(String description){
        return imageMapper.countImageByDescription(description);
    }

    @Override
    public void insertImage(ImageDO imageDO){
        imageMapper.insertImage(imageDO);
    }

    @Override
    public void deleteImage(int id) {
        imageMapper.deleteImage(id);
    }

    @Override
    public int deleteRepeatImage() {
        return imageMapper.deleteRepeatImage();
    }

    @Override
    public void updateImageStatus(int id, int status, String now) {
        imageMapper.updateImageStatus(id,status,now);
    }

    @Override
    public List<ImageVO> listImage(QueryParam queryParam) {
        //分页插件: 查询第1页，每页10行
        Page<ImageVO> page = PageHelper.startPage(queryParam.getPage(), queryParam.getSize());
        imageMapper.listImage(queryParam);
        //数据表的总行数
//        page.getTotal();
        //分页查询结果的总行数
//        page.size();
        //第一个User对象，参考list，序号0是第一个元素，依此类推
//        page.get(0);
        return page;
    }

    @Override
    public int countImage(QueryParam queryParam) {
        return imageMapper.countImage(queryParam);
    }
}
