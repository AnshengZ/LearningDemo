package com.shop.annotation;

import java.lang.annotation.*;

/**
 * @Author:YangZP
 * @Description:
 * @Date:Created in 10:222018/3/30
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Login {
    public boolean value() default true;
}
