package lk.ijse.dep.rest.service.custom.impl;

import lk.ijse.dep.rest.dto.CustomerDTO;
import lk.ijse.dep.rest.service.custom.ManageCustomersService;

import java.util.List;

public class ManageItemServiceImpl implements ManageCustomersService {
    @Override
    public List<CustomerDTO> getCustomers() {
        return null;
    }

    @Override
    public void createCustomer(CustomerDTO dto) {

    }

    @Override
    public void updateCustomer(CustomerDTO dto) {

    }

    @Override
    public void deleteCustomer(String customerID) {

    }

    @Override
    public CustomerDTO findCustomer(String id) {
        return null;
    }

    @Override
    public List <CustomerDTO> findCustomersByAddress(String address) {
        return null;
    }
}
