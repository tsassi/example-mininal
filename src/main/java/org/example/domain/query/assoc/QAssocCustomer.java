package org.example.domain.query.assoc;


import org.example.domain.Customer;
import org.example.domain.query.QCustomer;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;

/**
 * Association query bean for AssocCustomer.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QAssocCustomer<R> extends TQAssocBean<Customer,R> {

  public PLong<R> id;
  public PString<R> name;
  public PString<R> notes;
  public PLong<R> version;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetch(TQProperty<QCustomer>... properties) {
    return fetchProperties(properties);
  }

  public QAssocCustomer(String name, R root) {
    super(name, root);
  }
}
