package com.woniu.w1d2springiocannotation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor  // 全参构造函数
@NoArgsConstructor
public class Album {
    //价格
    private String price;
    //歌手
    private String singer;
    //歌曲数目
    private Integer songNum;
}
