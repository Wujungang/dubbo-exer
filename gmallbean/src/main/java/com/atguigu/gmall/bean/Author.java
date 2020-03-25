package com.atguigu.gmall.bean;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author testjava
 * @since 2020-03-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Author implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column
    private Integer id;
    @Column
    private String name;


}
