package com.example.saml.userdetails;

import java.util.ArrayList;
import java.util.List;

import org.opensaml.saml2.core.impl.AssertionMarshaller;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.saml.SAMLCredential;
import org.springframework.security.saml.userdetails.SAMLUserDetailsService;

public class EmailUserDetails implements SAMLUserDetailsService {
	AssertionMarshaller marshaller = new AssertionMarshaller();

	protected String getEmailAddress(SAMLCredential samlCredential) {
		// This works to pull the uid attribute value from http://www.testshib.org/
		// Given the raw value of
		// FriendlyName="uid" Name="urn:oid:0.9.2342.19200300.100.1.1" ...
		// String attrValue = samlCredential.getAttributeAsString("urn:oid:0.9.2342.19200300.100.1.1");
		String attrValue = samlCredential.getAttributeAsString("ADMail");
		if (attrValue == null) {
			throw new UsernameNotFoundException("ADMail not found from assertion");
		}
		return attrValue;
	}

	public Object loadUserBySAML(SAMLCredential samlCredential) throws UsernameNotFoundException {
		List<GrantedAuthority> authorities = new ArrayList<>(); // add in an empty list of roles
		return new User(this.getEmailAddress(samlCredential), "", true, true, true, true, authorities);
	}

}
