/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test.model.entities;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class UserImpl extends EntityImpl {
  public static final int USERID = 0;
  public static final int USERROLE = 1;
  public static final int EMAIL = 2;
  public static final int FIRSTNAME = 3;
  public static final int LASTNAME = 4;
  public static final int STREETADDRESS = 5;
  public static final int CITY = 6;
  public static final int STATEPROVINCE = 7;
  public static final int POSTALCODE = 8;
  public static final int COUNTRYID = 9;
  public static final int EXPERTISEAREA = 10;
  private static EntityDefImpl mDefinitionObject;

  /**This is the default constructor (do not remove)
   */
  public UserImpl() {
  }

  /**Retrieves the definition object for this instance class.
   */
  public static synchronized EntityDefImpl getDefinitionObject() {
    if (mDefinitionObject == null) {
      mDefinitionObject = (EntityDefImpl)EntityDefImpl.findDefObject("test.model.entities.User");
    }
    return mDefinitionObject;
  }

  /**Gets the attribute value for UserId, using the alias name UserId
   */
  public Number getUserId() {
    return (Number)getAttributeInternal(USERID);
  }

  /**Sets <code>value</code> as the attribute value for UserId
   */
  public void setUserId(Number value) {
    setAttributeInternal(USERID, value);
  }

  /**Gets the attribute value for UserRole, using the alias name UserRole
   */
  public String getUserRole() {
    return (String)getAttributeInternal(USERROLE);
  }

  /**Sets <code>value</code> as the attribute value for UserRole
   */
  public void setUserRole(String value) {
    setAttributeInternal(USERROLE, value);
  }

  /**Gets the attribute value for Email, using the alias name Email
   */
  public String getEmail() {
    return (String)getAttributeInternal(EMAIL);
  }

  /**Sets <code>value</code> as the attribute value for Email
   */
  public void setEmail(String value) {
    setAttributeInternal(EMAIL, value);
  }

  /**Gets the attribute value for FirstName, using the alias name FirstName
   */
  public String getFirstName() {
    return (String)getAttributeInternal(FIRSTNAME);
  }

  /**Sets <code>value</code> as the attribute value for FirstName
   */
  public void setFirstName(String value) {
    setAttributeInternal(FIRSTNAME, value);
  }

  /**Gets the attribute value for LastName, using the alias name LastName
   */
  public String getLastName() {
    return (String)getAttributeInternal(LASTNAME);
  }

  /**Sets <code>value</code> as the attribute value for LastName
   */
  public void setLastName(String value) {
    setAttributeInternal(LASTNAME, value);
  }

  /**Gets the attribute value for StreetAddress, using the alias name StreetAddress
   */
  public String getStreetAddress() {
    return (String)getAttributeInternal(STREETADDRESS);
  }

  /**Sets <code>value</code> as the attribute value for StreetAddress
   */
  public void setStreetAddress(String value) {
    setAttributeInternal(STREETADDRESS, value);
  }

  /**Gets the attribute value for City, using the alias name City
   */
  public String getCity() {
    return (String)getAttributeInternal(CITY);
  }

  /**Sets <code>value</code> as the attribute value for City
   */
  public void setCity(String value) {
    setAttributeInternal(CITY, value);
  }

  /**Gets the attribute value for StateProvince, using the alias name StateProvince
   */
  public String getStateProvince() {
    return (String)getAttributeInternal(STATEPROVINCE);
  }

  /**Sets <code>value</code> as the attribute value for StateProvince
   */
  public void setStateProvince(String value) {
    setAttributeInternal(STATEPROVINCE, value);
  }

  /**Gets the attribute value for PostalCode, using the alias name PostalCode
   */
  public String getPostalCode() {
    return (String)getAttributeInternal(POSTALCODE);
  }

  /**Sets <code>value</code> as the attribute value for PostalCode
   */
  public void setPostalCode(String value) {
    setAttributeInternal(POSTALCODE, value);
  }

  /**Gets the attribute value for CountryId, using the alias name CountryId
   */
  public String getCountryId() {
    return (String)getAttributeInternal(COUNTRYID);
  }

  /**Sets <code>value</code> as the attribute value for CountryId
   */
  public void setCountryId(String value) {
    setAttributeInternal(COUNTRYID, value);
  }

  /**getAttrInvokeAccessor: generated method. Do not modify.
   */
  protected Object getAttrInvokeAccessor(int index, 
                                         AttributeDefImpl attrDef) throws Exception {
    switch (index) {
    case USERID:
      return getUserId();
    case USERROLE:
      return getUserRole();
    case EMAIL:
      return getEmail();
    case FIRSTNAME:
      return getFirstName();
    case LASTNAME:
      return getLastName();
    case STREETADDRESS:
      return getStreetAddress();
    case CITY:
      return getCity();
    case STATEPROVINCE:
      return getStateProvince();
    case POSTALCODE:
      return getPostalCode();
    case COUNTRYID:
      return getCountryId();
    case EXPERTISEAREA:
      return getExpertiseArea();
    default:
      return super.getAttrInvokeAccessor(index, attrDef);
    }
  }

  /**setAttrInvokeAccessor: generated method. Do not modify.
   */
  protected void setAttrInvokeAccessor(int index, Object value, 
                                       AttributeDefImpl attrDef) throws Exception {
    switch (index) {
    case USERID:
      setUserId((Number)value);
      return;
    case USERROLE:
      setUserRole((String)value);
      return;
    case EMAIL:
      setEmail((String)value);
      return;
    case FIRSTNAME:
      setFirstName((String)value);
      return;
    case LASTNAME:
      setLastName((String)value);
      return;
    case STREETADDRESS:
      setStreetAddress((String)value);
      return;
    case CITY:
      setCity((String)value);
      return;
    case STATEPROVINCE:
      setStateProvince((String)value);
      return;
    case POSTALCODE:
      setPostalCode((String)value);
      return;
    case COUNTRYID:
      setCountryId((String)value);
      return;
    default:
      super.setAttrInvokeAccessor(index, value, attrDef);
      return;
    }
  }

  /**Gets the associated entity oracle.jbo.RowIterator
   */
  public RowIterator getExpertiseArea() {
    return (RowIterator)getAttributeInternal(EXPERTISEAREA);
  }

  /**Creates a Key object based on given key constituents
   */
  public static Key createPrimaryKey(Number userId) {
    return new Key(new Object[]{userId});
  }
}