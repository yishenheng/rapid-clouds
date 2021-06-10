//package com.yishenheng.common.config;
//
//import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
//import org.apache.ibatis.reflection.MetaObject;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDateTime;
//
///**
// * @author yishenheng
// * @date 6/10/21 4:52 PM
// */
//@Component
//public class MyMetaObjectHandler implements MetaObjectHandler {
//    @Override
//    public void insertFill(MetaObject metaObject) {
//        this.fillStrategy(metaObject, "createTime", LocalDateTime.now());
//        this.fillStrategy(metaObject, "updateTime", LocalDateTime.now());
//    }
//
//    @Override
//    public void updateFill(MetaObject metaObject) {
//        this.fillStrategy(metaObject, "updateTime", LocalDateTime.now());
//    }
//}
