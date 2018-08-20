import java.util.*;
class Date implements Cloneable
{
	int dMonth;
	int dDay;
	int dYear;
	Date(){}
	Date(int x,int y,int z)
	{
		dMonth=x;
		dDay=y;
		dYear=z;
	}
	void setDate(int x,int y,int z)
	{
                dMonth=x;
                dDay=y;
                dYear=z;
        }
	public String toString()
	{
		return "dMonth="+dMonth+",dDay="+dDay+",dYear="+dYear;
	}
	int getMonth()
	{
		return dMonth;
	}
	int getDay()
	{
		return dDay;
	}
	int getYear()
	{
		return dYear;
	}
	public Object clone() throws CloneNotSupportedException
	{
	return super.clone();
	}
}
class Person implements Cloneable
{
	String firstName;
	String lastName;
	Person(){}
	Person(String s1, String s2)
	{
		firstName=s1;
		lastName=s2;		
	}
	public String toString()
	{
		return "firstName="+firstName+"lastName="+lastName;
	}
	void setName(String s1, String s2)
	{
		firstName=s1;
                lastName=s2;
	}
	String getFirstName()
	{
		return(firstName);
	}
	String getLastName()
        {
                return(lastName);
        }
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

}
class PersonalInfo implements Cloneable, Comparable<PersonalInfo>
{
	Person name;
	Date bDay;
	int personID;
	PersonalInfo()
	{}
	PersonalInfo(String s1,String s2, int w,int x,int y,int z)
	{
		name=new Person(s1,s2);
		bDay= new Date(w,x,y);
		personID=z;
	
	}
	void setPersonalInfo(String s1,String s2, int w,int x,int y,int z)
	{

	}
	public String toString()
	{
		return "Name="+name.firstName+", personID="+personID;
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	public int compareTo(PersonalInfo p)
	{
		return this.personID>p.personID?1:this.personID<p.personID?-1:0;
	}
	public boolean equals(PersonalInfo p)
	{
		if(p.personID==this.personID)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

}
class Main
{
	public static void main(String arg[]) throws CloneNotSupportedException
	{
		List<PersonalInfo> l=new ArrayList<>();
		l.add(new PersonalInfo("Nitesh", "Mittal",6,24,2018,1));
		l.add(new PersonalInfo("Nit", "Mit",1,2,2019,3));
		l.add(new PersonalInfo("himangshu", "barman",2,13,2017,12));
		Collections.sort(l);
		for(PersonalInfo lis:l)
		{
			System.out.println(lis);
		}

	
	PersonalInfo p=new PersonalInfo("Nitesh", "Mittal",6,24,2018,1);
//	try
//	{
		PersonalInfo c=(PersonalInfo)p.clone();
//	}
//	catch(CloneNotSupportedException ss)
//	{
//		System.out.println(ss);
//	}
	System.out.println("clone()"+c);
	boolean b=p.equals(c);
	System.out.println("equals="+b);
	
}
}
