package com.company.crud.service;

import com.company.crud.entity.Cart;
import com.company.crud.entity.OrderInfo;
import com.company.crud.repository.AppCrudRepository;
import com.company.crud.repository.AppOrderInfoRepository;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author FireCode16
 */
@Service
public class AppCrudService {

    @Autowired
    private AppCrudRepository appRepository;
    @Autowired
    private AppOrderInfoRepository orderInfoRepository;
    private int result = 0;

    @Transactional(readOnly = true)
    public List<Cart> getLoadData() {
        List<Cart> arrCart = (List<Cart>) appRepository.findAll();
        return arrCart;
    }

    @Transactional
    public int getSaveData() {
        List<OrderInfo> lstOrderInfo = (List<OrderInfo>) orderInfoRepository.findAll();

        final Cart model = new Cart();

        if (!lstOrderInfo.isEmpty()) {
            lstOrderInfo.forEach(entity -> {
                model.setSku(entity.getSku());
                model.setName(entity.getName());
                model.setAddress(entity.getAddress());
                model.setItemNumber(entity.getItemNumber());
                model.setStore(entity.getStore());
                model.setDateTransac(LocalDate.now().toString());
                orderInfoRepository.insert(model);
            });
        }
        result = 1;
        return (result == 1) ? 1 : 0;
    }
}
