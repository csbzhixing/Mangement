package com.mangement.mybatis.mappers;


import java.util.List;

import com.mangement.mybatis.model.CompanyInvoice;

public interface CompanyInvoiceMapper {
	public void insert(CompanyInvoice companyInvoice);
	public void deleteById(Integer C_invoice_ID);
	public CompanyInvoice findById(Integer C_invoice_ID);
	public List<CompanyInvoice> find();
	public void updateById(CompanyInvoice companyInvoice);
}
