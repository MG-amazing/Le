package logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * logback 可以记录文件的运行状态
 */
public class log_back {
    //创建logback 的日志对象
    public static final Logger LOGGER= LoggerFactory.getLogger("log_back.class");
    public static void main(String[] args) {
        while (true) {
            LOGGER.debug("main:方法开始执行");
            LOGGER.info("开始第二行日志，开始做除法");
            int a=10;
            int b=0;
            LOGGER.trace("a="+a);
            LOGGER.trace("b="+b);

        }

    }
}
