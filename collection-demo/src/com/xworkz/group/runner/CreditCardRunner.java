package com.xworkz.group.runner;

import com.xworkz.group.dto.CreditCardDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class CreditCardRunner {
    public static void main(String[] args) {
        CreditCardDTO creditCardDTO1 = new CreditCardDTO("Visa", "1234 5678 9012 3456", LocalDate.of(2026, 5, 15), 123);
        CreditCardDTO creditCardDTO2 = new CreditCardDTO("MasterCard", "2345 6789 0123 4567", LocalDate.of(2024, 8, 20), 234);
        CreditCardDTO creditCardDTO3 = new CreditCardDTO("Amex", "3456 7890 1234 5678", LocalDate.of(2026, 12, 31), 345);
        CreditCardDTO creditCardDTO4 = new CreditCardDTO("Discover", "4567 8901 2345 6789", LocalDate.of(2023, 4, 22), 456);
        CreditCardDTO creditCardDTO5 = new CreditCardDTO("Visa", "5678 9012 3456 7890", LocalDate.of(2025, 11, 10), 567);
        CreditCardDTO creditCardDTO6 = new CreditCardDTO("MasterCard", "6789 0123 4567 8901", LocalDate.of(2026, 3, 5), 678);
        CreditCardDTO creditCardDTO7 = new CreditCardDTO("Amex", "7890 1234 5678 9012", LocalDate.of(2027, 1, 1), 789);
        CreditCardDTO creditCardDTO8 = new CreditCardDTO("Discover", "8901 2345 6789 0123", LocalDate.of(2026, 7, 7), 890);
        CreditCardDTO creditCardDTO9 = new CreditCardDTO("Visa", "9012 3456 7890 1234", LocalDate.of(2028, 9, 9), 901);
        CreditCardDTO creditCardDTO10 = new CreditCardDTO("MasterCard", "0123 4567 8901 2345", LocalDate.of(2026, 11, 11), 123);

        Collection<CreditCardDTO> collection = new ArrayList<>();
        collection.add(creditCardDTO1);
        collection.add(creditCardDTO2);
        collection.add(creditCardDTO3);
        collection.add(creditCardDTO4);
        collection.add(creditCardDTO5);
        collection.add(creditCardDTO6);
        collection.add(creditCardDTO7);
        collection.add(creditCardDTO8);
        collection.add(creditCardDTO9);
        collection.add(creditCardDTO10);

        for (CreditCardDTO card : collection)
        {
            if (card.getExpiryDate().getYear() > 2026)
            {
                System.out.println(card);
            }
        }

        System.out.println("==========================");

        for(CreditCardDTO card : collection)
        {
            if (card.getType().equals("Visa"))
            {
                System.out.println("Credit Card Type:" +card.getType());
            }

        }

        System.out.println("==========================");

        for(CreditCardDTO card : collection)
        {
            System.out.println("CVV:" +card.getCvv());
        }

        System.out.println("==========================");

        for(CreditCardDTO card : collection)
        {
            System.out.println("Credit Card no:" +card.getNo());
        }

    }
}
//find all creditCardDTO where expiryDate > 2026
//find all creditCardDTO by type(visa,rupay,master)
//print all cvv
//print all no
