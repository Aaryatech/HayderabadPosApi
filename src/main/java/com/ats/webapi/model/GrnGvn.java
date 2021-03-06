package com.ats.webapi.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "t_grn_gvn")
public class GrnGvn  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "grn_gvn_id")
	int grnGvnId;

	@Column(name = "grn_gvn_date")
	Date grnGvnDate;
	

	@Column(name = "bill_no")
	private int billNo;

	@Column(name = "fr_id")
	private int frId;

	@Column(name = "item_id")
	private int itemId;
	
	@Column(name = "item_rate")
	private float itemRate;
	
	@Column(name = "item_mrp")
	private float itemMrp;

	@Column(name = "grn_gvn_qty")
	private int grnGvnQty;

	@Column(name = "grn_gvn_amt")
	private float grnGvnAmt;

	@Column(name = "grn_type")
	private int grnType;
	
	@Column(name = "is_grn")
	private int isGrn;
	
	@Column(name = "is_grn_edit")
	private int isGrnEdit;
	
	@Column(name = "grn_gvn_entry_datetime")
	private String grnGvnEntryDateTime;

	@Column(name = "fr_grn_gvn_remark")
	private String frGrnGvnRemark;

	@Column(name = "gvn_photo_upload1")
	private String gvnPhotoUpload1;

	@Column(name = "gvn_photo_upload2")
	private String gvnPhotoUpload2;

	@Column(name = "grn_gvn_status")
	private int grnGvnStatus;

	@Column(name = "approved_login_gate")
	private int approvedLoginGate;

	@Column(name = "approved_datetime_gate")
	private String approveimedDateTimeGate;

	@Column(name = "approved_remark_gate")
	private String approvedRemarkGate;

	@Column(name = "approved_login_store")
	private int approvedLoginStore;

	@Column(name = "approved_datetime_store")
	private String approvedDateTimeStore;

	@Column(name = "approved_remark_store")
	private String approvedRemarkStore;

	@Column(name = "approved_login_acc")
	private int approvedLoginAcc;

	@Column(name = "approved_datetime_acc")
	private String grnApprovedDateTimeAcc;

	@Column(name = "approved_remark_acc")
	private String approvedRemarkAcc;
	

	@Column(name = "del_status")
	private int delStatus;
	
	@Column(name = "grn_gvn_qty_auto")
	private int grnGvnQtyAuto;
	
	
	
