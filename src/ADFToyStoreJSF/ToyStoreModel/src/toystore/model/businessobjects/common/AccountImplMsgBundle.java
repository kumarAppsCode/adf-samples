/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
// $Header: /cvs/ADFToyStoreJSF/ToyStoreModel/src/toystore/model/businessobjects/common/AccountImplMsgBundle.java,v 1.1.1.1 2006/01/26 21:47:21 steve Exp $
package toystore.model.businessobjects.common;
import oracle.jbo.common.JboResourceBundle;
import toystore.fwk.exceptions.ErrorMessages;
//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------
public class AccountImplMsgBundle extends JboResourceBundle {
  static final Object[][] sMessageStrings = {
    { "Country_Rule_0", "Invalid country code" },
    {
      ErrorMessages.ENTITY_ALREADY_EXISTS,
      "Another user has already chosen this name. Please try another."
    },
    { "Addr1_LABEL", "Street Address" },
    { "Addr1_TOOLTIP", "Enter your street address" },
    { "City_LABEL", "City" },
    { "City_TOOLTIP", "Enter the name of the city in which you live" },
    { "Country_LABEL", "Country" },
    { "Country_TOOLTIP", "Enter your the country where you live" },
    { "Email_LABEL", "Email" },
    { "Email_TOOLTIP", "Enter your email address" },
    { "Firstname_LABEL", "First Name" },
    { "Firstname_TOOLTIP", "Enter your first name" },
    { "Lastname_LABEL", "Last Name" },
    { "Lastname_TOOLTIP", "Enter your last name" },
    { "Phone_LABEL", "Phone Number" },
    { "Phone_TOOLTIP", "Enter your phone number" },
    { "State_LABEL", "State" },
    { "State_TOOLTIP", "Enter the name of the state in which you live" },
    { "Userid_LABEL", "Username" },
    { "Userid_TOOLTIP", "Enter your username" },
    { "Zip_LABEL", "Postal Code" },
    { "Zip_TOOLTIP", "Enter your postal code" }
  };

  /**
   *
   * This is the default constructor (do not remove)
   */
  public AccountImplMsgBundle() {
  }

  /**
   *
   * @return an array of key-value pairs.
   */
  public Object[][] getContents() {
    return super.getMergedArray(sMessageStrings, super.getContents());
  }
}
