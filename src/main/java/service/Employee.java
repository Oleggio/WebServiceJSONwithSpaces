package service;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {

	private final long   employeeId;
	private final String firstName;
	private final String middleName;
	private final String lastName;
	private final String displayName;
	private final String initials;
	private final String birthDate;
	private final String joiningDate;
	private final String modifiedDate;
	private final String email;
	private final String gender;
	private final long   departmentId;
	private final String companyCode;
	private final String userName;
	private final long   certificateID;
	private final String certificateImage;
	private final String addressList;
	private final String phoneList;
	private final String operationType;	

	public Employee(long employeeId, String firstName, String middleName, String lastName, String displayName,
			String initials, String birthDate, String joiningDate, String modifiedDate, String email, String gender,
			long departmentId, String companyCode, String userName, long certificateID, String certificateImage,
			String addressList, String phoneList, String operationType) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.displayName = displayName;
		this.initials = initials;
		this.birthDate = birthDate;
		this.joiningDate = joiningDate;
		this.modifiedDate = modifiedDate;
		this.email = email;
		this.gender = gender;
		this.departmentId = departmentId;
		this.companyCode = companyCode;
		this.userName = userName;
		this.certificateID = certificateID;
		this.certificateImage = certificateImage;
		this.addressList = addressList;
		this.phoneList = phoneList;
		this.operationType = operationType;
	}


	public long getEmployeeId() {
		return employeeId;
	}
	

	@JsonProperty("First Name")
	public String getFirstName() {
		return firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public String getLastName() {
		return lastName;
	}


	@JsonProperty("Display Name")
	public String getDisplayName() {
		return displayName;
	}


	public String getInitials() {
		return initials;
	}


	public String getBirthDate() {
		return birthDate;
	}


	public String getJoiningDate() {
		return joiningDate;
	}


	public String getModifiedDate() {
		return modifiedDate;
	}


	public String getEmail() {
		return email;
	}


	public String getGender() {
		return gender;
	}


	public long getDepartmentId() {
		return departmentId;
	}


	public String getCompanyCode() {
		return companyCode;
	}


	public String getUserName() {
		return userName;
	}


	public long getCertificateID() {
		return certificateID;
	}


	public String getCertificateImage() {
		return certificateImage;
	}


	public String getAddressList() {
		return addressList;
	}


	public String getPhoneList() {
		return phoneList;
	}


	public String getOperationType() {
		return operationType;
	}
	
	
}
