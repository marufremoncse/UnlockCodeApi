package com.codingsense.UnlockCodeApi.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;

/**
 *
 * @author marufur
 */

@Entity
@Table(name = "cbs_unlock_code_queue")
@EntityListeners(AuditingEntityListener.class)
public class UnlockCodeQueue {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @JsonProperty("mo_id")
    @Column(name = "mo_id", nullable = false)
    private String mo_id;
    
    @JsonProperty("code")
    @Column(name = "code", nullable = true)
    private String code; 
        
    @JsonProperty("price")
    @Column(name = "price", nullable = false)
    private String price;

    @JsonProperty("IMEI")
    @Column(name = "imei", nullable = false)
    private String imei;
    
    @JsonProperty("IMSI")
    @Column(name = "imsi", nullable = false)
    private String imsi;
    
    @JsonProperty("brand")
    @Column(name = "brand", nullable = false)
    private String brand;
    
    @JsonProperty("model")
    @Column(name = "model", nullable = false)
    private String model;    
}