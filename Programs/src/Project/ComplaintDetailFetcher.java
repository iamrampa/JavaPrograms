package Project;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ComplaintDetailFetcher {

	
UsBankFileRead bankfileR= new UsBankFileRead();

Scanner sc=new Scanner(System.in);

void loadData()
{
	bankfileR.fileLoader();
}
void complaintsBasedOnYear(String year)
{
	for (HashMap.Entry<String,ComplaintDetails> entry :bankfileR.GetMapBankobjcompdet().entrySet()) 
	{
		
		if(entry.getValue().dateReceived.contains(year))
			  {
			System.out.println(year);
		  		System.out.println(entry.getValue().issue);
			  }
	}
	
}
	
	
	
	
void complaintsBasedOnCompany(String u_company)
{
for (HashMap.Entry<String,ComplaintDetails> entry :bankfileR.GetMapBankobjcompdet().entrySet()) 
{
  if(entry.getValue().company.toLowerCase().contains(u_company.toLowerCase()))
  {
	  System.out.println(entry.getValue().issue);
  }
}
}
void complaintsBasedOnComplaintID(String id)
{
for (HashMap.Entry<String,ComplaintDetails> entry :bankfileR.GetMapBankobjcompdet().entrySet()) 
{
  if(bankfileR.GetMapBankobjcompdet().containsKey(id))
  {
	  if(entry.getKey().equals(id))
	  System.out.println(entry.getValue().dateReceived + " "+ entry.getValue().product+" "+entry.getValue().subProduct+" "+entry.getValue().issue+" "+entry.getValue().subIssue+" "+entry.getValue().company+" "+entry.getValue().ZIPcode+" "+entry.getValue().state+" "+entry.getValue().submittedVia+" "+entry.getValue().dateSentToCompany+" "+entry.getValue().companyResponseToConsumer+" "+entry.getValue().timelyResponse+" "+entry.getValue().consumerDisputed);
  }
  else
  {
	  	System.out.println("Complaint ID does not exists.");
	  
  }
}
}
/*void complaintsBasedOnComplaintID(String id)
{
	Set<String> keys=bankfileR.GetMapBankobjcompdet().keySet();
	for(String k : keys)
	{
		//System.out.println(k);
		if(k.equals(id))
			{
			//System.out.println(k+"hi");
			
			System.out.println(bankfileR.GetMapBankobjcompdet().get(k).company);
			}
	}
}*/
void NoOfDaysTOCloseComplaint(String id)
{
	
}
void complaintsClosed()
{
for (HashMap.Entry<String,ComplaintDetails> entry :bankfileR.GetMapBankobjcompdet().entrySet()) 
{
	String compResp=entry.getValue().companyResponseToConsumer;
	//System.out.println(compResp);

  if(compResp.equalsIgnoreCase("Closed") || compResp.equalsIgnoreCase("Closed with explanation"))
  {
	  System.out.println(entry.getValue().dateReceived + " "+ entry.getValue().product+" "+entry.getValue().subProduct+" "+entry.getValue().issue+" "+entry.getValue().subIssue+" "+entry.getValue().company+" "+entry.getValue().ZIPcode+" "+entry.getValue().state+" "+entry.getValue().submittedVia+" "+entry.getValue().dateSentToCompany+" "+entry.getValue().companyResponseToConsumer+" "+entry.getValue().timelyResponse+" "+entry.getValue().consumerDisputed);
  }
  
}
}
void complaintsReceivingTimelyResponse()
{
for (HashMap.Entry<String,ComplaintDetails> entry :bankfileR.GetMapBankobjcompdet().entrySet()) 
{
	if(entry.getValue().timelyResponse.equals("Yes"))
	{
		System.out.println(entry.getValue().dateReceived + " "+ entry.getValue().product+" "+entry.getValue().subProduct+" "+entry.getValue().issue+" "+entry.getValue().subIssue+" "+entry.getValue().company+" "+entry.getValue().ZIPcode+" "+entry.getValue().state+" "+entry.getValue().submittedVia+" "+entry.getValue().dateSentToCompany+" "+entry.getValue().companyResponseToConsumer+" "+entry.getValue().timelyResponse+" "+entry.getValue().consumerDisputed);
	}
}
}

void doInsert(String cid,ComplaintDetails c1)
{
	bankfileR.MapBankobjcompdet.put(cid, c1);
}
public ComplaintDetailFetcher() {
	super();
}
}