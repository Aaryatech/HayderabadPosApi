package com.ats.webapi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ats.webapi.model.FranchiseeSalesTotal;

public interface FranchiseeSalesTotalRepo extends JpaRepository<FranchiseeSalesTotal, Integer> {

	@Query(value="SELECT fr.fr_id,\n" + 
			"		fr.fr_name,\n" + 
			"        SUM(hd.grand_total)AS grand_total\n" + 
			"FROM\n" + 
			"    t_sell_bill_header hd,\n" + 
			"   	m_franchisee fr\n" + 
			"WHERE\n" + 
			"	hd.bill_date BETWEEN :fromDate AND :toDate AND\n" + 
			"	hd.del_status=0 AND\n" + 
			"    hd.fr_id=fr.fr_id\n" + 
			"GROUP BY fr.fr_id",nativeQuery=true)
	public List<FranchiseeSalesTotal> getTotalFranchiseeSale(@Param("fromDate") String fromDate, @Param("toDate") String toDate);
}
