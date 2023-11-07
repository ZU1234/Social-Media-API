package com.core.validate;

import com.core.model.UserModel;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.core.query.Criteria;
import org.springframework.data.cassandra.core.query.Query;
import org.springframework.stereotype.Component;

@Component
public class UserValidate {
    private CassandraTemplate cassandraTemplate;

    public UserValidate(CassandraTemplate cassandraTemplate) {
        this.cassandraTemplate = cassandraTemplate;
    }

    public void checkEmailUniqueness(String email) {
        if (isEmailExists(email)) {
            throw new IllegalArgumentException("Email adresi zaten kullanılıyor.");
        }
    }

    public boolean isEmailExists(String email) {
        Query query = Query.query(Criteria.where("email").is(email));
        long count = cassandraTemplate.count(query, UserModel.class);
        return count > 0;
    }

}