//newly added 04/11/17
	
	@Column(name = "is_tally_sync")
	private int isTallySync;
	
	
	@Column(name = "base_rate")
	private float baseRate;
	
	@Column(name = "sgst_per")
	private float sgstPer;
	
	@Column(name = "cgst_per")
	private float cgstPer;
	
	@Column(name = "igst_per")
	private float igstPer;
	
	@Column(name = "taxable_amt")
	private float taxableAmt;
	
	@Column(name = "total_tax")
	private float totalTax;
	
	
	
	@Column(name = "round_up_amt")
	private float roundUpAmt;
	
	@Column(name = "final_amt")
	private float finalAmt;
	
	
	@Column(name = "is_credit_note")
	private int isCreditNote;
	
	
	//newly added
	

	@Column(name = "menu_id")
	private int menuId;
	

	@Column(name = "cat_id")
	private int catId;
	

	@Column(name = "invoice_no")
	private String invoiceNo;
	

	@Column(name = "ref_invoice_date")
	private Date refInvoiceDate;
	
	@Column(name = "bill_detail_no")
	private int billDetailNo;
	
	
	@Column(name = "grn_gvn_header_id")
	private int grnGvnHeaderId;
	
	
	//23 FEB new Fields to handle qty variation between entry(insert) and dispatch
	@Column(name = "apr_qty_gate")
	int aprQtyGate;
	
	@Column(name = "apr_qty_store")
	int aprQtyStore;
	
	@Column(name = "apr_qty_acc")
	int aprQtyAcc;
	
	@Column(name = "apr_taxable_amt")
	float aprTaxableAmt;
	
	@Column(name = "apr_total_tax")
	float aprTotalTax;
	
	@Column(name = "apr_sgst_rs")
	float aprSgstRs;
	
	@Column(name = "apr_cgst_rs")
	float aprCgstRs;
	
	@Column(name = "apr_igst_rs")
	float aprIgstRs;
	
	@Column(name = "apr_grand_total")
	float aprGrandTotal;
	
	@Column(name = "apr_r_off")
	float aprROff;

	@Column(name = "is_same_state")
	int isSameState;
	//23 FEB new Fields to handle qty variation between entry(insert) and dispatch
	
	private String hsnCode;
		
	
	
	/*@Column(name = "int1")
	private int int1;
	
	@Column(name = "int2")
	private int int2;
	
	@Column(name = "int3")
	private int int4;
	
	@Column(name = "int5")
	private int int5;
	
	@Column(name = "int6")
	private int int6;
	
	@Column(name = "varchar1")
	private String varchar1;
	
	@Column(name = "varchar2")
	private String varchar2;
	
	@Column(name = "varchar3")
	private String varchar3;
	
	@Column(name = "varchar4")
	private String varchar4;*/
	
	
	public String getHsnCode() {
		return hsnCode;
	}

	public void setHsnCode(String hsnCode) {
		this.hsnCode = hsnCode;
	}

	public int getIsCreditNote() {
		return isCreditNote;
	}

	public void setIsCreditNote(int isCreditNote) {
		this.isCreditNote = isCreditNote;
	}

	public int getGrnGvnId() {
		return grnGvnId;
	}

	public void setGrnGvnId(int grnGvnId) {
		this.grnGvnId = grnGvnId;
	}
	//@JsonFormat(locale = "hi",timezone = "Asia/Kolkata", pattern = "dd-MM-yyyy")

	public Date getGrnGvnDate() {
		return grnGvnDate;
	}

	
	//@JsonFormat(locale = "hi",timezone = "Asia/Kolkata", pattern = "yyyy-MM-dd")
	public void setGrnGvnDate(Date grnGvnDate) {
		this.grnGvnDate = grnGvnDate;
	}

	public int getBillNo() {
		return billNo;
	}

	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}

	public int getFrId() {
		return frId;
	}

	public void setFrId(int frId) {
		this.frId = frId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public float getItemRate() {
		return itemRate;
	}

	public void setItemRate(float itemRate) {
		this.itemRate = itemRate;
	}

	public float getItemMrp() {
		return itemMrp;
	}

	public void setItemMrp(float itemMrp) {
		this.itemMrp = itemMrp;
	}

	public int getGrnGvnQty() {
		return grnGvnQty;
	}

	public void setGrnGvnQty(int grnGvnQty) {
		this.grnGvnQty = grnGvnQty;
	}

	public float getGrnGvnAmt() {
		return grnGvnAmt;
	}

	public void setGrnGvnAmt(float grnGvnAmt) {
		this.grnGvnAmt = grnGvnAmt;
	}

	public int getGrnType() {
		return grnType;
	}

	public void setGrnType(int grnType) {
		this.grnType = grnType;
	}

	public int getIsGrn() {
		return isGrn;
	}

	public void setIsGrn(int isGrn) {
		this.isGrn = isGrn;
	}

	public int getIsGrnEdit() {
		return isGrnEdit;
	}

	public void setIsGrnEdit(int isGrnEdit) {
		this.isGrnEdit = isGrnEdit;
	}

	public String getGrnGvnEntryDateTime() {
		return grnGvnEntryDateTime;
	}

	public void setGrnGvnEntryDateTime(String grnGvnEntryDateTime) {
		this.grnGvnEntryDateTime = grnGvnEntryDateTime;
	}

	

	public String getFrGrnGvnRemark() {
		return frGrnGvnRemark;
	}

	public void setFrGrnGvnRemark(String frGrnGvnRemark) {
		this.frGrnGvnRemark = frGrnGvnRemark;
	}

	public String getGvnPhotoUpload1() {
		return gvnPhotoUpload1;
	}

	public void setGvnPhotoUpload1(String gvnPhotoUpload1) {
		this.gvnPhotoUpload1 = gvnPhotoUpload1;
	}

	public String getGvnPhotoUpload2() {
		return gvnPhotoUpload2;
	}

	public void setGvnPhotoUpload2(String gvnPhotoUpload2) {
		this.gvnPhotoUpload2 = gvnPhotoUpload2;
	}

	public int getGrnGvnStatus() {
		return grnGvnStatus;
	}

	public void setGrnGvnStatus(int grnGvnStatus) {
		this.grnGvnStatus = grnGvnStatus;
	}

	public int getApprovedLoginGate() {
		return approvedLoginGate;
	}

	public void setApprovedLoginGate(int approvedLoginGate) {
		this.approvedLoginGate = approvedLoginGate;
	}

	public String getApproveimedDateTimeGate() {
		return approveimedDateTimeGate;
	}

	public void setApproveimedDateTimeGate(String approveimedDateTimeGate) {
		this.approveimedDateTimeGate = approveimedDateTimeGate;
	}

	public String getApprovedRemarkGate() {
		return approvedRemarkGate;
	}

	public void setApprovedRemarkGate(String approvedRemarkGate) {
		this.approvedRemarkGate = approvedRemarkGate;
	}

	public int getApprovedLoginStore() {
		return approvedLoginStore;
	}

	public void setApprovedLoginStore(int approvedLoginStore) {
		this.approvedLoginStore = approvedLoginStore;
	}

	public String getApprovedDateTimeStore() {
		return approvedDateTimeStore;
	}

	public void setApprovedDateTimeStore(String approvedDateTimeStore) {
		this.approvedDateTimeStore = approvedDateTimeStore;
	}

	public String getApprovedRemarkStore() {
		return approvedRemarkStore;
	}

	public void setApprovedRemarkStore(String approvedRemarkStore) {
		this.approvedRemarkStore = approvedRemarkStore;
	}

	public int getApprovedLoginAcc() {
		return approvedLoginAcc;
	}

	public void setApprovedLoginAcc(int approvedLoginAcc) {
		this.approvedLoginAcc = approvedLoginAcc;
	}

	public String getGrnApprovedDateTimeAcc() {
		return grnApprovedDateTimeAcc;
	}

	public void setGrnApprovedDateTimeAcc(String grnApprovedDateTimeAcc) {
		this.grnApprovedDateTimeAcc = grnApprovedDateTimeAcc;
	}

	public String getApprovedRemarkAcc() {
		return approvedRemarkAcc;
	}

	public void setApprovedRemarkAcc(String approvedRemarkAcc) {
		this.approvedRemarkAcc = approvedRemarkAcc;
	}

	public int getDelStatus() {
		return delStatus;
	}

	public void setDelStatus(int delStatus) {
		this.delStatus = delStatus;
	}

	public int getGrnGvnQtyAuto() {
		return grnGvnQtyAuto;
	}

	public void setGrnGvnQtyAuto(int grnGvnQtyAuto) {
		this.grnGvnQtyAuto = grnGvnQtyAuto;
	}

	public int getIsTallySync() {
		return isTallySync;
	}

	public void setIsTallySync(int isTallySync) {
		this.isTallySync = isTallySync;
	}

	public float getBaseRate() {
		return baseRate;
	}

	public void setBaseRate(float baseRate) {
		this.baseRate = baseRate;
	}

	public float getSgstPer() {
		return sgstPer;
	}

	public void setSgstPer(float sgstPer) {
		this.sgstPer = sgstPer;
	}

	public float getCgstPer() {
		return cgstPer;
	}

	public void setCgstPer(float cgstPer) {
		this.cgstPer = cgstPer;
	}

	public float getIgstPer() {
		return igstPer;
	}

	public void setIgstPer(float igstPer) {
		this.igstPer = igstPer;
	}

	public float getTaxableAmt() {
		return taxableAmt;
	}

	public void setTaxableAmt(float taxableAmt) {
		this.taxableAmt = taxableAmt;
	}

	public float getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(float totalTax) {
		this.totalTax = totalTax;
	}

	
	public float getRoundUpAmt() {
		return roundUpAmt;
	}

	public void setRoundUpAmt(float roundUpAmt) {
		this.roundUpAmt = roundUpAmt;
	}

	public float getFinalAmt() {
		return finalAmt;
	}

	public void setFinalAmt(float finalAmt) {
		this.finalAmt = finalAmt;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public Date getRefInvoiceDate() {
		return refInvoiceDate;
	}
	
	@JsonFormat(locale = "hi",timezone = "Asia/Kolkata", pattern = "yyyy-MM-dd")
	public void setRefInvoiceDate(Date refInvoiceDate) {
		
		this.refInvoiceDate = refInvoiceDate;
		
	}

	public int getBillDetailNo() {
		return billDetailNo;
	}

	public void setBillDetailNo(int billDetailNo) {
		this.billDetailNo = billDetailNo;
	}

	public int getGrnGvnHeaderId() {
		return grnGvnHeaderId;
	}

	public void setGrnGvnHeaderId(int grnGvnHeaderId) {
		this.grnGvnHeaderId = grnGvnHeaderId;
	}

	public int getAprQtyGate() {
		return aprQtyGate;
	}

	public void setAprQtyGate(int aprQtyGate) {
		this.aprQtyGate = aprQtyGate;
	}

	public int getAprQtyStore() {
		return aprQtyStore;
	}

	public void setAprQtyStore(int aprQtyStore) {
		this.aprQtyStore = aprQtyStore;
	}

	public int getAprQtyAcc() {
		return aprQtyAcc;
	}

	public void setAprQtyAcc(int aprQtyAcc) {
		this.aprQtyAcc = aprQtyAcc;
	}

	public float getAprTaxableAmt() {
		return aprTaxableAmt;
	}

	public void setAprTaxableAmt(float aprTaxableAmt) {
		this.aprTaxableAmt = aprTaxableAmt;
	}

	public float getAprTotalTax() {
		return aprTotalTax;
	}

	public void setAprTotalTax(float aprTotalTax) {
		this.aprTotalTax = aprTotalTax;
	}

	public float getAprSgstRs() {
		return aprSgstRs;
	}

	public void setAprSgstRs(float aprSgstRs) {
		this.aprSgstRs = aprSgstRs;
	}

	public float getAprCgstRs() {
		return aprCgstRs;
	}

	public void setAprCgstRs(float aprCgstRs) {
		this.aprCgstRs = aprCgstRs;
	}

	public float getAprIgstRs() {
		return aprIgstRs;
	}

	public void setAprIgstRs(float aprIgstRs) {
		this.aprIgstRs = aprIgstRs;
	}

	public float getAprGrandTotal() {
		return aprGrandTotal;
	}

	public void setAprGrandTotal(float aprGrandTotal) {
		this.aprGrandTotal = aprGrandTotal;
	}

	public float getAprROff() {
		return aprROff;
	}

	public void setAprROff(float aprROff) {
		this.aprROff = aprROff;
	}

	

	public int getIsSameState() {
		return isSameState;
	}

	public void setIsSameState(int isSameState) {
		this.isSameState = isSameState;
	}

	@Override
	public String toString() {
		return "GrnGvn [grnGvnId=" + grnGvnId + ", grnGvnDate=" + grnGvnDate + ", billNo=" + billNo + ", frId=" + frId
				+ ", itemId=" + itemId + ", itemRate=" + itemRate + ", itemMrp=" + itemMrp + ", grnGvnQty=" + grnGvnQty
				+ ", grnGvnAmt=" + grnGvnAmt + ", grnType=" + grnType + ", isGrn=" + isGrn + ", isGrnEdit=" + isGrnEdit
				+ ", grnGvnEntryDateTime=" + grnGvnEntryDateTime + ", frGrnGvnRemark=" + frGrnGvnRemark
				+ ", gvnPhotoUpload1=" + gvnPhotoUpload1 + ", gvnPhotoUpload2=" + gvnPhotoUpload2 + ", grnGvnStatus="
				+ grnGvnStatus + ", approvedLoginGate=" + approvedLoginGate + ", approveimedDateTimeGate="
				+ approveimedDateTimeGate + ", approvedRemarkGate=" + approvedRemarkGate + ", approvedLoginStore="
				+ approvedLoginStore + ", approvedDateTimeStore=" + approvedDateTimeStore + ", approvedRemarkStore="
				+ approvedRemarkStore + ", approvedLoginAcc=" + approvedLoginAcc + ", grnApprovedDateTimeAcc="
				+ grnApprovedDateTimeAcc + ", approvedRemarkAcc=" + approvedRemarkAcc + ", delStatus=" + delStatus
				+ ", grnGvnQtyAuto=" + grnGvnQtyAuto + ", isTallySync=" + isTallySync + ", baseRate=" + baseRate
				+ ", sgstPer=" + sgstPer + ", cgstPer=" + cgstPer + ", igstPer=" + igstPer + ", taxableAmt="
				+ taxableAmt + ", totalTax=" + totalTax + ", roundUpAmt=" + roundUpAmt + ", finalAmt=" + finalAmt
				+ ", isCreditNote=" + isCreditNote + ", menuId=" + menuId + ", catId=" + catId + ", invoiceNo="
				+ invoiceNo + ", refInvoiceDate=" + refInvoiceDate + ", billDetailNo=" + billDetailNo
				+ ", grnGvnHeaderId=" + grnGvnHeaderId + ", aprQtyGate=" + aprQtyGate + ", aprQtyStore=" + aprQtyStore
				+ ", aprQtyAcc=" + aprQtyAcc + ", aprTaxableAmt=" + aprTaxableAmt + ", aprTotalTax=" + aprTotalTax
				+ ", aprSgstRs=" + aprSgstRs + ", aprCgstRs=" + aprCgstRs + ", aprIgstRs=" + aprIgstRs
				+ ", aprGrandTotal=" + aprGrandTotal + ", aprROff=" + aprROff + ", isSameState=" + isSameState
				+ ", hsnCode=" + hsnCode + "]";
	}

	

	/*public int getInt1() {
		return int1;
	}

	public void setInt1(int int1) {
		this.int1 = int1;
	}

	public int getInt2() {
		return int2;
	}

	public void setInt2(int int2) {
		this.int2 = int2;
	}

	public int getInt4() {
		return int4;
	}

	public void setInt4(int int4) {
		this.int4 = int4;
	}

	public int getInt5() {
		return int5;
	}

	public void setInt5(int int5) {
		this.int5 = int5;
	}

	public int getInt6() {
		return int6;
	}

	public void setInt6(int int6) {
		this.int6 = int6;
	}

	public String getVarchar1() {
		return varchar1;
	}

	public void setVarchar1(String varchar1) {
		this.varchar1 = varchar1;
	}

	public String getVarchar2() {
		return varchar2;
	}

	public void setVarchar2(String varchar2) {
		this.varchar2 = varchar2;
	}

	public String getVarchar3() {
		return varchar3;
	}

	public void setVarchar3(String varchar3) {
		this.varchar3 = varchar3;
	}

	public String getVarchar4() {
		return varchar4;
	}

	public void setVarchar4(String varchar4) {
		this.varchar4 = varchar4;
	}

	*/
	
	
	
}
