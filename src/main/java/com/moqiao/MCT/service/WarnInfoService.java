package com.moqiao.MCT.service;

import com.moqiao.MCT.pojo.QqcMctwarningnew;

import java.util.List;

public interface WarnInfoService {
    List<QqcMctwarningnew> getWarningData(String Parts ,String type);
}
