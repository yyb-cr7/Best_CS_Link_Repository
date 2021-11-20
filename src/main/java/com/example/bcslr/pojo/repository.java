package com.example.bcslr.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class repository {
    @TableId(type = IdType.AUTO)
    private Integer ID;
    private String name;
    private String keywords;
    private String comment;
    private Integer quality;
    private Integer UserId;
    private  Data CreateTime;
    private  Data UpdateTime;
}


