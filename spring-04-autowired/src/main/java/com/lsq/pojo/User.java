package com.lsq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author linshengqian
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Cat cat;
    private Dog dog;
    private String str;
}
