package com.codeqm.pojo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

/**
 * @since: 2025/6/9 10:19
 * @author: qm
 * @description: 用户实体类, 设置参数校验
 * 1. name字段不能为null或空
 * 字符串 @NotBlank  集合 @NotEmpty 包装类型 @NotNull
 * 2. password长度不能小于6位
 * 3. age必须大于等于1
 * 4. email必须符合邮箱格式
 * 5. birthday必须为过去合法日期格式
 */
@Data
public class User {
    @NotBlank
    private String name;
    @Length(min = 6)
    private String password;
    @Min(1)
    private int age;
    @Email
    private String email;
    @Past
    private Date birthday;
}
