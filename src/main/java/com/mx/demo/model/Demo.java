package com.mx.demo.model;

import lombok.Data;

        import java.io.Serializable;

/**
 * 字典信息
 *
 * @author fengshuonan
 * @Date 2018/12/8 18:16
 */
@Data
public class Demo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String filePath;
    private String fileName;
    private String fileType;


}
