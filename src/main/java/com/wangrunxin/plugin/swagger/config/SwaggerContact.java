package com.wangrunxin.plugin.swagger.config;

import io.swagger.v3.oas.models.info.Contact;

import java.util.Collections;
import java.util.Map;

import org.apache.maven.plugins.annotations.Parameter;

/**
 * Configuring Swagger contact properties.
 */
public class SwaggerContact {

    /**
     * The identifying name of the contact person/organization.
     */
    @Parameter
    private String name;

    /**
     * The URL pointing to the contact information. MUST be in the format of a URL.
     */
    @Parameter
    private String url;

    /**
     * The email address of the contact person/organization. MUST be in the format of an email address.
     */
    @Parameter
    private String email;

    @Parameter
    private Map<String, Object> extensions = Collections.emptyMap();

    public Contact createContactModel() {
        Contact contact = new Contact();

        if (name != null) {
            contact.setName(name);
        }

        if (url != null) {
            contact.setUrl(url);
        }

        if (email != null) {
            contact.setEmail(email);
        }

        contact.setExtensions(extensions);

        return contact;
    }
}
