package com.core.aop;

import com.core.model.UserModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class CreateUserOperationAspect {
    private final static Logger LOG = LogManager.getLogger(CreateUserOperationAspect.class);
    @Before("execution(* org.springframework.data.cassandra.core.CassandraOperations.insert(..)) && args(user)")
    public void beforeCassandraSave(UserModel user) {
        LOG.info("Before Cassandra save interceptor started. (User)");

        user.setStartDate(new Date());

        LOG.info("Before Cassandra save interceptor finished. (User)");
    }

}
