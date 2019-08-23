package com.ex.BParse.Dao;

import com.ex.BParse.Models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferDao extends JpaRepository<Item, Long> {
}
