package com.sumit.tableserve_backend.entities;


import com.sumit.tableserve_backend.enus.Status;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Document("shops")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Shop {
    @Id
    private String shopId;

    @Indexed(unique = true)
    private String username;
    @NonNull
    private String shopName;
    @NonNull
    private String shopAddress;
    @NonNull
    private String shopCity;
    @NonNull
    private String idenity;
    @NonNull
    private String phone;

    private String email;

    @DBRef
    private List<Item> items= new ArrayList<>();

    private String image;
    private String description;
    private Status status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
