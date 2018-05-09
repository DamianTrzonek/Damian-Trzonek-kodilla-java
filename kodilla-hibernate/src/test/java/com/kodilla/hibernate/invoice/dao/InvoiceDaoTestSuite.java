package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Football");
        Product product2 = new Product("Football training cone");
        Item item1 = new Item(new BigDecimal(20), 10);
        Item item2 = new Item(new BigDecimal(5), 100);
        Invoice invoice = new Invoice("1");
        product1.getItems().add(item1);
        product2.getItems().add(item2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item1.setProduct(product1);
        item2.setProduct(product2);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        Assert.assertNotEquals(0,invoiceId);

        //Cleanup
        //invoiceDao.delete(invoiceId);
    }
}