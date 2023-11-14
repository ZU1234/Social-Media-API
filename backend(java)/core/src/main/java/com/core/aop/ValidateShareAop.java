package com.core.aop;

import com.core.model.ShareModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class ValidateShareAop {
    private final static Logger LOG = LogManager.getLogger(CreateUserOperationAspect.class);
    @Before("execution(* org.springframework.data.cassandra.core.CassandraOperations.insert(..)) && args(share)")
    public void beforeCassandraSave(ShareModel share) {
        LOG.info("Before Cassandra save interceptor started. (Share)");

        share.setStartDate(new Date());

        LOG.info("Before Cassandra save interceptor finished. (Share)");
    }

}
