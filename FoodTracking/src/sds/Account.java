package sds;
import java.io.*; 
import java.util.*; 
import java.lang.*;
public class Account {
	private String Username;
	private String Password; 
	private String AccountType;
	
	public boolean verifyuser(String U, String P)
	{
		
	//read from file or database
		if()
		{
		
		}
		else return false; 
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Administrator administrator;

	/** 
	* @return the administrator
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Administrator getAdministrator() {
		// begin-user-code
		return administrator;
		// end-user-code
	}

	/** 
	* @param administrator the administrator to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setAdministrator(Administrator administrator) {
		// begin-user-code
		this.administrator = administrator;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private DBMS dBMS;

	/** 
	* @return the dBMS
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public DBMS getdBMS() {
		// begin-user-code
		return dBMS;
		// end-user-code
	}

	/** 
	* @param dBMS the dBMS to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setdBMS(DBMS dBMS) {
		// begin-user-code
		this.dBMS = dBMS;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private User user;

	/** 
	* @return the user
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public User getUser() {
		// begin-user-code
		return user;
		// end-user-code
	}

	/** 
	* @param user the user to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setUser(User user) {
		// begin-user-code
		this.user = user;
		// end-user-code
	}
}
