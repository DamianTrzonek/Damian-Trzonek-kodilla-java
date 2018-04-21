package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Plain")
                .burgers(2)
                .sauce("BBQ sauce")
                .ingredients("Onion")
                .ingredients("Pickle")
                .ingredients("Cheese")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String whatBun = bigmac.getBun();
        String whatSauce = bigmac.getSauce();

        //Then
        Assert.assertEquals(3,howManyIngredients);
        Assert.assertEquals(2,howManyBurgers);
        Assert.assertEquals("Plain",whatBun);
        Assert.assertEquals("BBQ sauce", whatSauce);

    }
}
