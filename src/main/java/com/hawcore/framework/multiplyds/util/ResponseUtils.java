package com.hawcore.framework.multiplyds.util;

import com.baomidou.mybatisplus.plugins.Page;

import java.util.List;

public class ResponseUtils {

    public static <T> PageResponseDTO<T> buildResult(Page<T> page) {
        PageResponseDTO<T> responseDTO = new PageResponseDTO<>();
        responseDTO.setList(page.getRecords());
        responseDTO.setTotal(page.getTotal());
        responseDTO.setCurrent(page.getCurrent());
        return responseDTO;
    }
}
