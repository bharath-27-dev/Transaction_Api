package com.bharath.Transactions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "Transaction_Data")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    @Id
    private ObjectId id; // Use camelCase for better readability

    private String date;

    private String place;

     // Consider using a date-time library

    private Double amount;
}