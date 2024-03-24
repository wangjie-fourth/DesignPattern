package org.github.fourth.desgin.pattern.behavioral.interpreter.basic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    private String sku;
    private String name;
    private Color color;
    private ProductSize size;
    private float price;
}
