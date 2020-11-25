package com.kensbunker.micronaut.data.jdbc;

import edu.umd.cs.findbugs.annotations.NonNull;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;
import java.util.List;

@Repository
@JdbcRepository(dialect = Dialect.MYSQL)
public interface TransactionsRepository extends CrudRepository<Transaction, Long> {

  @Override
  List<Transaction> findAll();
}
