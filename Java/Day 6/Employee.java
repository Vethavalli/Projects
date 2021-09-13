package com.source;

class Employee {
	int empid;
	String empname;
	String empaddress;
	
	public Employee()
	{
		
	}

	public Employee(int empid, String empname, String empaddress) {
		this.empid = empid;
		this.empname = empname;
		this.empaddress = empaddress;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e=(Employee) obj;
		if(this.empid==e.empid)
			return true;
		else
			return false;
	}
	
	

	@Override
	public String toString() {
		return empid+" "+empname+" "+empaddress;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee e=new Employee();
		this.empid=e.empid;
		this.empname=e.empname;
		this.empaddress=e.empaddress;
		return e;
	}
	

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Memory is getting deleted..");
	}

	public static void main(String[]args) throws CloneNotSupportedException
	{
		Employee e1=new Employee(12,"nithya","mdu");
		Employee e2=new Employee(14,"Jhansi","chn");
		System.out.println(e1.getClass());
		System.out.println(e1.hashCode());
		System.out.println(e1.equals(e2));
		Employee e3=e2;
		System.out.println(e2);
		System.out.println(e3);
		Employee e4=e1;
		
		e4=null;
		System.gc();
		System.out.println(e4);
		
	}
	
}