package com.bootcamp.tecnologia.infrastructure.adapters.persistenceadapter.repository;

import com.bootcamp.tecnologia.infrastructure.adapters.persistenceadapter.entity.UserEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;


@Repository
public interface UserRepository extends ReactiveCrudRepository<UserEntity, Long> {
    Mono<UserEntity> findByEmail(String email);
}
