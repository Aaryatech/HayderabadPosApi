package com.ats.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ats.webapi.model.FranchiseeSalesDetails;

public interface FranchiseeSalesDetailsRepo extends JpaRepository<FranchiseeSalesDetails, Integer> {
	
	@Query(value="SELECT\n" + 
			"    UUID() id, fr.fr_id, fr.fr_name, itm.id AS item_id, itm.item_name, dtl.mrp, SUM(dtl.qty) AS qty,\n" + 
			"    SUM(dtl.taxable_amt) taxable_amt,\n" + 
			"    SUM(dtl.total_tax) AS total_tax,\n" + 
			"    SUM(dtl.disc_amt) AS disc,\n" + 
			"    SUM(dtl.grand_total) AS grand_total\n" + 
			"FROM\n" + 
			"    t_sell_bill_header hd,\n" + 
			"    t_sell_bill_detail dtl,\n" + 
			"    m_franchisee fr,\n" + 
			"    m_item itm\n" + 
			"WHERE\n" + 
			"    fr.fr_id = :frId AND fr.fr_id = hd.fr_id AND \n" + 
			"    itm.id = dtl.item_id AND \n" + 
			"    hd.sell_bill_no = dtl.sell_bill_no AND \n" + 
			"    hd.del_status = 0 AND hd.bill_date BETWEEN :fromDate AND :toDate\n" + 
			"GROUP BY\n" + 
			"    dtl.item_id",nativeQuery=true)
	List<FranchiseeSalesDetails> getFrItemSalesDetails(@Param("frId") int frId, @Param("fromDate") String fromDate, 
			@Param("toDate") String toDate);

}
