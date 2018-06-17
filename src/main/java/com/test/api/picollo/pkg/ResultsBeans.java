/**
 * 
 */
package com.test.api.picollo.pkg;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * @author harvy.torres
 *
 */

@JacksonXmlRootElement(localName = "Row")
public class ResultsBeans {

	private long SEQNO;
	
	private String INSPECTIONTYPE;
	
	private String INSPECTIONEVENT;

	private String PONO;

	private String EARLIESTSHIPDATE;

	private String INSPECTIONREQUIRED;
	
	private String REQUESTEDSHIPDATE;
	
	private long FACTORYID;

	private String FACTORYNAME;

	private String FACTORYADDRESS;
	
	private String FACTORYCITY;

	private String FACTORYPROVINCE;

	private long FACTORYPOSTALCODE;
	
	private String FACTORYCOUNTRY;
	
	private String FACTORYCONTACTNAME;
	
	private long FACTORYPHONE;
	
	private long FACTORYFAX;
	
	private String FACTORYEMAIL;		

	private long VENDORID;

	private String VENDORNAME;

	private String VENDORADDRESS;
	
	private String VENDORCITY;
	
	private String VENDORPROVINCE;
	
	private long VENDORPOSTALCODE;
	
	private String VENDORCOUNTRY;
	
	private String VENDORCONTACTNAME;	

	private String VENDORCONTACTPHONE;
	
	private long VENDORCONTACTFAX;

	private String VENDORCONTACTEMAIL;
	
	private String REVISIONFLAG;	

	private String INSPECTIONEVENTDATE;

	private String PREVIOUSINSPECTIONNO;
}
