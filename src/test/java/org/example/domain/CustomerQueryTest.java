package org.example.domain;

import java.util.List;

import org.example.domain.query.QCustomer;
import org.testng.annotations.Test;

import io.ebean.Ebean;


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
