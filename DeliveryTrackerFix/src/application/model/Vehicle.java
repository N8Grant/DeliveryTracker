package application.model;

public class Vehicle 
{
	private int chairs_cap;
	private int roundtables_cap;
	private int eightfoottable_cap;
	private int chairs;
	private int tables;
	
	public Vehicle (VehicleType type)
	{
		switch (type)
		{
			case RACK_TRUCK:
				chairs_cap = 200;
				roundtables_cap = 20;
				eightfoottable_cap = 15;
				break;
			case BOX_TRUCK:
				chairs_cap = 200;
				roundtables_cap = 20;
				eightfoottable_cap = 15;
				break;
			case PICKUP_TRUCK:
				chairs_cap = 200;
				roundtables_cap = 20;
				eightfoottable_cap = 15;
				break;
		}	
	}

	public int getChairs_cap() 
	{
		return chairs_cap;
	}

	public void setChairs_cap(int chairs_cap) 
	{
		this.chairs_cap = chairs_cap;
	}

	public int getRoundTables_cap() 
	{
		return roundtables_cap;
	}

	public void setRoundTables_cap(int roundtables_cap)
	{
		this.roundtables_cap = roundtables_cap;
	}

	public int setEightFootTable_cap()
	{
		return eightfoottable_cap;
	}

	public void setEightFootTable_cap(int eightfoottable_cap) 
	{
		this.eightfoottable_cap = eightfoottable_cap;
	}

	public int getChairs() 
	{
		return chairs;
	}

	public void setChairs(int chairs) 
	{
		this.chairs = chairs;
	}

	public int getTables() 
	{
		return tables;
	}

	public void setTables(int tables) 
	{
		this.tables = tables;
	}
}
