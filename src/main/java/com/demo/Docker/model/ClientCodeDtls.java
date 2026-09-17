package com.demo.Docker.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "client_code_dtls")
@Data
@Builder
@DynamicUpdate
@NoArgsConstructor
@AllArgsConstructor
public class ClientCodeDtls {
	
	@EmbeddedId
    private ClientIdentity id;
	
	@Column(name = "ccd_mobile")
	private String ccdMobile;
	
	@Column(name = "ccd_pan")
	private String ccdPan;
    
    @Column(name = "ccd_email")
    private String ccdEmail;
    
    @Column(name = "ccd_opt_for_upi")
    private String ccdOptForUpi;
    
    @Column(name = "ccd_gender")
	private String ccdGender;
    
    @Column(name = "ccd_marital")
    private String ccdMarital;
    
    @Column(name = "ccd_father_name")
    private String ccdFatherName;
    
    @Column(name = "ccd_category")
	private String ccdCategory;
    
    @Column(name = "ccd_client_type")
    private String ccdClientType;
    
    @Column(name = "ccd_clt_status")
    private String ccdClientStatus;
    
    @Column(name = "ccd_dob")
	private String ccddob;
    
    @Column(name = "ccd_country")
    private String ccdCountry;
    
    @Column(name = "ccd_pri_depo")
    private String ccdPriDepo;
    
    @Column(name = "ccd_depos_name")
	private String ccdDepoName;
    
    @Column(name = "ccd_depo_id")
    private String ccdDepoId;
    
    @Column(name = "ccd_benef_acc")
    private String ccdBenfAcc;
    
    @Column(name = "ccd_depos_name2")
	private String ccdDepoName2;
    
    @Column(name = "ccd_depo_id2")
    private String ccdDepoId2;
    
    @Column(name = "ccd_benef_acc2")
    private String ccdBenfAcc2;

    @Column(name = "ccd_depos_name3")
	private String ccdDepoName3;
    
    @Column(name = "ccd_depo_id3")
    private String ccdDepoId3;
    
    @Column(name = "ccd_benef_acc3")
    private String ccdBenfAcc3;
    
    @Column(name = "ccd_depos_name4")
	private String ccdDepoName4;
    
    @Column(name = "ccd_depo_id4")
    private String ccdDepoId4;
    
    @Column(name = "ccd_benef_acc4")
    private String ccdBenfAcc4;
    
    @Column(name = "ccd_depos_name5")
	private String ccdDepoName5;
    
    @Column(name = "ccd_depo_id5")
    private String ccdDepoId5;
    
    @Column(name = "ccd_benef_acc5")
    private String ccdBenfAcc5;    
    
    @Column(name = "ccd_pri_bnk")
    private String ccdPribnk;
    
    @Column(name = "ccd_bnk_name")
	private String ccdBankName;
    
    @Column(name = "ccd_bnk_ifsc")
    private String ccdBankIfsc;
    
    @Column(name = "ccd_bnk_acc")
    private String ccdBnkAcc;
    
    @Column(name = "ccd_bnk_name2")
	private String ccdBankName2;
    
    @Column(name = "ccd_bnk_ifsc2")
    private String ccdBankIfsc2;
    
    @Column(name = "ccd_bnk_acc2")
    private String ccdBnkAcc2;

    @Column(name = "ccd_bnk_name3")
	private String ccdBankName3;
    
    @Column(name = "ccd_bnk_ifsc3")
    private String ccdBankIfsc3;
    
    @Column(name = "ccd_bnk_acc3")
    private String ccdBnkAcc3;

    @Column(name = "ccd_bnk_name4")
	private String ccdBankName4;
    
    @Column(name = "ccd_bnk_ifsc4")
    private String ccdBankIfsc4;
    
    @Column(name = "ccd_bnk_acc4")
    private String ccdBnkAcc4;
    
    @Column(name = "ccd_bnk_name5")
	private String ccdBankName5;
    
    @Column(name = "ccd_bnk_ifsc5")
    private String ccdBankIfsc5;
    
    @Column(name = "ccd_bnk_acc5")
    private String ccdBnkAcc5;
    
    @Column(name="ccd_upd_by")
    private String ccdupdBy;
    
    @CreatedDate
    @Column(name = "ccd_crt_date", updatable = false)
    private LocalDateTime createdDate;

    @LastModifiedDate
    @Column(name = "lst_upd_date")
    private LocalDateTime updatedDate;
    
    @Column(name="ccd_name_desc")
    private String ccdNameDesc;
    
    @Column(name="ccd_nom_flag")
    private String ccdNomFlag;
    
    @Column(name="ccd_net_worth")
    private String ccdNetWorth;
    
    @Column(name="ccd_pep")
    private String ccdPep;
    
    @Column(name="ccd_poi")
    private String ccdPoi;
    
    @Column(name="ccd_occupation")
    private String ccdOccupation;
    
    @Column(name="ccd_cin")
    private String ccdCin;
    
    @Column(name="ccd_relationship")
    private String ccdRelationship;
    
    @Column(name="ccd_Facility_type")
    private String ccdFacilityType;
    
    @Column(name="ccd_proof_type")
    private String ccdProofType;
    
    @Column(name="ccd_proof_no")
    private String ccdProofNo;
}
