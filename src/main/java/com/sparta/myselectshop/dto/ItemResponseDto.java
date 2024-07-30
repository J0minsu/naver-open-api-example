package com.sparta.myselectshop.dto;

import com.sparta.myselectshop.entity.Item;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ItemResponseDto {

    private final List<Item> items = new ArrayList<>();

    public void setItems(Item item) {
        items.add(item);
    }
}