package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Entity
@Component
public class Purchase {
	@Id
	@GeneratedValue
	private int pId;
	private String oCode;
	private String shMode;
	private String vendor;
	private int refNum;
	private String qcheck;
	private String dstatus; 
	private String pdes;
	
	public Purchase() {
		super();
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getoCode() {
		return oCode;
	}

	public void setoCode(String oCode) {
		this.oCode = oCode;
	}

	public String getShMode() {
		return shMode;
	}

	public void setShMode(String shMode) {
		this.shMode = shMode;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public int getRefNum() {
		return refNum;
	}

	public void setRefNum(int refNum) {
		this.refNum = refNum;
	}

	public String getQcheck() {
		return qcheck;
	}

	public void setQcheck(String qcheck) {
		this.qcheck = qcheck;
	}

	public String getDstatus() {
		return dstatus;
	}

	public void setDstatus(String dstatus) {
		this.dstatus = dstatus;
	}

	public String getPdes() {
		return pdes;
	}

	public void setPdes(String pdes) {
		this.pdes = pdes;
	}

	@Override
	public String toString() {
		return "Purchase [pId=" + pId + ", oCode=" + oCode + ", shMode=" + shMode + ", vendor=" + vendor + ", refNum="
				+ refNum + ", qcheck=" + qcheck + ", dstatus=" + dstatus + ", pdes=" + pdes + "]";
	}
	
 
}
