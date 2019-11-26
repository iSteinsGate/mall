package com.mall.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @author tsinghui
 * @data 2019-11-26
 */
@Getter
@Setter
@NoArgsConstructor
public class Page implements Serializable {
    private static final long serialVersionUID = 7209859522754328742L;

    private int pageNum;
    private int pageSize;
    private long total;
    private List data;

}