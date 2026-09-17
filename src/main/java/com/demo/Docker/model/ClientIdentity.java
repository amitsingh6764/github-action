package com.demo.Docker.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ClientIdentity implements Serializable {
	
    @Column(name = "ccd_mem_cd")
	private String ccdmemcd;
    
    @Column(name = "ccd_cd")
    private String ccdcd;
    
    @Column(name = "ccd_seg_ind")
    private String ccdsegInd;

}
