package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceDao extends CrudRepository <Invoice, Integer> {
}
