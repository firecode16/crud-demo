package com.company.crud.repository;

import com.company.crud.entity.Cart;
import com.company.crud.entity.OrderInfo;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author FireCode16
 */
@Repository
public interface AppOrderInfoRepository extends CrudRepository<OrderInfo, Object> {

    @Modifying(clearAutomatically = true)
    @Query(value = "Insert Into cart(sku, name, address, item_number, store, date_transac) "
            + "Values (:#{#data.sku}, :#{#data.name}, :#{#data.address}, :#{#data.itemNumber}, :#{#data.store}, :#{#data.dateTransac})", nativeQuery = true)
    int insert(@Param("data") Cart data);
}
