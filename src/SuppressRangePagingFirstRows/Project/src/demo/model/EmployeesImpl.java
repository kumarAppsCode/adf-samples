/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package demo.model;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Date;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---    Warning: Do not modify method signatures of generated methods.
//  ---------------------------------------------------------------------

public class EmployeesImpl extends EntityImpl  {
  public static final int EMPLOYEEID = 0;
  public static final int FIRSTNAME = 1;
  public static final int LASTNAME = 2;
  public static final int EMAIL = 3;
  public static final int PHONENUMBER = 4;
  public static final int HIREDATE = 5;
  public static final int JOBID = 6;
  public static final int SALARY = 7;
  public static final int COMMISSIONPCT = 8;
  public static final int MANAGERID = 9;
  public static final int DEPARTMENTID = 10;








  private static EntityDefImpl mDefinitionObject;

  /**
   * 
   *  This is the default constructor (do not remove)
   */
  public EmployeesImpl() {
  }

  /**
   * 
   *  Retrieves the definition object for this instance class.
   */
  public static synchronized EntityDefImpl getDefinitionObject() {
    if (mDefinitionObject == null) {
      mDefinitionObject = (EntityDefImpl)EntityDefImpl.findDefObject("demo.model.Employees");
    }
    return mDefinitionObject;
  }









  /**
   * 
   *  Gets the attribute value for EmployeeId, using the alias name EmployeeId
   */
  public Number getEmployeeId() {
    return (Number)getAttributeInternal(EMPLOYEEID);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for EmployeeId
   */
  public void setEmployeeId(Number value) {
    setAttributeInternal(EMPLOYEEID, value);
  }

  /**
   * 
   *  Gets the attribute value for FirstName, using the alias name FirstName
   */
  public String getFirstName() {
    return (String)getAttributeInternal(FIRSTNAME);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for FirstName
   */
  public void setFirstName(String value) {
    setAttributeInternal(FIRSTNAME, value);
  }

  /**
   * 
   *  Gets the attribute value for LastName, using the alias name LastName
   */
  public String getLastName() {
    return (String)getAttributeInternal(LASTNAME);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for LastName
   */
  public void setLastName(String value) {
    setAttributeInternal(LASTNAME, value);
  }

  /**
   * 
   *  Gets the attribute value for Email, using the alias name Email
   */
  public String getEmail() {
    return (String)getAttributeInternal(EMAIL);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Email
   */
  public void setEmail(String value) {
    setAttributeInternal(EMAIL, value);
  }

  /**
   * 
   *  Gets the attribute value for PhoneNumber, using the alias name PhoneNumber
   */
  public String getPhoneNumber() {
    return (String)getAttributeInternal(PHONENUMBER);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for PhoneNumber
   */
  public void setPhoneNumber(String value) {
    setAttributeInternal(PHONENUMBER, value);
  }

  /**
   * 
   *  Gets the attribute value for HireDate, using the alias name HireDate
   */
  public Date getHireDate() {
    return (Date)getAttributeInternal(HIREDATE);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for HireDate
   */
  public void setHireDate(Date value) {
    setAttributeInternal(HIREDATE, value);
  }

  /**
   * 
   *  Gets the attribute value for JobId, using the alias name JobId
   */
  public String getJobId() {
    return (String)getAttributeInternal(JOBID);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for JobId
   */
  public void setJobId(String value) {
    setAttributeInternal(JOBID, value);
  }

  /**
   * 
   *  Gets the attribute value for Salary, using the alias name Salary
   */
  public Number getSalary() {
    return (Number)getAttributeInternal(SALARY);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for Salary
   */
  public void setSalary(Number value) {
    setAttributeInternal(SALARY, value);
  }

  /**
   * 
   *  Gets the attribute value for CommissionPct, using the alias name CommissionPct
   */
  public Number getCommissionPct() {
    return (Number)getAttributeInternal(COMMISSIONPCT);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for CommissionPct
   */
  public void setCommissionPct(Number value) {
    setAttributeInternal(COMMISSIONPCT, value);
  }

  /**
   * 
   *  Gets the attribute value for ManagerId, using the alias name ManagerId
   */
  public Number getManagerId() {
    return (Number)getAttributeInternal(MANAGERID);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for ManagerId
   */
  public void setManagerId(Number value) {
    setAttributeInternal(MANAGERID, value);
  }

  /**
   * 
   *  Gets the attribute value for DepartmentId, using the alias name DepartmentId
   */
  public Number getDepartmentId() {
    return (Number)getAttributeInternal(DEPARTMENTID);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for DepartmentId
   */
  public void setDepartmentId(Number value) {
    setAttributeInternal(DEPARTMENTID, value);
  }

  /**
   * 
   *  getAttrInvokeAccessor: generated method. Do not modify.
   */
  protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
    switch (index)
      {
      case EMPLOYEEID:
        return getEmployeeId();
      case FIRSTNAME:
        return getFirstName();
      case LASTNAME:
        return getLastName();
      case EMAIL:
        return getEmail();
      case PHONENUMBER:
        return getPhoneNumber();
      case HIREDATE:
        return getHireDate();
      case JOBID:
        return getJobId();
      case SALARY:
        return getSalary();
      case COMMISSIONPCT:
        return getCommissionPct();
      case MANAGERID:
        return getManagerId();
      case DEPARTMENTID:
        return getDepartmentId();
      default:
        return super.getAttrInvokeAccessor(index, attrDef);
      }
  }

  /**
   * 
   *  setAttrInvokeAccessor: generated method. Do not modify.
   */
  protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
    switch (index)
      {
      case EMPLOYEEID:
        setEmployeeId((Number)value);
        return;
      case FIRSTNAME:
        setFirstName((String)value);
        return;
      case LASTNAME:
        setLastName((String)value);
        return;
      case EMAIL:
        setEmail((String)value);
        return;
      case PHONENUMBER:
        setPhoneNumber((String)value);
        return;
      case HIREDATE:
        setHireDate((Date)value);
        return;
      case JOBID:
        setJobId((String)value);
        return;
      case SALARY:
        setSalary((Number)value);
        return;
      case COMMISSIONPCT:
        setCommissionPct((Number)value);
        return;
      case MANAGERID:
        setManagerId((Number)value);
        return;
      case DEPARTMENTID:
        setDepartmentId((Number)value);
        return;
      default:
        super.setAttrInvokeAccessor(index, value, attrDef);
        return;
      }
  }

  /**
   * 
   *  Creates a Key object based on given key constituents
   */
  public static Key createPrimaryKey(Number employeeId) {
    return new Key(new Object[] {employeeId});
  }













}
