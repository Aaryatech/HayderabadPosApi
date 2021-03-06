package com.ats.webapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ats.webapi.model.Info;
import com.ats.webapi.model.bill.BillTransaction;
import com.ats.webapi.model.bill.Expense;
import com.ats.webapi.model.bill.ExpenseTransaction;
import com.ats.webapi.model.bill.GetBillListByFrIdToSettle;
import com.ats.webapi.repo.BillTransactionRepo;
import com.ats.webapi.repo.ExpenseRepo;
import com.ats.webapi.repositories.ExpenseTransactionRepo;
import com.ats.webapi.repositories.GetBillListByFrIdToSettleRepo;

@RestController
public class ExpenseApiController {

	/// harsha
	// *****************************Expense***************************************

	@Autowired
	ExpenseRepo expenseRepo;

	@RequestMapping(value = { "/saveExpense" }, method = RequestMethod.POST)
	@ResponseBody
	public Info saveExpense(@RequestBody Expense routeMaster) {

		Info info = new Info();
		Expense jsonResult = expenseRepo.save(routeMaster);

		try {
			if (jsonResult != null) {
				info.setError(false);
				info.setMessage("ItemSup Saved Successfully.");
			} else {
				info.setError(true);
				info.setMessage("ItemSup Not Saved .");
			}

		} catch (Exception e) {

			info.setError(true);
			info.setMessage("ItemSup Not Saved .");

		}

		return info;
	}

	@RequestMapping(value = "/getExpenseByFrId", method = RequestMethod.POST)
	public @ResponseBody List<Expense> getExpense(@RequestParam("frId") int frId, @RequestParam("type") int type,
			@RequestParam("fromDate") String fromDate, @RequestParam("toDate") String toDate) {
		System.out.println("inside rest /getItemsForManGrnByFrAndBill");
		List<Expense> grnItemConfigList = null;

		try {

			if (fromDate == null || toDate == null || type == 0) {
				grnItemConfigList = expenseRepo.getExpenseList(frId);

			} else {
				grnItemConfigList = expenseRepo.getExpenseList(frId, type, fromDate, toDate);

			}

			System.out.println("grn Item getItemForManualGrn  Rest: " + grnItemConfigList.toString());

		} catch (Exception e) {

			System.out.println(
					"restApi Exce for Getting Man GRN Item Conf /getItemsForManGrnByFrAndBill" + e.getMessage());
			e.printStackTrace();
		}

		return grnItemConfigList;

	}

	@RequestMapping(value = "/getAllExpense", method = RequestMethod.POST)
	public @ResponseBody List<Expense> getAllExpense(@RequestParam("type") int type,
			@RequestParam("fromDate") String fromDate, @RequestParam("toDate") String toDate,
			@RequestParam("frIdList") List<String> frIdList) {
		System.out.println("inside rest /getItemsForManGrnByFrAndBill");
		List<Expense> grnItemConfigList = null;

		try {
			System.err.println("frIdList" + frIdList.toString());

			if (frIdList.contains("-1")) {
				grnItemConfigList = expenseRepo.getAllExpenseList(type, fromDate, toDate);
			} else {
				grnItemConfigList = expenseRepo.getAllExpenseList(type, fromDate, toDate, frIdList);

			}

			System.out.println("grn Item getItemForManualGrn  Rest: " + grnItemConfigList.toString());

		} catch (Exception e) {

			System.out.println(
					"restApi Exce for Getting Man GRN Item Conf /getItemsForManGrnByFrAndBill" + e.getMessage());
			e.printStackTrace();
		}

		return grnItemConfigList;

	}

