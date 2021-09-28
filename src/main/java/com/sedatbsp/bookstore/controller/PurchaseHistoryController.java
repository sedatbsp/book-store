package com.sedatbsp.bookstore.controller;

import com.sedatbsp.bookstore.model.PurchaseHistory;
import com.sedatbsp.bookstore.security.UserPrincipal;
import com.sedatbsp.bookstore.service.IPurchaseHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

/**
 * @author Sedat Başpınar
 * @created 28.09.2021 - 5:14 PM
 * @project book-store
 */
@RestController
@RequestMapping("api/purchase-history") // path
public class PurchaseHistoryController {

    @Autowired
    private IPurchaseHistoryService purchaseHistoryService;

    @PostMapping // api/purchase-history
    public ResponseEntity<?> savePurchaseHistory(@RequestBody PurchaseHistory purchaseHistory){
        purchaseHistoryService.savePurchaseHistory(purchaseHistory);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping // api/purchase-history
    public ResponseEntity<?> getAllPurchasesOfUser(@AuthenticationPrincipal UserPrincipal userPrincipal){
        return ResponseEntity.ok(purchaseHistoryService.findPurchasedItemsOfUser(userPrincipal.getId()));

    }


}
