package com.core.repository;

import com.core.model.ShareModel;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface ShareRepository extends CassandraRepository<ShareModel, UUID> {
}
