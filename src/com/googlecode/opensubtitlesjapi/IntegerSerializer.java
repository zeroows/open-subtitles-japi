/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.googlecode.opensubtitlesjapi;

import org.apache.xmlrpc.serializer.TypeSerializerImpl;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/**
 *
 * @author Daniele Belletti
 */
public class IntegerSerializer extends TypeSerializerImpl {

  public IntegerSerializer() {
    super();
  }

  public void write(ContentHandler pHandler, Object pObject) throws SAXException {
    Integer i = (Integer) pObject;
    write(pHandler, "int", i.toString());
  }
}
