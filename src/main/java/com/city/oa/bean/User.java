package com.city.oa.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private Integer age;
    private String act;
    private String pwd;
    private String username;
    private String sex;
    private String phone;

}
