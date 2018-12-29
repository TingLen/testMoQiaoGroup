package com.moqiao.service;

import com.moqiao.pojo.QqcMctwarningnew;

import java.util.List;

public interface WarnInfoService {
    List<QqcMctwarningnew> getWarningData(String Parts ,String type);
}
