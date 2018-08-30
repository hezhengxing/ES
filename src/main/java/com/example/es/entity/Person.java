package com.example.es.entity;

import com.example.es.config.BaseEntity;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @Author: hzx
 * @Date: 2018/8/27 17:57
 * @Description:
 * @Modify By:
 */
@Data
@Document(indexName = "person",type = "person",shards = 1,replicas = 0)
public class Person extends BaseEntity {
    private String name;
    private int sex;
    private String idCard;
    private String personContactId;

    /**
     * 性别
     */
    public enum sex {
        MAN(142, "男"), WOMEN(143, "女"), UNKNOWN(144, "未知");
        private Integer value;
        private String remark;

        sex(Integer value, String remark) {
            this.value = value;
            this.remark = remark;
        }

        public Integer getValue() {
            return value;
        }

        public String getRemark() {
            return remark;
        }
    }
}
