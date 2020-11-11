package com.liang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class T_student {
    private int id;
    private String name;
    private String sex;
    private int schoolid;
    private Date create_time;
    private Date update_time;
}
