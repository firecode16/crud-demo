package com.company.crud.repository;

import com.company.crud.entity.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author FireCode16
 */
@Repository
public interface AppCrudRepository extends CrudRepository<Cart, Object> {
}
