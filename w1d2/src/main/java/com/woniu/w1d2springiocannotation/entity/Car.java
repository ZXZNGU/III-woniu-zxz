package com.woniu.w1d2springiocannotation.entity;

import lombok.*;

@Data // @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode.
@AllArgsConstructor  // 全参构造函数
@NoArgsConstructor   // 无参构造函数
public class Car {

    // 发动机 - 引擎
    private String engine;

    // 轮子
    private String tire = null;

    // 玻璃
    private String glass = null;
}
