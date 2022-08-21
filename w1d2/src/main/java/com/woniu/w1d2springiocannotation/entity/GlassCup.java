package com.woniu.w1d2springiocannotation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor  // 全参构造函数
@NoArgsConstructor
public class GlassCup {
    private String glass;
    private String brand;
}
