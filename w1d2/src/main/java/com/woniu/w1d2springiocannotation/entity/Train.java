package com.woniu.w1d2springiocannotation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor  // 全参构造函数
@NoArgsConstructor
public class Train {
    private String material;

    // 发动机 - 引擎
    private String engine;

    // 轮子
    private String tire = null;

    // 玻璃
    private String glass = null;
}
