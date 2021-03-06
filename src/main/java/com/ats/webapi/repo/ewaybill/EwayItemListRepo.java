package com.ats.webapi.repo.ewaybill;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ats.webapi.model.ewaybill.EwayItemList;

public interface EwayItemListRepo extends JpaRepository<EwayItemList, Integer> {

	@Query(value = " SELECT t_bill_detail.bill_detail_no,t_bill_detail.bill_qty as quantity,"
			+ "t_bill_detail.cgst_per as cgst_rate, " + "t_bill_detail.sgst_per as sgst_rate, "
			+ "t_bill_detail.igst_per as igst_rate, " + "t_bill_detail.cess_per as cess_rate, "
			+ "t_bill_detail.cess_rs as cess_non_advol, " + "t_bill_detail.taxable_amt as taxable_amount, "
			+ "m_item.item_name as product_name, " + "m_item.item_name as product_desc, "
			+ "m_item_sup.item_hsncd as hsn_code, " + "m_item_sup.item_uom as qty_unit "
			+ "	FROM m_item_sup,m_item,t_bill_detail "
			+ "WHERE m_item_sup.item_id=m_item.id AND m_item.id=t_bill_detail.item_id "
			+ "AND t_bill_detail.bill_no=:billNo", nativeQuery = true)
	public List<EwayItemList> getBillDetailForEwayBill(@Param("billNo") int billNo);

	@Query(value = " SELECT t_credit_note_details.crnd_id as bill_detail_no,t_credit_note_details.grn_gvn_qty "
			+ "as quantity, t_credit_note_details.cgst_per as cgst_rate, t_credit_note_details.sgst_per as sgst_rate,"
			+ " t_credit_note_details.igst_per as igst_rate, t_credit_note_details.cess_per as cess_rate, "
			+ "t_credit_note_details.cess_rs as cess_non_advol, t_credit_note_details.taxable_amt as "
			+ "taxable_amount, m_item.item_name as product_name, m_item.item_name as product_desc, "
			+ "m_item_sup.item_hsncd as hsn_code, m_item_sup.item_uom as qty_unit "
			+ "FROM m_item_sup,m_item, t_credit_note_details "
			+ "WHERE m_item_sup.item_id=m_item.id AND m_item.id=t_credit_note_details.item_id AND "
			+ "t_credit_note_details.crn_id=:crnId", nativeQuery = true)
	public List<EwayItemList> getCreditNoteDetailForEwayBill(@Param("crnId") int crnId);

}
