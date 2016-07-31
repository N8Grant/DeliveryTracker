package application.model;

public class Operator 
{
	private String name;
	private boolean on_delivery;
	
	public Operator (String nm, boolean delivery)
	{
		this.name = nm;
		this.on_delivery = delivery;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public boolean isOn_delivery() 
	{
		return on_delivery;
	}

	public void setOn_delivery(boolean on_delivery) 
	{
		this.on_delivery = on_delivery;
	}
	
}
