package Test;

public class Account {

	private String name;
	private String email;
	private long accno;
	private float amount;
	public String getname()
	{
	return name;	
	}
	public String getemail()
	{
	return email;	
	}
	public long getaccno()
	{
	return accno;	
	}
	public float getamount()
	{
	return amount;	
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setemail(String email)
	{
		this.email=email;
	}
	public void setaccno(long accno)
	{
		this.accno=accno;
	}
	public void setamount(float amount)
	{
		this.amount=amount;
	}
	
	
}
