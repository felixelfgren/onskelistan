package com.santashelpers.onskelistan;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ListRepository extends CrudRepository<WishList, Long> {
    List<WishList> findAllByOrderByName();
    List<WishList> findAllByOrderById();

}
