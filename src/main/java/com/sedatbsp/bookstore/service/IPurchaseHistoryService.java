package com.sedatbsp.bookstore.service;

import com.sedatbsp.bookstore.model.PurchaseHistory;
import com.sedatbsp.bookstore.repository.projection.IPurchaseItem;

import java.util.List;

/**
 * @author Sedat Başpınar
 * @created 21.09.2021 - 2:47 PM
 * @project book-store
 */
public interface IPurchaseHistoryService {

    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}
