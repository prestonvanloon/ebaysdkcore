/*
Copyright (c) 2013 eBay, Inc.
This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent  version 
thereof released by eBay.  The then-current version of the License can be found 
at http://www.opensource.org/licenses/cddl1.php and in the eBaySDKLicense file that 
is under the eBay SDK ../docs directory.
*/

package com.ebay.sdk.attributes.model;

import org.w3c.dom.Document;

import com.ebay.sdk.SdkException;

/**
 * Defines object for integrated eBay attributes operation.
 * <br><br>
 * <a href="{@docRoot}/images/IAttributesMaster.jpg">View UML diagram of the class.</a>
 * <br>
 * <p>Title: AttributesLib for Java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
public interface IAttributesMaster {

  /**
   * Sets the IAttributesXslProvider object.
   * @return IAttributesXslProvider
   */
  IAttributesXslProvider getXslProvider();

  /**
   * Gets the IAttributesXslProvider object.
   * @param xslProdiver IAttributesXslProvider
   */
  void setXslProvider(IAttributesXslProvider xslProdiver)
      throws Exception;

  /**
   * Sets the IAttributesXmlProvider object.
   * @return IAttributesXmlProvider
   */
  IAttributesXmlProvider getXmlProvider();

  /**
   * Gets the IAttributesXmlProvider object.
   * @param xmlProvider IAttributesXmlProvider
   */
  void setXmlProvider(IAttributesXmlProvider xmlProvider)
      throws Exception;

  /**
   * Sets the ICategoryCSProvider object.
   * @return ICategoryCSProvider
   */
  ICategoryCSProvider getCategoryCSProvider();

  /**
   * Gets the ICategoryCSProvider object.
   * @param categoryCSProvider ICategoryCSProvider
   */
  void setCategoryCSProvider(ICategoryCSProvider categoryCSProvider);

  /**
   * Parse name value pair list to extract AttributeSet objects. This method is
   * typically used to parse the query string returned from form POST or GET.
   * @param nameValues java.util.Map The parameters map got from query string or post.
   * @return AttributeSet[]
   */
  AttributeSet[] nameValuesToAttributeSets(java.util.Map nameValues)
      throws SdkException, Exception;

  /**
   * Render HTML text by specifying list of AttributeSet.
   * @param attrSets AttributeSet[] List of AttributeSet objects.
   * @param errorList ErrorSet[] The list of ErrorSet objects returned by validate method.
   * @return String The generated HTML text that is encapsulated in HTML table element.
   */
  String renderHtml(AttributeSet[] attrSets, ErrorSet[] errorList)
      throws SdkException, Exception;

  /**
   * Render HTML text by specifying list of AttributeSet and xsl Document
   * @param attrSets AttributeSet[] List of AttributeSet objects.
   * @param xslDoc Document
   * @param errorList ErrorSet[] The list of ErrorSet objects returned by validate method.
   * @return String The generated HTML text that is encapsulated in HTML table element.
   */
  String renderHtml(AttributeSet[] attrSets, Document xslDoc, ErrorSet[] errorList) 
  	throws SdkException, Exception;

 /**
   * Render HTML text by raw name-value pairs that you got during HTML submit.
   * @param nameValues java.util.Map List of name-value pairs from submit of
   * attributes HTML form generated by all these RenderHtml methods.
   * @param errorList ErrorSet[] The list of ErrorSet objects returned by validate method.
   * @return String The generated HTML text that is encapsulated in HTML table element.
   */
  String renderHtmlForPostback(java.util.Map nameValues, ErrorSet[] errorList)
      throws SdkException, Exception;

  /**
   * Validate list of AttributeSet objects against eBay Attributes rules.
   * Returns zero size array means the validation succeeded.
   * Otherwise means failure and you have to call the above RenderHtml... methods
   * and pass in the ErrorSet list to re-generate Attributes HTML text that
   * contains all the error messages.
   * @param attrSets AttributeSet[] The list of AttributeSet object which you want to validate.
   * @return ErrorSet[] Returns zero-size array means the validation succeeded.
   * Otherwise the list of the ErrorSet objects.
   */
  ErrorSet[] validate(AttributeSet[] attrSets)
      throws SdkException, Exception;
  
  /**
   * Returns an array of item specific AttributeSet objects for an array category Ids.
   * Each element of the array contains a VCS Id, if it exists for a given category Id.
   * 
   * @param catIds int[]
   * @return AttributeSet[]
   */
  AttributeSet[] getItemSpecificAttributeSetsForCategories(int[] catIds) 
  	throws SdkException, Exception;

  /**
   * Returns an array of Site Wide AttributeSet objects for an array category Ids.
   * Each element of the array contains a VCS Id, if it exists for a given category Id.
   * 
  * @param catIds int[]
  * @return AttributeSet[]
  */
 AttributeSet[] getSiteWideAttributeSetsForCategories(int[] catIds) 
 	throws SdkException, Exception;

 /**
  * Extracts AttributeSet object for Return Policy from site wide attribute sets
  * @param siteWideAttrSets AttributeSet[] array of site wide AttributeSet objects.
  * @return AttributeSet for Return Policy
  * @see getSiteWideAttributeSetsForCategories()
  */
 AttributeSet getReturnPolicyAttributeSet(AttributeSet[] siteWideAttrSets) 
 	throws SdkException, Exception;

 /**
  * Creates an array AttributeSet objects which contains item specific attribute sets and
  * site wide attribute sets with the exception of the attribute set for return policy.
  * 
  * @param itemSpecAttrSets AttributeSet[]
  * @param swAttrSets AttributeSet[]
  * @return AttributeSet[]
  * @see getItemSpecificAttributeSetsForCategories()
  * @see getSiteWideAttributeSetsForCategories()
  */
 AttributeSet[] joinItemSpecificAndSiteWideAttributeSets(AttributeSet[] itemSpecAttrSets, AttributeSet[] swAttrSets) 
 	throws Exception;
 
}
