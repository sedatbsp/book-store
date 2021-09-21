package com.sedatbsp.bookstore.repository.projection;

import java.time.LocalDateTime;

/**
 * @author Sedat Başpınar
 * @created 21.09.2021 - 2:03 PM
 * @project book-store
 */
public interface IPurchaseItem {

    String getTitle();
    Double getPrice();
    LocalDateTime getPurchaseTime();


}
