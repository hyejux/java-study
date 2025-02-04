package com.ju.testing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyClass {
    private static final Logger logger = LoggerFactory.getLogger(MyClass.class);

    public static void main(String[] args) {
        logger.debug("디버그 로그");   // 개발용
        logger.info("정보 로그");    // 일반적인 정보 출력
        logger.warn("경고 로그");    // 경고 메시지
        logger.error("에러 로그");   // 에러 발생 시 기록
    }
}
