package Project;

public class ComplaintDetails {

	String dateReceived;
	String product;
	String subProduct;
	String issue;
	String subIssue;
	String company;
	String state;
	String ZIPcode;
	String submittedVia;
	String dateSentToCompany;
	String companyResponseToConsumer;
	String timelyResponse;
	String consumerDisputed;
	
	
	public ComplaintDetails() {
		super();
		// TODO Auto-generated constructor stub
		this.dateReceived = "12-01-2013 ";
		this.product = " ";
		this.subProduct = " ";
		this.issue = "checking insert is working or not";
		this.subIssue = " ";
		this.company = " ";
		this.state = " ";
		ZIPcode = " ";
		this.submittedVia = " ";
		this.dateSentToCompany =" ";
		this.companyResponseToConsumer =" ";
		this.timelyResponse = " ";
		this.consumerDisputed = " ";
	}


	public ComplaintDetails(String dateReceived, String product, String subProduct, String issue, String subIssue,
			String company, String state, String zIPcode, String submittedVia, String dateSentToCompany,
			String companyResponseToConsumer, String timelyResponse, String consumerDisputed) {
		super();
		this.dateReceived = dateReceived;
		this.product = product;
		this.subProduct = subProduct;
		this.issue = issue;
		this.subIssue = subIssue;
		this.company = company;
		this.state = state;
		ZIPcode = zIPcode;
		this.submittedVia = submittedVia;
		this.dateSentToCompany = dateSentToCompany;
		this.companyResponseToConsumer = companyResponseToConsumer;
		this.timelyResponse = timelyResponse;
		this.consumerDisputed = consumerDisputed;
	}
	
	
}