	@RequestMapping(value = { "/deleteExpense" }, method = RequestMethod.POST)
	public @ResponseBody Info deleteExpense(@RequestParam("expId") int expId) {

		Info info = new Info();
		try {

			int delete = expenseRepo.deleteExpense(expId);

			if (delete == 1) {
				info.setError(false);
				info.setMessage("deleted Successfully ");
			} else {
				info.setError(true);
				info.setMessage("deleted UnSuccessfully ");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		return info;

	}

	@RequestMapping(value = "/getExpenseByExpId", method = RequestMethod.POST)
	public @ResponseBody Expense getExpenseByExpId(@RequestParam("expId") int expId) {
		System.out.println("inside rest /getItemsForManGrnByFrAndBill");
		Expense grnItemConfigList = null;

		try {

			grnItemConfigList = expenseRepo.findByExpId(expId);

		} catch (Exception e) {

			System.out.println(
					"restApi Exce for Getting Man GRN Item Conf /getItemsForManGrnByFrAndBill" + e.getMessage());
			e.printStackTrace();
		}

		return grnItemConfigList;

	}

	@Autowired
	BillTransactionRepo billTransactionRepo;

	@RequestMapping(value = "/getBillTransactionByFrId", method = RequestMethod.POST)
	public @ResponseBody List<BillTransaction> getBillTransactionByFrId(
			@RequestParam("frIdList") List<String> frIdList) {
		System.out.println("inside rest /getItemsForManGrnByFrAndBill");
		List<BillTransaction> grnItemConfigList = null;

		try {
			if (frIdList.contains("-1")) {
				grnItemConfigList = billTransactionRepo.findByDelStatusAndIsClosed(0,0);
			} else {
				grnItemConfigList = billTransactionRepo.getAllTrancaction(frIdList,0);

			}

			System.out.println("grn Item getItemForManualGrn  Rest: " + grnItemConfigList.toString());

		} catch (Exception e) {

			System.out.println(
					"restApi Exce for Getting Man GRN Item Conf /getItemsForManGrnByFrAndBill" + e.getMessage());
			e.printStackTrace();
		}

		return grnItemConfigList;

	}

	@RequestMapping(value = { "/closeBill" }, method = RequestMethod.POST)
	public @ResponseBody Info closeBill(@RequestParam("tranId") int tranId) {

		Info info = new Info();
		try {

			int delete = billTransactionRepo.closeBill(tranId);

			if (delete == 1) {
				info.setError(false);
				info.setMessage("deleted Successfully ");
			} else {
				info.setError(true);
				info.setMessage("deleted UnSuccessfully ");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		return info;

	}

	@Autowired
	GetBillListByFrIdToSettleRepo getBillListByFrIdToSettleRepo;

	@RequestMapping(value = "/getBillByFrToSettle", method = RequestMethod.POST)
	public @ResponseBody List<GetBillListByFrIdToSettle> getBillByFrToSettle(@RequestParam("frId") int frId) {
		System.out.println("inside rest /getItemsForManGrnByFrAndBill");
		List<GetBillListByFrIdToSettle> grnItemConfigList = null;

		try {
			grnItemConfigList = getBillListByFrIdToSettleRepo.getBills(frId);

			System.out.println("grn Item getItemForManualGrn  Rest: " + grnItemConfigList.toString());

		} catch (Exception e) {

			System.out.println(
					"restApi Exce for Getting Man GRN Item Conf /getItemsForManGrnByFrAndBill" + e.getMessage());
			e.printStackTrace();
		}

		return grnItemConfigList;

	}

	@Autowired
	ExpenseTransactionRepo expenseTransactionRepo;

	@RequestMapping(value = { "/saveExpTransList" }, method = RequestMethod.POST)
	@ResponseBody
	public Info saveExpTransList(@RequestBody List<ExpenseTransaction> expTransList) {

		Info inf = new Info();

		try {

			for (int i = 0; i < expTransList.size(); i++) {
				ExpenseTransaction jsonResult = expenseTransactionRepo.save(expTransList.get(i));

				if (jsonResult != null) {

					float finPending = Float.parseFloat(jsonResult.getExVar1());
					float finPaid = Float.parseFloat(jsonResult.getBillAmt()) - finPending;
					int flag = 0;
					if (finPending <= 0) {

						System.err.println("in sat");
						flag = 1;
					}

					int del = billTransactionRepo.upDateBillAmt(String.valueOf(finPending), String.valueOf(finPaid),
							jsonResult.getBillHeadId(), flag);

					if (del == 1) {
						jsonResult.setExVar1("");

						expenseRepo.updateExpStatus(expTransList.get(i).getExpId());

					}
				}

			}

			inf.setError(false);
			inf.setMessage("success");
		} catch (Exception e) {

			inf.setError(true);
			inf.setMessage("fail");

			System.out.println(
					"restApi Exce for Getting Man GRN Item Conf /getItemsForManGrnByFrAndBill" + e.getMessage());
			e.printStackTrace();
		}

		return inf;
	}

}
