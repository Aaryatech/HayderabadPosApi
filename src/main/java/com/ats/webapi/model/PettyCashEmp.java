package com.ats.webapi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="petty_cash_emp")
public class PettyCashEmp implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="petty_emp_id")
	private int pettyEmpId;
	
	@Column(name="emp_fr_id")
	private int empFrId;
	
	@Column(name="emp_name")
	private String empName;
	
	@Column(name="emp_mob")
	private String empMob;
	
	@Column(name="emp_add")
	private String empAdd;
	
	@Column(name="del_status")
	private int delStatus;
	
	@Column(name="ex_var1")
	private String exVar1;
	
	@Column(name="ex_var2")
	private String exVar2;
	
	@Column(name="ex_var3")
	private String exVar3;
	
	@Column(name="ex_var4")
	private String exVar4;
	
	@Column(name="ex_int1")
	private int exInt1;
		
	@Column(name="ex_int2")
	private int exInt2;
	
	@Column(name="ex_int3")
	private int exInt3;
	
	@Column(name="ex_int4")
	private int exInt4;
	
	public int getPettyEmpId() {
		return pettyEmpId;
	}
	public void setPettyEmpId(int pettyEmpId) {
		this.pettyEmpId = pettyEmpId;
	}
	public int getEmpFrId() {
		return empFrId;
	}
	public void setEmpFrId(int empFrId) {
		this.empFrId = empFrId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpMob() {
		return empMob;
	}
	public void setEmpMob(String empMob) {
		this.empMob = empMob;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	public int getDelStatus() {
		return delStatus;
	}
	public void setDelStatus(int delStatus) {
		this.delStatus = delStatus;
	}
	public String getExVar1() {
		return exVar1;
	}
	public void setExVar1(String exVar1) {
		this.exVar1 = exVar1;
	}
	public String getExVar2() {
		return exVar2;
	}
	public void setExVar2(String exVar2) {
		this.exVar2 = exVar2;
	}
	public String getExVar3() {
		return exVar3;
	}
	public void setExVar3(String exVar3) {
		this.exVar3 = exVar3;
	}
	public String getExVar4() {
		return exVar4;
	}
	public void setExVar4(String exVar4) {
		this.exVar4 = exVar4;
	}
	public int getExInt1() {
		return exInt1;
	}
	public void setExInt1(int exInt1) {
		this.exInt1 = exInt1;
	}
	public int getExInt2() {
		return exInt2;
	}
	public void setExInt2(int exInt2) {
		this.exInt2 = exInt2;
	}
	public int getExInt3() {
		return exInt3;
	}
	public void setExInt3(int exInt3) {
		this.exInt3 = exInt3;
	}
	public int getExInt4() {
		return exInt4;
	}
	public void setExInt4(int exInt4) {
		this.exInt4 = exInt4;
	}
	@Override
	public String toString() {
		return "PettyCashEmp [pettyEmpId=" + pettyEmpId + ", empFrId=" + empFrId + ", empName=" + empName + ", empMob="
				+ empMob + ", empAdd=" + empAdd + ", delStatus=" + delStatus + ", exVar1=" + exVar1 + ", exVar2="
				+ exVar2 + ", exVar3=" + exVar3 + ", exVar4=" + exVar4 + ", exInt1=" + exInt1 + ", exInt2=" + exInt2
				+ ", exInt3=" + exInt3 + ", exInt4=" + exInt4 + "]";
	}
	
}
