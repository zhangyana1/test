package util;

import org.apache.log4j.PropertyConfigurator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * Created by Administrator on 2018/5/7.
 */
public class LogConfiguration {
    public static void initLog(String filename){

        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
        String date=dateFormat.format(new Date());
        final String logfilepath=("./Log/"+filename+"/"+filename+date+".log");

        Properties properties=new Properties();
        properties.setProperty("log4j.rootLogger","info,toFile,toConsole");
        properties.setProperty("log4j.appender.toConsole","org.apache.log4j.ConsoleAppender");
        properties.setProperty("log4j.appender.toConsole.layout","org.apache.log4j.PatternLayout");
        properties.setProperty("log4j.appender.toConsole.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");
        properties.setProperty("log4j.appender.toFile","org.apache.log4j.DailyRollingFileAppender");
        properties.setProperty("log4j.appender.toFile.layout","org.apache.log4j.PatternLayout");
        properties.setProperty("log4j.appender.toFile.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}][%p] %m%n");
        properties.setProperty("log4j.appender.toFile.file",logfilepath);

        PropertyConfigurator.configure(properties);
    }
}
