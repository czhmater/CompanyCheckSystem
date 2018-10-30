package team.yingyingmonster.ccs.commons.log4j2;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.db.ColumnMapping;
import org.apache.logging.log4j.core.appender.db.jdbc.ColumnConfig;
import org.apache.logging.log4j.core.appender.db.jdbc.JdbcAppender;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.LoggerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

/**
 * @author Juer Whang <br/>
 * - project: CompanyCheckSystem
 * - create: 15:53 2018/10/29
 * -
 **/
@Component
public class LoggerBean {
    @PostConstruct
    private void init() {
        LoggerContext context = (LoggerContext) LogManager.getContext(false);
        Configuration config = context.getConfiguration();

        ColumnConfig[] columnConfigs = {
                ColumnConfig.newBuilder().setConfiguration(config)
                        .setName("LOGTHREAD")
                        .setPattern("%t").build(),
                ColumnConfig.newBuilder().setConfiguration(config)
                        .setName("LOGCLASS")
                        .setPattern("%c").build(),
                ColumnConfig.newBuilder().setConfiguration(config)
                        .setName("LOGTIME")
                        .setEventTimestamp(true).build(),
                ColumnConfig.newBuilder().setConfiguration(config)
                        .setName("LOGMESSAGE")
                        .setPattern("%m").build(),
                ColumnConfig.newBuilder().setConfiguration(config)
                        .setName("LOGLOCATE")
                        .setPattern("%l").build(),
                ColumnConfig.newBuilder().setConfiguration(config)
                        .setName("LOGLEVEL")
                        .setPattern("%p").build(),
        };

        JdbcAppender appender = JdbcAppender.newBuilder()
                .setConfiguration(config)
                .withName("databaseAppender")
                .setConnectionSource(new JuerDataSource())
                .setTableName("LOG_TABLE")
                .setColumnConfigs(columnConfigs)
                .setColumnMappings(new ColumnMapping[0])
                .build();
        appender.start();
        config.addAppender(appender);

        LoggerConfig loggerConfig = new LoggerConfig("team.yingyingmonster", Level.DEBUG, false);

        loggerConfig.addAppender(appender, Level.ERROR, null);
        config.addLogger("syncDatabaseLogger", loggerConfig);
        context.updateLoggers();
    }
}
