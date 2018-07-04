package org.example.domain;

import io.ebean.Ebean;
import org.example.domain.query.QCustomer;
import org.testng.annotations.Test;

public class CustomerQueryTest {

  @Test
  public void findAll() {

    Ebean.find(Customer.class).findList();

    List<Customer> lista 
      = new QCustomer()
      .id.greaterOrEqualTo(1L)
      .findList();
  }
}
