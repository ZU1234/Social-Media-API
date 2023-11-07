package com.core.dao.Impl;

import com.core.dao.UserDao;
import com.core.model.UserModel;
import com.core.repository.UserModelRepository;
import com.core.validate.UserValidate;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.core.query.Criteria;
import org.springframework.data.cassandra.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDaoImpl implements UserDao {
    private final UserModelRepository userModelRepository;
    private final CassandraTemplate cassandraTemplate;
    private final CassandraOperations cassandraOperations;
    private final UserValidate userValidate;

    public UserDaoImpl(UserModelRepository userModelRepository, CassandraTemplate cassandraTemplate, CassandraOperations cassandraOperations, UserValidate userValidate) {
        this.userModelRepository = userModelRepository;
        this.cassandraTemplate = cassandraTemplate;
        this.cassandraOperations = cassandraOperations;
        this.userValidate = userValidate;
    }

    @Override
    public UserModel save(UserModel user) {
        userValidate.checkEmailUniqueness(user.getEmail());
        return cassandraOperations.insert(user);
    }

    @Override
    public List<UserModel> getAll() {
        return (List<UserModel>) userModelRepository.findAll();
    }

    @Override
    public UserModel findByEmail(String email) {
        Query query = Query.query(Criteria.where("email").is(email));
        return cassandraTemplate.selectOne(query, UserModel.class);
    }

    @Override
    public boolean remove(String id) {
        return cassandraTemplate.deleteById(id, UserModel.class);
    }
}
